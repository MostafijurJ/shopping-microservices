package com.learn.productservices.service;

import com.learn.productservices.data.ProductDetails;
import com.learn.productservices.domain.Inventory;
import com.learn.productservices.domain.Price;
import com.learn.productservices.domain.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/22/21
 */
@Service
public class ProductService {

  private final ProductDetails productDetails;
  private final RestTemplate template;

  public ProductService(ProductDetails productDetails, RestTemplate template) {
    this.productDetails = productDetails;
    this.template = template;
  }

  public Product getProductDetailsById(int id) {
    var pd = productDetails.getProductInfoList(id);
    Price price = new Price();
    Inventory inventory = new Inventory();

    try {
       price = template.getForObject("http://localhost:8081/price/" + id, Price.class);
       inventory =
          template.getForObject("http://localhost:8082/inventory/" + id, Inventory.class);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return new Product(
        pd.getId(),
        pd.getName(),
        pd.getDescription(),
        price.getOriginalPrice(),
        inventory.isAvailable());
  }

  public List<Product> getProductDetails() {
    return null;
  }
}

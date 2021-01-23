package com.learn.productservices.service;

import com.learn.productservices.domain.Product;
import com.learn.productservices.data.ProductDetails;
import org.springframework.stereotype.Service;

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

  public ProductService(ProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public Product getProductDetailsById(int id) {
    var pd = productDetails.getProductInfoList(id);
    return new Product(pd.getId(), pd.getName(), pd.getDescription(), 145, true);
  }

  public List<Product> getProductDetails() {
    return null;
  }
}

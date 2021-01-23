package com.learn.productservices.data;

import com.learn.productservices.domain.ProductInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/22/21
 */
@Component
public class ProductDetails {

  public List<ProductInfo> productInfoList = new ArrayList<>();

  public ProductInfo getProductInfoList(int id) {
    setData();
    for (ProductInfo productInfo : setData()) {
      if (productInfo.getId() == id) {
        return productInfo;
      }
    }
    return null;
  }

  public List<ProductInfo> setData() {
    productInfoList.add(new ProductInfo(101, "T-shirt", "This looks fine"));
    productInfoList.add(new ProductInfo(102, "Huddy", "Full Slave huddies are most attractive"));
    productInfoList.add(new ProductInfo(103, "Shirt", "Full Slave Shirts are most attractive"));
    return productInfoList;
  }
}

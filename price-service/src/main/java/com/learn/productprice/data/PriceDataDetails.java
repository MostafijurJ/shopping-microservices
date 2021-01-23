package com.learn.productprice.data;

import com.learn.productprice.domain.Price;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/23/21
 */
@Component
public class PriceDataDetails {

  public List<Price> priceList = new ArrayList<>();

  public Price getPriceList(int productId) {
    setData();
    for (Price priceInfo : setData()) {
      if (priceInfo.getProductId() == productId) {
        return priceInfo;
      }
    }
    return null;
  }

  public List<Price> setData() {
    priceList.add(new Price(101, 101, 121, 100));
    priceList.add(new Price(102, 102, 300, 250));
    priceList.add(new Price(103, 103, 5000, 444));
    return priceList;
  }
}

package com.learn.productprice.service;

import com.learn.productprice.data.PriceDataDetails;
import com.learn.productprice.domain.Price;
import org.springframework.stereotype.Service;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/23/21
 */
@Service
public class PriceService {

  private final PriceDataDetails priceDataDetails;

  public PriceService(PriceDataDetails priceDataDetails) {
    this.priceDataDetails = priceDataDetails;
  }

  public Price getPriceByProduct(int productDd) {
    return priceDataDetails.getPriceList(productDd);
  }
}

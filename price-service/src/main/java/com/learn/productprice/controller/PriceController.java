package com.learn.productprice.controller;

import com.learn.productprice.domain.Price;
import com.learn.productprice.service.PriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/23/21
 */
@RestController
public class PriceController {
  private final PriceService priceService;

  public PriceController(PriceService priceService) {
    this.priceService = priceService;
  }

  @GetMapping("/price/{productId}")
  private Price getPriceByProduct(@PathVariable("productId") int productId) {
    return priceService.getPriceByProduct(productId);
  }
}

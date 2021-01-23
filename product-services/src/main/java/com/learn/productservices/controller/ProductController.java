package com.learn.productservices.controller;

import com.learn.productservices.service.ProductService;
import com.learn.productservices.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/22/21
 */
@RestController
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product/{id}")
  private Product getProductDetailsById(@PathVariable("id") int id) {
    return productService.getProductDetailsById(id);
  }

  @GetMapping("/product/")
  private List<Product> getProductDetails() {
    return productService.getProductDetails();
  }
}

package com.learn.productservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/22/21
 */
@AllArgsConstructor
@Getter
@Setter
public class ProductInfo {
  private int id;
  private String name;
  private String description;
}

package com.learn.productservices.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/22/21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
  private int id;
  private String name;
  private String description;
  private Integer price;
  private boolean availability;
}

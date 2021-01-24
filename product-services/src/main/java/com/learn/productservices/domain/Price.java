package com.learn.productservices.domain;

import lombok.*;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/23/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Price {
  private int id;
  private int productId;
  private int originalPrice;
  private int discountPrice;
}

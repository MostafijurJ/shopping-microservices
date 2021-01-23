package com.learn.inventoryservice.domain;

import lombok.*;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/24/21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Inventory {
  private int id;
  private int productId;
  private boolean isAvailable;
}

package com.learn.inventoryservice.service;

import com.learn.inventoryservice.data.InventoryDataDetails;
import com.learn.inventoryservice.domain.Inventory;
import org.springframework.stereotype.Service;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/24/21
 */
@Service
public class InventoryService {
  private final InventoryDataDetails inventoryDataDetails;

  public InventoryService(InventoryDataDetails inventoryDataDetails) {
    this.inventoryDataDetails = inventoryDataDetails;
  }

  public Inventory getInventory(int productId) {
    return inventoryDataDetails.getInventoryByProduct(productId);
  }
}

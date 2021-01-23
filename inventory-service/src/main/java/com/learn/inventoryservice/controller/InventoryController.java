package com.learn.inventoryservice.controller;

import com.learn.inventoryservice.domain.Inventory;
import com.learn.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/24/21
 */
@RestController
public class InventoryController {
  private final InventoryService inventoryService;

  public InventoryController(InventoryService inventoryService) {
    this.inventoryService = inventoryService;
  }

  @GetMapping("/inventory/{productId}")
  private Inventory getInventoryByProduct(@PathVariable("productId") int productId) {
    return inventoryService.getInventory(productId);
  }
}

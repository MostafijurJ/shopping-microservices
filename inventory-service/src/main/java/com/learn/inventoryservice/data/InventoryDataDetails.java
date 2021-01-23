package com.learn.inventoryservice.data;

import com.learn.inventoryservice.domain.Inventory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsibility:
 *
 * @author Mostafijur Rahman
 * @since 1/24/21
 */
@Component
public class InventoryDataDetails {
  List<Inventory> inventoryList = new ArrayList<>();

  public Inventory getInventoryByProduct(int productId) {
    setInventoryList();
    for (Inventory inventory : inventoryList) {
      if (inventory.getProductId() == productId) {
        return inventory;
      } else {
        return null;
      }
    }
    return null;
  }

  private void setInventoryList() {
    inventoryList.add(new Inventory(101, 101, true));
    inventoryList.add(new Inventory(102, 102, false));
    inventoryList.add(new Inventory(103, 103, false));
  }
}

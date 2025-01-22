package com.gildedrose;

public interface InventoryItem {
    InventoryItem updateQuality();
    InventoryItem updateDaysTillExpiration();
    InventoryItem handleExpired();
}

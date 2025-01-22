package com.gildedrose;

public interface InventoryItem {

    Item item = null;

    //    public void updateInventory() {
//        updateQuality();
//        updateDaysTillExpiration();
//
//        if (item.sellIn < 0) {
//            handleExpired();
//        }
//    }

    InventoryItem updateQuality();
    InventoryItem updateDaysTillExpiration();
    InventoryItem handleExpired();
}

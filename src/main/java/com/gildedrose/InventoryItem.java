package com.gildedrose;

public class InventoryItem {

    Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public void updateInventory() {
        updateQuality();
        updateDaysTillExpiration();

        if (item.sellIn < 0) {
            handleExpired();
        }
    }

    protected void updateQuality() {
        item.quality = Math.max(item.quality - 1, 0);
    }

    protected void updateDaysTillExpiration() {
        item.sellIn -= 1;
    }

    protected void handleExpired() {
        item.quality = Math.max(item.quality - 2, 0);
    }
}

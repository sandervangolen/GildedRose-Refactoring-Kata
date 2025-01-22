package com.gildedrose;

public class AgedBrieInventoryItem implements InventoryItem {

    Item item;

    public AgedBrieInventoryItem(Item item) {
        this.item = item;
    }

    @Override
    public InventoryItem updateQuality() {
        item.quality = Math.min(item.quality + 1, 50);
        return this;
    }

    @Override
    public InventoryItem updateDaysTillExpiration() {
        item.sellIn -= 1;
        return this;
    }

    @Override
    public InventoryItem handleExpired() {
        if (item.sellIn < 0) {
            item.quality = Math.min(item.quality + 1, 50);
        }
        return this;
    }
}

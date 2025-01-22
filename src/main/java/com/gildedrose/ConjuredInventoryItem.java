package com.gildedrose;

public class ConjuredInventoryItem implements InventoryItem {

    Item item;

    public ConjuredInventoryItem(Item item) {
        this.item = item;
    }

    @Override
    public InventoryItem updateQuality() {
        item.quality = Math.max(item.quality - 2, 0);
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
            item.quality = Math.max(item.quality - 2, 0);
        }
        return this;
    }
}

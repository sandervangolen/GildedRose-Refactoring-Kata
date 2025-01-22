package com.gildedrose;

public class DefaultInventoryItem implements InventoryItem {

    Item item;

    public DefaultInventoryItem(Item item) {
        this.item = item;
    }

    public InventoryItem updateQuality() {
        item.quality = Math.max(item.quality - 1, 0);
        return this;
    }

    public InventoryItem updateDaysTillExpiration() {
        item.sellIn -= 1;
        return this;
    }

    public InventoryItem handleExpired() {
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality - 2, 0);
        }
        return this;
    }
}

package com.gildedrose;

public class BackstagePassesInventoryItem implements InventoryItem {

    Item item;

    public BackstagePassesInventoryItem(Item item) {
        this.item = item;
    }

    @Override
    public InventoryItem updateQuality() {
        if (item.sellIn <= 5) {
            item.quality = Math.min(item.quality + 3, 50);
        } else if (item.sellIn <= 10) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
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
            item.quality = 0;
        }
        return this;
    }
}

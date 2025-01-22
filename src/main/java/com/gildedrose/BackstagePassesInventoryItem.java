package com.gildedrose;

public class BackstagePassesInventoryItem extends InventoryItem {
    public BackstagePassesInventoryItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (item.sellIn <= 5) {
            item.quality = Math.min(item.quality + 3, 50);
        } else if (item.sellIn <= 10) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
    }

    @Override
    protected void handleExpired() {
        item.quality = 0;
    }
}

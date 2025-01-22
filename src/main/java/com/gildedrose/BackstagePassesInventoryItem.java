package com.gildedrose;

public class BackstagePassesInventoryItem extends InventoryItem {
    public BackstagePassesInventoryItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.quality = Math.min(item.quality + 1, 50);

        if (item.sellIn < 11) {
            item.quality = Math.min(item.quality + 1, 50);
        }

        if (item.sellIn < 6) {
            item.quality = Math.min(item.quality + 1, 50);
        }
    }

    @Override
    protected void handleExpired() {
        item.quality = 0;
    }
}

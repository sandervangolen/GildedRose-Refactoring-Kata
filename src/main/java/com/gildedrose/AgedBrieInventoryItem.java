package com.gildedrose;

public class AgedBrieInventoryItem extends InventoryItem {
    public AgedBrieInventoryItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality = Math.min(item.quality + 1, 50);
    }

    @Override
    protected void handleExpired() {
        item.quality = Math.min(item.quality + 1, 50);
    }
}

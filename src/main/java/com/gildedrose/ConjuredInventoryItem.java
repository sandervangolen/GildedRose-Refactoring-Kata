package com.gildedrose;

public class ConjuredInventoryItem extends InventoryItem {
    public ConjuredInventoryItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality = Math.max(item.quality - 2, 0);
    }
}

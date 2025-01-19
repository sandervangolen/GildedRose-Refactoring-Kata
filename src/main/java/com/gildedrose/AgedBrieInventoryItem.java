package com.gildedrose;

public class AgedBrieInventoryItem extends InventoryItem {
    public AgedBrieInventoryItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    @Override
    protected void sellInExpired() {
        if (item.sellIn < 0) {
            item.quality = Math.min(item.quality+1, 50);
        }
    }
}

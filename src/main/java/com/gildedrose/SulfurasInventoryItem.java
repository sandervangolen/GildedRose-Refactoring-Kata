package com.gildedrose;

public class SulfurasInventoryItem extends InventoryItem {
    public SulfurasInventoryItem(Item item) {
        super(item);
        item.quality = 80;
    }

    @Override
    public void updateQuality() {
        // do nothing
    }

    @Override
    public void updateSellIn() {
        // do nothing
    }

    @Override
    protected void sellInExpired() {
        // do nothing
    }
}

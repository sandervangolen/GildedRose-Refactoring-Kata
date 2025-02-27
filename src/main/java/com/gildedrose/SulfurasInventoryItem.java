package com.gildedrose;

public class SulfurasInventoryItem implements InventoryItem {

    Item item;
    public SulfurasInventoryItem(Item item) {
        this.item = item;
        item.quality = 80;
    }

    @Override
    public InventoryItem updateQuality() {
        // do nothing
        return this;
    }

    @Override
    public InventoryItem updateDaysTillExpiration() {
        // do nothing
        return this;
    }

    @Override
    public InventoryItem handleExpired() {
        // do nothing
        return this;
    }
}

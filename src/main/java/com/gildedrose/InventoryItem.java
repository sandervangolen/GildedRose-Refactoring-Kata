package com.gildedrose;

public class InventoryItem {

    Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public void update() {
        updateQuality();
        updateSellIn();
        sellInExpired();
    }

    protected void updateQuality() {
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 1;
        }
    }

    protected void updateSellIn() {
        item.sellIn -= 1;
    }

    protected void sellInExpired() {
        item.quality = Math.max(item.quality-1, 0);
    }
}

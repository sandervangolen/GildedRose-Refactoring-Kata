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
        item.quality = Math.max(item.quality-1, 0);
    }

    protected void updateSellIn() {
        item.sellIn -= 1;
    }

    protected void sellInExpired() {
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality-1, 0);
        }
    }
}

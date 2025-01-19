package com.gildedrose;

public class InventoryItem {

    Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public void update() {
        item.sellIn -= 1;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 1;
        }
    }
}

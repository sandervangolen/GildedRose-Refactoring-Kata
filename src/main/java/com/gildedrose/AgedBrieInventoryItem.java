package com.gildedrose;

public class AgedBrieInventoryItem extends InventoryItem {
    public AgedBrieInventoryItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.sellIn--;

        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 0) {
                item.quality++;
            }
        }
    }
}

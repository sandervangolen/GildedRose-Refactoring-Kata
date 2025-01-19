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

        item.sellIn--;

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality++;
            }
        }
    }

}

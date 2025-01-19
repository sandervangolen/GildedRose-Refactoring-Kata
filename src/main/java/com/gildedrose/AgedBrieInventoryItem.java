package com.gildedrose;

public class AgedBrieInventoryItem extends InventoryItem {
    public AgedBrieInventoryItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn--;

        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 0) {
                item.quality++;
            }
        }

        if (item.quality < 50) {
        if (item.sellIn < 0) {

                item.quality += 1;
            }
        }
    }
}

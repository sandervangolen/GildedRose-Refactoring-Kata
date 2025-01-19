package com.gildedrose;

public class InventoryItem {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item item;

    public InventoryItem(Item item) {
        this.item = item;
    }

    public static InventoryItem create(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieInventoryItem(item);
            case BACKSTAGE_PASSES:
                return new BackstagePassesInventoryItem(item);
            case SULFURAS:
                return new SulfurasInventoryItem(item);
            default:
                return new InventoryItem(item);
        }
    }

    public void updateQuality() {
        item.sellIn -= 1;

        if (item.sellIn < 0) {
            if (!item.name.equals(AGED_BRIE)) {
                if (!item.name.equals(BACKSTAGE_PASSES)) {
                    if (item.quality > 0) {
                        if (!item.name.equals(SULFURAS)) {
                            item.quality -= 1;
                        }
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality += 1;
                }
            }
        }
    }
}

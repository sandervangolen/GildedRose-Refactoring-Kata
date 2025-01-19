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
        return new InventoryItem(item);
    }

    public void updateQuality() {
        if (item.name.equals(AGED_BRIE) || item.name.equals(BACKSTAGE_PASSES)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.name.equals(BACKSTAGE_PASSES)) {
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality += 1;
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality += 1;
                        }
                    }
                }
            }
        } else {
            if (!item.name.equals(SULFURAS)) {
                if (item.quality > 0) {
                    item.quality -= 1;
                }
            }
        }

        if (!item.name.equals(SULFURAS)) {
            item.sellIn -= 1;
        }

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

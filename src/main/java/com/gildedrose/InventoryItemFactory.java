package com.gildedrose;

public class InventoryItemFactory {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

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
}

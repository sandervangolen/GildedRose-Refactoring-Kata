package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    public void qualityIncreases() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.update();

        Item agedBrie = app.items[0];
        assertEquals("Aged Brie", agedBrie.name);
        assertEquals(21, agedBrie.quality);
        assertEquals(9, agedBrie.sellIn);
    }

    @Test
    public void qualityNeverGoesOver50() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50) };
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 60; i++) {
            app.update();
        }

        assertEquals(50, app.items[0].quality);
        assertEquals(-50, app.items[0].sellIn);
    }
}

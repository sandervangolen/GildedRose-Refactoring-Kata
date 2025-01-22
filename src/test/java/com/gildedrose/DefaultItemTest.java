package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultItemTest {

    @Test
    void qualityNeverNegative() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void qualityDecreases() {
        Item[] items = new Item[] { new Item("bar", 10, 5) };
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals("bar", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void qualityDecreasesTwiceAsFastAfterSellInDateHasPassed() {
        Item[] items = new Item[] { new Item("bar", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }
}

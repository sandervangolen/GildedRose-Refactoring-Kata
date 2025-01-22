package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest {

    @Test
    public void degradesTwiceAsFast() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.update();

        Item conjured = app.items[0];
        assertEquals("Conjured Mana Cake", conjured.name);
        assertEquals(18, conjured.quality);
        assertEquals(9, conjured.sellIn);
    }

    @Test
    public void degradesFourTimesAsFastWhenSellInIsNegative() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.update();

        Item conjured = app.items[0];
        assertEquals("Conjured Mana Cake", conjured.name);
        assertEquals(16, conjured.quality);
        assertEquals(-1, conjured.sellIn);
    }
}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest {

    @Test
    public void degradesTwiceAsFast() {
        Item[] items = new Item[] { new Item("Conjured", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.update();

        Item conjured = app.items[0];
        assertEquals("Conjured", conjured.name);
        assertEquals(18, conjured.quality);
        assertEquals(9, conjured.sellIn);
    }
}

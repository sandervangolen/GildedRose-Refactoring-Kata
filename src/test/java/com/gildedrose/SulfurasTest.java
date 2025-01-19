package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    public void sulfurasSellInAndQualityNeverChange() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.update();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
    }
}

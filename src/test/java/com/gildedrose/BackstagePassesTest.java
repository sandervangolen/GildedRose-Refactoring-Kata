package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesTest {

    @Test
    public void qualityIncreaseVariesBySellin() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20) };
        GildedRose app = new GildedRose(items);

        app.update();
        // quality increases by 1
        assertEquals(10, items[0].sellIn);
        assertEquals(21, items[0].quality);

        app.update();
        // quality increases by 2
        assertEquals(9, items[0].sellIn);
        assertEquals(23, items[0].quality);

        for( int i = 0; i < 5; i++) {
            app.update();
        }

        // quality increases by 3
        assertEquals(4, items[0].sellIn);
        assertEquals(34, items[0].quality);
    }

    @Test
    public void qualityGoesToZeroAfterConcert() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50) };
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 11; i++) {
            app.update();
        }

        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    // Tier 1 sellin, testing edge cases

    @Test
    public void sellin20quality48() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 48) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(49, app.items[0].quality);
        assertEquals(19, app.items[0].sellIn);
    }

    @Test
    public void sellin20quality49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 49) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(19, app.items[0].sellIn);
    }

    @Test
    public void sellin20quality50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 50) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(19, app.items[0].sellIn);
    }

    // Tier 2 sellin, testing edge cases

    @Test
    public void sellin10quality47() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 47) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(49, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void sellin10quality48() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void sellin10quality49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    public void sellin10quality50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    // Tier 3 sellin, testing edge cases

    @Test
    public void sellin3quality46() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 46) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(49, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    public void sellin3quality47() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 47) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    public void sellin3quality48() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 48) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    public void sellin3quality49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    public void sellin3quality50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50) };
        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(50, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }
}

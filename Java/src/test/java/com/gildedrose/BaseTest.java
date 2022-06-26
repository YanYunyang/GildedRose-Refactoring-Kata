package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseTest {
    Item[] items;
    Item item;

    public void updateQualityCommon(){
        GildedRose app = new GildedRose(items);
        ItemHandler itemHandler = ItemHandlerFactory.getInstance(item.name);
        for (int i = 0; i < 100; i++){
            app.updateQuality();
            itemHandler.updateQuality(item);

            assertEquals(item.quality,items[0].quality);
            assertEquals(item.sellIn,items[0].sellIn);
        }
    }
}

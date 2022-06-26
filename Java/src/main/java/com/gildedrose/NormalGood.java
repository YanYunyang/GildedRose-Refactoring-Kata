package com.gildedrose;

public class NormalGood implements ItemHandler{
    private static NormalGood singleton = null;

    public static NormalGood getInstance() {
        if (singleton == null) {
            singleton = new NormalGood();
        }
        return singleton;
    }

    private int decreaseSpeed = -1;

    @Override
    public void updateQuality(Item item) {
        item.quality = item.quality + decreaseSpeed;

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0){
            item.quality = item.quality + decreaseSpeed;
        }

        if (item.quality < 0){
            item.quality = 0;
        }
    }
}

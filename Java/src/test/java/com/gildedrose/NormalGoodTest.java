package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalGoodTest extends BaseTest{

    @Test
    void updateQuality() {

        super.items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        super.item = new Item("+5 Dexterity Vest", 10, 20);

        super.updateQualityCommon();
    }
}

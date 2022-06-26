package com.gildedrose;

public class ItemHandlerFactory {
    public static ItemHandler getInstance(String name){
        switch(name){
            case "test":
            case "test2":
            default:
                return NormalGood.getInstance();
        }
    }
}

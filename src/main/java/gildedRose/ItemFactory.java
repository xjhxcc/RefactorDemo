package gildedRose;

public class ItemFactory {

    public static SuperItem createItem(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            case "Conjured":
                return new ConjuredItem();
            default:
                return new NormalItem();
        }
    }
}

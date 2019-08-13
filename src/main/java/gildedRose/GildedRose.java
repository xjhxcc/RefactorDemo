package gildedRose;
public class GildedRose {
    Item[] items;
    int i=0;
    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].updateQuality();
        }
    }


}
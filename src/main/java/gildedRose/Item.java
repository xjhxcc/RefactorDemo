package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    boolean isaSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    boolean isBackstage() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isAged_brie() {
        return name.equals("Aged Brie");
    }


    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

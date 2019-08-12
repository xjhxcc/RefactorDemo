package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;
    private final int maxQuality = 50;
    private final int minQuality = 0;

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

    void isQualityUnder50() {
        if (quality < maxQuality) {
            quality = quality + 1;
        }
    }

    void isQualityOver0() {
        if (quality > minQuality) {
            if (!isaSulfuras()) {
                quality = quality - 1;
            }
        }
    }


    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

package gildedRose;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;
    private final int maxQuality = 50;
    private final int minQuality = 0;

    public abstract void updateQualityByType();
    public abstract void updateSellIn ();
    public abstract void updateQualityWithSellInLessThan0();
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
        if (quality > minQuality && !isaSulfuras()) {
            quality = quality - 1;
        }
    }


    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

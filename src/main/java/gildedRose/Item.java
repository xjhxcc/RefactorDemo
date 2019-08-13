package gildedRose;

public class Item {
    SuperItem superItem;
    public String name;

    public int sellIn;

    public int quality;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
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
        if (quality < 50) {
            quality ++;
        }
    }

    void isQualityOver0() {
        if (quality > 0 && !isaSulfuras()) {
            quality = quality - 1;
        }
    }
    public void updateQuality() {
        switch (this.getName()) {
            case "Aged Brie":
                new AgedItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstageItem();
            case "Sulfuras, Hand of Ragnaros":
                new SulfurasItem();
            default:
                new NormalItem();
        }
    }
    void decreaseSellIn() {
        this.sellIn--;
    }

    void whenQualityUnder50(Item item) {
        if (item.quality < 50) {
            item.quality++;
            backstageJudgeSellIn6and11(item);
        }
    }

    void backstageJudgeSellIn6and11(Item item) {
        if (item.isBackstage()){
            if (item.sellIn < 11) {
                item.isQualityUnder50();
            }

            if (item.sellIn < 6) {
                item.isQualityUnder50();
            }
        }
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isAged_brie(items[i])
                    && !isBackstage(items[i])) {
                isQualityOver0(items[i]);
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (isBackstage(items[i])) {
                        if (items[i].sellIn < 11) {
                            IsQualityUnder50(items[i]);
                        }

                        if (items[i].sellIn < 6) {
                            IsQualityUnder50(items[i]);
                        }
                    }
                }
            }

            if (!isaSulfuras(items[i])) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isAged_brie(items[i])) {
                    if (!isBackstage(items[i])) {
                        isQualityOver0(items[i]);
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    IsQualityUnder50(items[i]);
                }
            }
        }
    }

    boolean isaSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    boolean isBackstage(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isAged_brie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private void IsQualityUnder50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void isQualityOver0(Item item) {
        if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1;
            }
        }
    }
}
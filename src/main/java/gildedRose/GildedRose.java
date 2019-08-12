package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].isAged_brie()
                    && !items[i].isBackstage()) {
                isQualityOver0(items[i]);
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].isBackstage()){
                        if (items[i].sellIn < 11) {
                            IsQualityUnder50(items[i]);
                        }

                        if (items[i].sellIn < 6) {
                            IsQualityUnder50(items[i]);
                        }
                    }
                }
            }

            if (!items[i].isaSulfuras()) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].isAged_brie()) {
                    if (!items[i].isBackstage()) {
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
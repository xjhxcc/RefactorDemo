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
                items[i].isQualityOver0();
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].isBackstage()){
                        if (items[i].sellIn < 11) {
                            items[i].isQualityUnder50();
                        }

                        if (items[i].sellIn < 6) {
                            items[i].isQualityUnder50();
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
                        items[i].isQualityOver0();
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    items[i].isQualityUnder50();
                }
            }
        }
    }


}
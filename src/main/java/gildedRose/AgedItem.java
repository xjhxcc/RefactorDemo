package gildedRose;

public class AgedItem extends SuperItem {
    public void updateQualityItem(Item item) {
        item.decreaseSellIn();
        item.whenQualityUnder50(item);
            if (item.sellIn < 0) {
                if (item.quality < 50) {
                    item.quality++;
                }
            }

    }
}

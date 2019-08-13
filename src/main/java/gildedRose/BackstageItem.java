package gildedRose;

public class BackstageItem extends  SuperItem {
    public void updateQualityItem(Item item){
        item.decreaseSellIn();
        item.whenQualityUnder50(item);
            if (item.sellIn < 0) {
                item.quality = 0;
            }
    }
}

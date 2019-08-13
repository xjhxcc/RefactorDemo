package gildedRose;

public class ConjuredItem extends SuperItem {
    @Override
    void updateQualityItem(Item item) {
        item.decreaseSellIn();
        if(item.quality>0){
            item.quality=item.quality-2;
        }
        if (item.sellIn < 0) {
            item.quality=item.quality-2;
        }
    }
}

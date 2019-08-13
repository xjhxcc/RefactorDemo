package gildedRose;

public class NormalItem extends SuperItem {
    public void updateQualityItem(Item item){
            item.decreaseSellIn();
            item.isQualityOver0();
            if (item.sellIn < 0) {
                item.isQualityOver0();
            }
    }
}

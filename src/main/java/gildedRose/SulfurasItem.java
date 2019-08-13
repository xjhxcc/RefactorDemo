package gildedRose;

public class SulfurasItem extends  SuperItem  {
    public void updateQualityItem(Item item){
            item.isQualityOver0();
            if (item.sellIn < 0) {
                item.isQualityOver0();
            }
    }
}

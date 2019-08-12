package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_quality_when_update_quality_given_item_name_not_equal_Aged_Brie(){
        //given
        Item[] items = {new Item("item",5,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(29, items[0].quality);
    }
}
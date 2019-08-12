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
        assertEquals(4,items[0].sellIn);
    }
    @Test
    public void should_return_quality_when_update_quality_given_item_name_equal_Aged_Brie_and_quality_smaller_than_50(){
        //given
        Item[] items = {new Item("Aged Brie",5,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(31, items[0].quality);
        assertEquals(4,items[0].sellIn);
    }
    @Test
    public void should_return_correct_when_update_quality_given_name_is_Backstage_and_quality_under_50_and_sellIn_between_6_and_11(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",7,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(32, items[0].quality);
        assertEquals(6, items[0].sellIn);
    }

}
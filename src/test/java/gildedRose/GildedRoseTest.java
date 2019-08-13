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
    public void should_return_correct_value_when_update_quality_given_quality_under_50_and_name_is_Backstage_and_sellIn_between_6_and_11(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",7,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(32, items[0].quality);
        assertEquals(6, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_update_quality_given_quality_under_50_and_name_is_Backstage_and_sellIn_under_6(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(33, items[0].quality);
        assertEquals(4, items[0].sellIn);
    }
//    @Test
//    public void should_return_correct_value_when_update_quality_given_quality_under_50_and_name_is_Backstage_and_sellIn_bigger_11(){
//        //given
//        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",11,30)};
//        GildedRose gildedRose = new GildedRose(items);
//        //when
//        gildedRose.updateQuality();
//        //then
//        assertEquals(31, items[0].quality);
//        assertEquals(10, items[0].sellIn);
//    }
    @Test
    public void should_return_correct_value_when_name_is_Sulfuras_and_quality_under_50(){
        //given
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",6,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(30, items[0].quality);
        assertEquals(6, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_sallin_under_0_and_name_is_Aged_and_quality_under_50(){
        //given
        Item[] items = {new Item("Aged Brie",-1,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(32, items[0].quality);
        assertEquals(-2, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_sallin_under_0_and_name_is_Aged_and_quality_bigger_50(){
        //given
        Item[] items = {new Item("Aged Brie",-1,51)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(51, items[0].quality);
        assertEquals(-2, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_sallin_under_0_and_name_is_Backstage(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",-1,50)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0, items[0].quality);
        assertEquals(-2, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_sallin_under_0_and_name_is_not_Backstage_and_quality_under_or_equal_0(){
        //given
        Item[] items = {new Item("item",-1,0)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0, items[0].quality);
        assertEquals(-2, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_name_is_Sulfuras_and__sellIn_under_0(){
        //given
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",-1,30)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(30, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }
    @Test
    public void should_return_correct_value_when_name_is_Conjured_and_sellIn_under_30(){
        //given
        Item[] items = {new Item("Conjured",10,20)};
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(18, items[0].quality);
        assertEquals(9, items[0].sellIn);
    }
    @Test
    public void should_return_18_when_call_updateQuality_given_conjured_item_sellin_small_0_quality_20() {
        Item item = new Item("Conjured", -1, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(16, items[0].quality);
        assertEquals(-2, items[0].sellIn);
    }


}
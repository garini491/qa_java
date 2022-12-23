package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void eatMeatReturnCorrectFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected,actual);
    }
    @Test
    public void getFamilyReturnFeline() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily,actualFamily);
    }
    @Test
    public void getKittensShouldReturnOne() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals(expectedKittensCount,actualKittensCount);
    }
    @Test
    public void getKittensShouldReturnArgument() {
        int kittensCount = 3;
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(kittensCount);
        assertEquals(expectedKittensCount,actualKittensCount);
    }
}
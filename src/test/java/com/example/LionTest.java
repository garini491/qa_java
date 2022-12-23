package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    private final Feline feline = new Feline();
    private final String sex = "Самка";
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex,feline);
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens,actualKittens);
    }
    @Test
    public void getFoodReturnsValidFood() throws Exception {
        Lion lion = new Lion(sex,feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood,actualFood);
    }
}

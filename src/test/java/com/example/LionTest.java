package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean hasMane;


    public LionTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] getLions() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true},
                {"Котик", false},
        };
    }
    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens,actualKittens);
    }

    @Test
    public void doesHaveManeReturnsCorrectMane() {
        String expectedException = "Используйте допустимые значения пола животного - самей или самка";
        try {
            Lion lion = new Lion(sex);
            boolean mane = lion.doesHaveMane();
            assertEquals(hasMane, mane);
        } catch (Exception exception) {
            Assert.assertEquals("Исключение не получено",expectedException, exception.getMessage());
        }
    }

    @Test
    public void getFoodReturnsValidFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood,actualFood);
    }
}
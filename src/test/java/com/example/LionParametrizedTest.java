package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private final boolean hasMane;
    private final Feline feline;



    public LionParametrizedTest(String sex, boolean hasMane, Feline feline){
        this.sex = sex;
        this.hasMane = hasMane;
        this.feline = feline;
    }
    @Parameterized.Parameters(name = "Тестовые данные: {0}, {1}")
    public static Object[][] getLions() {
        return new Object[][] {
                {"Самка", false, null},
                {"Самец", true, null},
                {"Котик", false, null},
        };
    }

    @Test
    public void doesHaveManeReturnsCorrectMane() {
        String expectedException = "Используйте допустимые значения пола животного - самей или самка";
        try {
            Lion lion = new Lion(sex, feline);
            boolean mane = lion.doesHaveMane();
            assertEquals(hasMane, mane);
        } catch (Exception exception) {
            Assert.assertEquals("Исключение не получено",expectedException, exception.getMessage());
        }
    }
    
}
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    @Mock
    private Predator predator;

    @Test
    public void getSoundReturnsCorrectCatSound() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected,actual);
    }
    @Test
    public void getFoodReturnsPredator() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood,actualFood);
    }
}
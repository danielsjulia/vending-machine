package com.techelevator.view;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DessertTest {

    private Dessert dessert;

    @Before
    public void setup() {dessert = new Dessert("Candy", new BigDecimal("2.00"), "C1");}

    @Test
    public void hasMessage() {
        String expected = "Sugar, Sugar, so Sweet!";
        String actual = dessert.message();
        assertEquals(expected, actual);
    }

    @Test
    public void correctSlot(){
        String expected = "C1";
        String actual = dessert.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_name(){
        String expected = "Candy";
        String actual = dessert.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_price(){
        BigDecimal expected = new BigDecimal("2.00");
        BigDecimal actual = dessert.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_initialStock(){
        int expected = 7;
        int actual = dessert.getStock();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_stock_after_removal(){
        int expected = 6;
        dessert.removeItem(1);
        int actual = dessert.getStock();
        assertEquals(expected, actual);

    }
    @Test
    public void correct_to_String(){
        String expected = "Candy $2.00";
        String actual = dessert.toString();
        assertEquals(expected, actual);

    }

}

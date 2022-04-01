package com.techelevator.view;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DrinksTest {

    private Drinks drinks;

    @Before
    public void setup() {drinks = new Drinks("Soda", new BigDecimal("2.00"), "C1");}

    @Test
    public void hasMessage() {
        String expected = "Drinky, Drinky, Slurp Slurp!";
        String actual = drinks.message();
        assertEquals(expected, actual);
    }

    @Test
    public void correctSlot(){
        String expected = "C1";
        String actual = drinks.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_name(){
        String expected = "Soda";
        String actual = drinks.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_price(){
        BigDecimal expected = new BigDecimal("2.00");
        BigDecimal actual = drinks.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_initialStock(){
        int expected = 7;
        int actual = drinks.getStock();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_stock_after_removal(){
        int expected = 6;
        drinks.removeItem(1);
        int actual = drinks.getStock();
        assertEquals(expected, actual);

    }
    @Test
    public void correct_to_String(){
        String expected = "Soda $2.00";
        String actual = drinks.toString();
        assertEquals(expected, actual);

    }

}

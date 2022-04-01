package com.techelevator.view;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SandwichTest {
    private Sandwich sandwich;

    @Before
    public void setup() {sandwich = new Sandwich("Sammich", new BigDecimal("2.00"), "C1");}

    @Test
    public void hasMessage() {
        String expected = "Sandwich So Delicious, Yum!";
        String actual = sandwich.message();
        assertEquals(expected, actual);
    }

    @Test
    public void correctSlot(){
        String expected = "C1";
        String actual = sandwich.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_name(){
        String expected = "Sammich";
        String actual = sandwich.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_price(){
        BigDecimal expected = new BigDecimal("2.00");
        BigDecimal actual = sandwich.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_initialStock(){
        int expected = 7;
        int actual = sandwich.getStock();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_stock_after_removal(){
        int expected = 6;
        sandwich.removeItem(1);
        int actual = sandwich.getStock();
        assertEquals(expected, actual);

    }
    @Test
    public void correct_to_String(){
        String expected = "Sammich $2.00";
        String actual = sandwich.toString();
        assertEquals(expected, actual);

    }

}


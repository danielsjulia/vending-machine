package com.techelevator.view;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MunchyTest {

    private Munchy munchy;

    @Before
    public void setup() {munchy = new Munchy("Popcorn", new BigDecimal("2.00"), "C1");}

    @Test
    public void hasMessage() {
        String expected = "Munchy, Munchy, so Good!";
        String actual = munchy.message();
        assertEquals(expected, actual);
    }

    @Test
    public void correctSlot(){
        String expected = "C1";
        String actual = munchy.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_name(){
        String expected = "Popcorn";
        String actual = munchy.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_price(){
        BigDecimal expected = new BigDecimal("2.00");
        BigDecimal actual = munchy.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_initialStock(){
        int expected = 7;
        int actual = munchy.getStock();
        assertEquals(expected, actual);
    }

    @Test
    public void correct_stock_after_removal(){
        int expected = 6;
        munchy.removeItem(1);
        int actual = munchy.getStock();
        assertEquals(expected, actual);

    }
    @Test
    public void correct_to_String(){
        String expected = "Popcorn $2.00";
        String actual = munchy.toString();
        assertEquals(expected, actual);

    }

}

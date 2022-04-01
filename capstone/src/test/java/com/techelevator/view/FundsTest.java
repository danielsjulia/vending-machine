package com.techelevator.view;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FundsTest {

    private Funds funds;

    @Before
    public void setup(){funds = new Funds();}

    @Test
    public void correct_change_dispensed(){
        BigDecimal balance = new BigDecimal("5.65");
        String expected = "Your change is: 5 Dollars 2 Quarters 1 Dimes 1 Nickels";
        funds.deposit(balance);
        String actual = funds.refund();
        assertEquals(expected, actual);

    }

}

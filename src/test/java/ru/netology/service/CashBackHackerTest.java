package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {
    CashBackHacker cashbackHackService = new CashBackHacker();


    @Test
    public void shouldCalculateIfAmountCorrect() {

        int amount = 1700;
        int actual = cashbackHackService.remain( amount );
        int expected = 300;

        assertEquals( actual, expected );

    }


    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = cashbackHackService.remain( amount );
        int expected = 1000;

        assertEquals( actual, expected );

    }


    @Test
    public void shouldCalculateIfAmount999() {
        int amount = 999;
        int actual = cashbackHackService.remain( amount );
        int expected = 1;
        assertEquals( actual, expected );
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = cashbackHackService.remain( amount );
        int expected = 0;
        assertEquals( actual, expected );
    }


}

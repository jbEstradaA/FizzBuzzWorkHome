package com.belatrix;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by bestrada on 12/09/2016.
 */
public class FizzBuzzTest
{
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void returnsNumber() throws Exception {
        assertEquals("1", fizzBuzz.ofNumber(1));
        assertEquals("2", fizzBuzz.ofNumber(2));

    }

    @Test
    public void returnsFizzWhenNumberIsMultipleOfThree() throws Exception {
        assertEquals("Fizz", fizzBuzz.ofNumber(3));
        assertEquals("Fizz", fizzBuzz.ofNumber(6));
        assertEquals("Fizz", fizzBuzz.ofNumber(9));
    }

    @Test
    public void returnsBuzzWhenNumberIsMultipleOfFive() throws Exception {
        assertEquals("Buzz", fizzBuzz.ofNumber(5));
        assertEquals("Buzz", fizzBuzz.ofNumber(10));
    }

    @Test
    public void returnsFizzBuzzWhenNumberIsMultipleOfThreeAndFive() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.ofNumber(15));
    }




}

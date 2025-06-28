package com.AAApattern.Ex_04_AAAPatternTeardownMethods;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.AAApattern.Ex_04_AAAPatternTeardownMethods.Fruits;

public class FruitsTest {

    private Fruits fruits;

    @Before
    public void setUp() {
        fruits = new Fruits();
        fruits.addFruit("Apple");
        fruits.addFruit("Banana");
    }

    @After
    public void tearDown() {
        fruits.clearBasket();
    }

    @Test
    public void testAddFruit() {
        fruits.addFruit("Mango");
        assertEquals(3, fruits.getTotalFruits());
    }

    @Test
    public void testGetFruit() {
        String result = fruits.getFruit(1);
        assertEquals("Banana", result);
    }

    @Test
    public void testGetFruitOutOfBoundsReturnsNull() {
        String result = fruits.getFruit(5);
        assertNull(result);
    }
}


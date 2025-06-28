package com.assertionsTest.Ex_03_Assertions_in_Junit;
import static org.junit.Assert.*;
import org.junit.Test;

public class FruitTest{

    @Test
    public void testFruitsOperations() {
        Fruits fruits = new Fruits();
        fruits.addFruit("Apple");
        fruits.addFruit("Mango");

        assertEquals(2, fruits.count());
        assertTrue(fruits.containsFruit("Mango"));
        assertFalse(fruits.containsFruit("Banana"));
        assertNotNull(fruits.getFruit(0));
        assertEquals("Apple", fruits.getFruit(0));
        assertNull(fruits.getFruit(3));
    }
}

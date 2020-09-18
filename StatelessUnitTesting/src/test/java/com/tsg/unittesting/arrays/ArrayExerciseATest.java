/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maxka
 */
public class ArrayExerciseATest {
    
    public ArrayExerciseATest() {
    }
      
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testMaxTen() {
        int[] arrayOfInts = {1, 5, 8, 10};
        
        int max = maxOfArray(arrayOfInts);
        
        int trueMax = 10;
        assertEquals(trueMax, max, "Expected max of 10");
        
    }
    
    @Test
    public void testMaxFive() {
        int[] arrayOfInts = {1, 3, 4};
        
        int max = maxOfArray(arrayOfInts);
        
        int trueMax = 5;
        assertEquals(trueMax, max, "Expected max of 5");
    }
    
    @Test 
    public void testMaxZero() {
        int[] arrayOfInts = {-6, -2, 0};
        
        int max = maxOfArray(arrayOfInts);
        
        int trueMax = 0;
        assertEquals(trueMax, max, "Expected max of 0");
    }
    
    @Test
    public void testMaxNegativeFive() {
        int[] arrayOfInts = {-1, -3, -4};
        
        int max = maxOfArray(arrayOfInts);
        
        int trueMax = -5;
        assertEquals(trueMax, max, "Expected max of -5");
    }
    
    public void testMaxNegativeTen() {
        int[] arrayOfInts = {-1, -5, -8, -10};
        
        int max = maxOfArray(arrayOfInts);
        
        int trueMax = -10;
        assertEquals(trueMax, max, "Expected max of -10");
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }
    
}

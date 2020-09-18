/** *******************************
 * The Software Guild
 * Copyright (C) 2020 Wiley  LLC - All Rights Reserved
 ******************************** */
package com.tsg.unittesting.arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseA {

    /**
     * Given an array of integers, find and return the maximum value.
     *
     * Example Results: maxOfArray( {1} ) -> 1 maxOfArray( {3,4,5} ) -> 5
     * maxOfArray( {-9000, -700, -50, -3} ) -> -3
     *
     * @param numbers array of integers
     * @return int max
     */
    public static int maxOfArray(int[] numbers) {
        int max = numbers[0];
        for (int currentPosition = 0; currentPosition < numbers.length; currentPosition++) {
            for (int otherPosition = 0; otherPosition < numbers.length; otherPosition++) {

                if (numbers[currentPosition] > max) {
                    max = numbers[currentPosition];

                } else if (numbers[otherPosition] > max) {
                    max = numbers[otherPosition];
                }
            }

        }
        
        return max;
    }
}

        
        
        
        
        
//        int maxNum = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > maxNum) {
//                maxNum = numbers[i];
//            } else {
//                maxNum = numbers[i + 1]
//            }

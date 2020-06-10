/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

import java.util.Arrays;

/**
 *
 * @author Maxka
 */
public class ArrayExamples {
    public static void main(String[] args) {
        //array with spots filled
        int[] myArray = {7,9,8};
        // Array with four spots
        int[] array2 = new int[4];
        int[] array3 = {1,2,3,4};
        
        System.out.println(sum(myArray));
        System.out.println(Arrays.toString(backWards(array3)));
    }
    
    public static int[] backWards(int[] array) {
        int startPoint = 0;
        int[] newArray = new int[array.length];
        for (int i = array.length - 1 ; i >= 0 ; i--) {
            newArray[startPoint] = array[i];
            startPoint++;
        }
        return newArray;
    }
    
    
    public static int sum(int[] array) {
        int tracker = 0;
        for (int i = 0; i < array.length; i++) {
            tracker += array[i]; //tracker = tracker + array[i]
        }
        // tracker is the sum
        return tracker;
    }
}

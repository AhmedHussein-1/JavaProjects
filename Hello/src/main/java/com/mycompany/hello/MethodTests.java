/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hello;

import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class MethodTests {
//    This is how you make a variable golabal 
//    public static int numOne = 3;
    public static void main(String[] args) {
        int numOne =  7;
        int numTwo = 13;
        String firstName = "Ahmed";
        String lastName = "Hussein";
        
        System.out.println(adder(numOne,numTwo));
        

        names(firstName, lastName);
        
        System.out.println(names2(firstName, lastName));
        
        
        
    }
    
    public static int adder(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    
    public static void names(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);   
    }
    
    public static String names2(String firstName, String lastName) {
        String hello = "Hello " + firstName + " " + lastName;
        if (1 == 2) {
            return hello;

        } else {
            return "fuck you!";
        }

    }
    
}

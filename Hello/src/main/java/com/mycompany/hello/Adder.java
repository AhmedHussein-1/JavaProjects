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
public class Adder {
    public static void main(String[] args) {
        int num1;
        int num2;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter Num 1: ");
        num1 = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Enter Num 2: ");
        num2 = Integer.parseInt(myScanner.nextLine());
        
        
        System.out.println("sum = " + (num1 + num2));
            
        
    }
    
}

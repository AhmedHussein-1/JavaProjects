/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class InterestCalculator {
    public static void main(String[] args) {
        IntrestOne();
    }
    
    public static void IntrestOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        Float currentBalance = sc.nextFloat();
        System.out.println(currentBalance);
        
        System.out.println("How many years are investing?");
        Float years = sc.nextFloat();
        System.out.println(years);
        
        System.out.println("What is the annual interest rate % growth?");
        Float growthRate = sc.nextFloat();
        System.out.println(growthRate);
        
        Float answer = (currentBalance * years * growthRate) / 100;
        System.out.println(answer);
        
        // ((10 / 4) * 2) 

    }
}

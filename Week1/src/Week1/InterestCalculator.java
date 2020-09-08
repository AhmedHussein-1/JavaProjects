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
        double currentBalance = sc.nextDouble();
        System.out.println(currentBalance); 
        
        System.out.println("How many years are investing?");
        double years = sc.nextDouble();
        System.out.println(years);
        
        System.out.println("What is the annual interest rate % growth?");
        double growthRate = sc.nextDouble();
        System.out.println(growthRate);
        
        
        double total = currentBalance * (1 + (growthRate / 100));
        System.out.println(total);
        
        System.out.println("Calculating...\n" + "Year 1:");
        System.out.println("Began with: " + currentBalance);
        System.out.println("Earned: " + (growthRate));
        System.out.println("Ended with: " + total);
        
        System.out.println("Year 2: ");
        System.out.println("Began with: " + total);
        System.out.println("Earned: " + growthRate * (growthRate * 2));
        System.out.println("Ended with: " + total + growthRate);
                

    }
}

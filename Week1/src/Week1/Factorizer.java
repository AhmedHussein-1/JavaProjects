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
public class Factorizer {
    public static void main(String[] args) {
        int factorMe = 3;
        Factor(factorMe);
    }
    
    public static void Factor(int number) {
        System.out.print("Factors of " + number + " are: \n");
        int count = 0;
        int add = 0;
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
                add = add + i;
                count++;
            }
        }
        
        System.out.println("\nThere are " + count + " factors");
        
        if ((add - number) == number) {
            System.out.println(add - number + " is a perfect number");
        } else {
            System.out.println(add - number + " is NOT a perfect number");
        }
        
        if (count == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is NOT a prime number");
        }
    }
    
}
            


    


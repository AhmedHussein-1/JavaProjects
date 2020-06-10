/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment1;

import java.util.Scanner;

/**
 *
 * @author Maxka
 */
public class HealthyHearts {
    public static void main(String[] args) {
        System.out.println("What is your age? ");
        Scanner myScan = new Scanner(System.in);
        String age = myScan.nextLine();
        
        int max = 220 - Integer.parseInt(age);
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        
        double HRZone1 = max * 0.50;
        double HRZone2 = max * 0.85;
        
        System.out.println("\nThe target heart rate zone is the " + Math.ceil(HRZone1) + " - " + Math.ceil(HRZone2) + " of the maximum.");

    }

}

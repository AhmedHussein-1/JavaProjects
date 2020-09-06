/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Random;

/**
 *
 * @author Maxka
 */
public class SIxSidedDice {
    public static void main(String[] args) {
        
        int side1 = 1;
        int side2 = 2;
        int side3 = 3;
        int side4 = 4;
        int side5 = 5;
        int side6 = 6;
        
        
        
        int min = 1;
        int max = 6;
        
        
        Random rn = new Random();
          
        
        
        int i = 1;
        while ( i <= 6) {
            i++;
            
            int answer = rn.nextInt(max - min + 1) + min;
            System.out.println(rollResult(answer));
            
        }
        
    }    
        public static int rollResult(int result) {
            
            if (result == 1) {
                System.out.println("you won $1");
            } else if (result == 2) {
                System.out.println("you lose $1");
            } else if (result == 3) {
                System.out.println("you won $5");
            } else if (result == 4) {
                System.out.println("you lose $5");
            } else if (result == 5) {
                System.out.println("you won $10");
            } else {
                System.out.println("you lose $10");
            }
            
            return result;
        
    }
        
    
}

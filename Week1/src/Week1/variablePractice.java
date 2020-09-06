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
public class variablePractice {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 5;
        
        int sum1 = operand1 + operand2;
        
        System.out.println("sum is" + sum1);
        
        Scanner sc = new Scanner(System.in);
        int op1 = 0;
        int op2 = 0;
        
        String Useroperand1 = "";
        String Useroperand2 = "";
        
        System.out.println("Enter number 1");
        Useroperand1 = sc.nextLine();
        
        System.out.println("Enter number 2");
        Useroperand2 = sc.nextLine();
        
        op1 = Integer.parseInt(Useroperand1);
        op2 = Integer.parseInt(Useroperand2);
        
        int sum2 = op1 + op2;
        
        System.out.println("Sum is" + sum2);
    }
        
        
}
 

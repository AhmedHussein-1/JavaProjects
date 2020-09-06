/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

/**
 *
 * @author Maxka
 */
public class MethodPractice {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String name= "Ahmed";
        System.out.println(numSum(a,b));
        System.out.println("Hello my name is " + stringOut(name));

    }
    
    public static int numSum(int sum3, int sum4) {
        sum3 = 5;
        sum4 = 10;
        return sum3 + sum4;
    }
    
    public static String stringOut(String str) {
        return str;
    }
    
    //takes in integer
    // for loop works how many time the int is

}

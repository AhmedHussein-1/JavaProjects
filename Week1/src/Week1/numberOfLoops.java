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
public class numberOfLoops {
    public static void main(String[] args) {
        int b = 5;
        numberOfLoops(b);
    }
    
    public static int numberOfLoops(int loopThis) {
        for (int i = 1; i <= loopThis; i++){
            System.out.println(i);
        }
        return loopThis;
   
    }
}

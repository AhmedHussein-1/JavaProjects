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

// use random
// head or tail = if one side, you must use a for loop 1 - 10 other side while loop count down 10 - 1
// use 3 different methods w/o main
// after the code is finished use switch statment based on H or T, force you to print "you won" and " you lose"
public class CoinFlip {
    public static void main(String[] args) {
        int flipTheCoin = 2;
        flipCoin(flipTheCoin);
        oneToTen(flipTheCoin);
        winOrLose(flipTheCoin);
    }
    
    public static void flipCoin(int coin) {
        if (coin == 1) {
            System.out.println("you flipped Heads");
        } else {
            System.out.println("you flipped Tails");
        }
    }
    
    
    public static void oneToTen(int coin) {
        if (coin == 1) {
            for (int i = 1; i <= 10; i++){
                System.out.println(i);
            }
        } else {

            int i = 10;
            while (i >= 1) {
                System.out.println(i);
                i--;
                
            }
            
        }
    } 
    
    public static void winOrLose(int coin) {
        switch(coin) {
            case 1:
                System.out.println("You Win!");
                break;
            case 2:
                System.out.println("You Lose!");
                break;
        }
    }
    
}

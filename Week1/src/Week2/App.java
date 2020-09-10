/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Maxka
 */
public class App {
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        myDog.setName("Spot");
        myDog.setWeight(34.0);
        
        //Other way to do it
        
        Dog anotherDog = new Dog("Buster", 23.5);
        
        
        Square sc = new Square();
        sc.getArea(2, 2);
        sc.getPerimeter(2);
        
    }
}

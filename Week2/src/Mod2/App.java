/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod2;

/**
 *
 * @author Maxka
 */
public class App {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.setMake("Honda");
        myCar.setModel("Accord");
        myCar.setYear(2005);
        
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        

        Car myCar2 =  new Car("Toyota", "Camry", 1997);
        System.out.println(myCar2.getMake()+ " " + myCar2.getModel() + " " + myCar2.getYear());
        
        
        
        // Ice Cream
        
        IceCream myCream = new IceCream();
        
        myCream.setFlavor("Strawberry");
        System.out.println(myCream.getFlavor());
        
        IceCream myCream2 = new IceCream("chocolate");
        String x = myCream2.getFlavor();
        System.out.println(x);
        
        System.out.println();
    }
    
    
    
}

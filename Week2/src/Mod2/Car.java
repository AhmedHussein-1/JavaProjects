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


/* create car

1. make (honda)
2. year 
3. model (accord)

setters and getters for all

2 diff methods (start and stop engine)

app class, create car, create instance, set variables (constructor in car class), call start and stop in order.


*/
public class Car {
    
    private String make;
    private String model;
    private int year;
    
    public Car() {
        
    }
    
    public Car(String makeIn, String modelIn, int yearIn) {
        this.make = makeIn;
        this.model = modelIn;
        this.year = yearIn;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void startEngine() {
        System.out.println("*car starts*");
    }
    
    public void stopEngine() {
        System.out.println("*Engine Stops");
    }
    
    
}

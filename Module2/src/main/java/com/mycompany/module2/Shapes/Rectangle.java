/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module2.Shapes;

/**
 *
 * @author Maxka
 */
public class Rectangle {
    private static final double height = 10;
    private static final double width = 13;
    
    public static void getArea() {
        double area = height * width;
        System.out.println("the area of the rectangle is: "+area);
    }
    
    public static void getPerimeter() {
        
        
        double perimeter = 2*(height + width);
        System.out.println("the perimeter of the rectangle is: "+perimeter);
    }
}

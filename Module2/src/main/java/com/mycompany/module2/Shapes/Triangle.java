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
public class Triangle implements Shape{

    @Override
    public void getArea(int a, int b) {
       int area = (a * b)/2;
        System.out.println(area);
    }

    @Override
    public void getPermimeter(int a, int b) {
        // a^2 + b^2 = c^2
        double perimeter = (a*a)+(b*b);
        
        double root = Math.sqrt(perimeter);
        System.out.println(root);
    }
    
    public String color = "pink";
    

    
//    private static final double base = 4;
//    private static final double height = 4;
//   
//    public static void getArea() {
//        double area = (base * height)/2;
//        System.out.println("the area of the triangle is: "+area);
//    }
//    
//    public static void getPerimeter() {
//        double a= 2;
//        double b = 2;
//        double c = 5;
//        
//        double perimeter = (a+b+c);
//        System.out.println("The perimeter of the triangle is: "+perimeter);
//                
//        
//    }
    
}

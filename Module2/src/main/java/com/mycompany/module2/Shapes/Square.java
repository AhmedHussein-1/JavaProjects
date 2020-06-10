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

public class Square implements Shape {

    @Override
    public void getArea(int a, int b) {
        int area = a * b;
        System.out.println("the area of the square is: "+area);
    }

    @Override
    public void getPermimeter(int a, int b) {
        int perimeter = 2*(a+b);
        System.out.println("the perimeter of the square is: "+perimeter);
    }
    
    public String color = "red";
}

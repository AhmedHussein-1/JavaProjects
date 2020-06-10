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
public class App {
    
    public static void main(String[] args) {
        Square sq = new Square();
        sq.getArea(2, 2);
        sq.getPermimeter(2, 2);
        System.out.println(sq.color);
        
        Triangle tr = new Triangle();
        tr.getArea(2, 3);
        tr.getPermimeter(3, 2);
        System.out.println(tr.color);
    }
}

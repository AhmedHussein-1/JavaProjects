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
public class Square implements Shape{

    @Override
    public void getArea(int length, int width) {
        int area = length * width;
        System.out.println(area);
    }

    @Override
    public void getPerimeter(int side) {
        int perimeter =  4 * side;
        System.out.println(perimeter);
    }
    
}

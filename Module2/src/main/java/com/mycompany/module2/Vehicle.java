/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module2;

/**
 *
 * @author Maxka
 */
public interface Vehicle {
    
    public void moveForward(int milesPerHour);
    public void moveBackward(int milesPerHour);
    public void stop();
    public void turnLeft();
    public void turinRight();
    public void engineOn();
    public void engineOff();
}


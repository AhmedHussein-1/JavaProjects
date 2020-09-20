/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public class Snack {
    
    private final String snackName;
    private BigDecimal snackPrice;
    private int inventory;
    
    public Snack(String snackName) {
        this.snackName = snackName;
    }
    
    public String getSnackName() {
        return snackName;
    }
    
    public BigDecimal getSnackPrice() {
        return snackPrice;
    }
    
    public void setSnackPrice(BigDecimal snackPrice) {
        this.snackPrice = snackPrice;
    }
    
    public int getInventory() {
        return inventory;
    }
    
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}

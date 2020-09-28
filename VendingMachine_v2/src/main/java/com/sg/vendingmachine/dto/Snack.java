/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.util.Objects;

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

    public Snack(String name, BigDecimal price, int inventory) {
        this.snackName = name;
        this.snackPrice = price;
        this.inventory = inventory;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.snackName);
        hash = 13 * hash + Objects.hashCode(this.snackPrice);
        hash = 13 * hash + this.inventory;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Snack other = (Snack) obj;
        if (this.inventory != other.inventory) {
            return false;
        }
        if (!Objects.equals(this.snackName, other.snackName)) {
            return false;
        }
        if (!Objects.equals(this.snackPrice, other.snackPrice)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Snack{" + "snackName=" + snackName + ", snackPrice=" + snackPrice + ", inventory=" + inventory + '}';
    }

}

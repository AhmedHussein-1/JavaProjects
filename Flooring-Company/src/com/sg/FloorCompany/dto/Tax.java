/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dto;

import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public class Tax {
    
    private String state;
    private String stateName;
    private BigDecimal taxRate;
    
    public Tax(String state) {
        this.state = state;
    }
    
    public Tax(String stateName, BigDecimal taxRate) {
        this.stateName = stateName;
        this.taxRate = taxRate;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getStateName() {
        return stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
    public BigDecimal getTaxRate() {
        return taxRate;
    }
    
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

}

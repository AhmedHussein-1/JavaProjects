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
public class Product {
    
    private String productType;
    private BigDecimal CostPerSquareFoor;
    private BigDecimal LaborCostPerSquareFoot;
    
    public Product(String productType) {
        this.productType = productType;
    }
    
    public Product(String productType, BigDecimal CostPerSquareFoor, 
            BigDecimal LaborCostPerSquareFoot) {
        this.productType = productType;
        this.CostPerSquareFoor = CostPerSquareFoor;
        this.LaborCostPerSquareFoot = LaborCostPerSquareFoot;
    }
    
    public String getProductType() {
        return productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public BigDecimal getCostPerSquareFoor() {
        return CostPerSquareFoor;
    }
    
    public void setCostPerSquareFoor(BigDecimal CostPerSquareFoor) {
        this.CostPerSquareFoor = CostPerSquareFoor;
    }
    
    public BigDecimal getLaborCostPerSquareFoot() {
        return LaborCostPerSquareFoot;
    }
    
    public void setLaborCostPerSquareFoot(BigDecimal LaborCostPerSquareFoot) {
        this.LaborCostPerSquareFoot = LaborCostPerSquareFoot;
    }
}

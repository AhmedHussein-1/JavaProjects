/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.ui;

import com.sg.FloorCompany.dao.FloorCompanyDaoException;
import com.sg.FloorCompany.dto.Flooring;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class FloorCompanyView {
    
    public FloorCompanyView(UserIO io) {
        this.io = io;
    }
    
    private UserIO io;
    
    public int printMenuAndGetSelection() {
        io.print("<<Flooring Program>>");
        io.print("1. Display Orders");
        io.print("2. Add an Order");
        io.print("3. Edit an Order");
        io.print("4. Remove an Order");
        io.print("5. Export All Data");
        io.print("6. Quit");
        
        return io.readInt("Please select from the"
                    + " above choices.", 1, 6);
    }
    public Flooring addNewOrderInfo() {
        String dateEntry = io.readString("Please Enter Date: MMDDYYYY");
        String nameEntry = io.readString("Please Enter Your Name: ");
        String stateEntry = io.readString("Please Enter Your State Abbreviation: ");
        String productEntry = io.readString("Please Enter Product Type: ");
        BigDecimal areaEntry = io.readBigDecimal("Please Enter Area: ");
        
        Flooring currentOrder = new Flooring(1);
        currentOrder.setDateInfo(dateEntry);
        currentOrder.setCustomerName(nameEntry);
        currentOrder.setState(stateEntry);
        currentOrder.setProductType(productEntry);
        currentOrder.setArea(areaEntry);
       
        
        return currentOrder;
    }
    
    public void displayOrderList(List<Flooring> orderList) {
        for(Flooring currentOrder : orderList) {
            String orderInfo = String.format("%s , %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
                    currentOrder.getOrderNumber(),
                    currentOrder.getCustomerName(),
                    currentOrder.getState(),
                    currentOrder.getTaxRate(),
                    currentOrder.getProductType(),
                    currentOrder.getArea(),
                    currentOrder.getCostPerSquareFoot(),
                    currentOrder.getLaborCostPerSquareFoot(),
                    currentOrder.getMaterialCost(),
                    currentOrder.getLaborCost(),
                    currentOrder.getTax(),
                    currentOrder.getTotal());
                    io.print(orderInfo);
        }
        io.readString("Please hit Enter to continue");
    }
    
    public String getDate() {
        return io.readString("please Enter Todays Date: MMDDYYYY");
    }
    
    
    
    
}

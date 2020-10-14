/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.service;

import com.sg.FloorCompany.dao.FloorCompanyDao;
import com.sg.FloorCompany.dao.FloorCompanyDaoException;
import com.sg.FloorCompany.dao.FloorCompanyProductDao;
import com.sg.FloorCompany.dao.FloorCompanyProductDaoException;
import com.sg.FloorCompany.dao.FloorCompanyTaxDao;
import com.sg.FloorCompany.dao.FloorCompanyTaxDaoException;
import com.sg.FloorCompany.dto.Flooring;
import com.sg.FloorCompany.dto.Product;
import com.sg.FloorCompany.dto.Tax;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class FloorCompanyServiceLayerImpl implements FloorCompanyServiceLayer{
    
    FloorCompanyDao dao;
    FloorCompanyTaxDao taxDao;
    FloorCompanyProductDao prodDao;
    
    public FloorCompanyServiceLayerImpl() {
        
    }
    
    public FloorCompanyServiceLayerImpl(FloorCompanyDao dao, 
            FloorCompanyTaxDao taxDao, FloorCompanyProductDao prodDao){
        this.dao = dao;
        this.prodDao = prodDao;
        this.taxDao = taxDao;
    }

    @Override
    public List<Flooring> getAllFlooring(String date) throws FloorCompanyDaoException {
        return dao.displayAllOrder(date);
    }

    @Override
    public Flooring addOrder(int orderNumber, Flooring flooring) throws FloorCompanyDaoException, FloorCompanyTaxDaoException, FloorCompanyProductDaoException {
        Flooring taxInfo = getTaxRate(orderNumber, flooring);
        Flooring prodInfo = getCost(orderNumber, flooring);
        Flooring materialCostInfo = getMaterialCost(orderNumber, flooring);
        Flooring laborCostInfo = getLaborCost(orderNumber, flooring);
        Flooring taxCostInfo = getTaxCost(orderNumber, flooring);
        Flooring totalCostInfo = getTotalCost(orderNumber, flooring);
 
        Flooring addedOrder = dao.addOrder(orderNumber, flooring);
        return addedOrder;
    }

    @Override
    public Flooring editOrder() throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flooring removeOrder() throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flooring exportAllData() throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flooring getTaxRate(int orderNumber, Flooring flooring) throws FloorCompanyDaoException, FloorCompanyTaxDaoException {
        
        String stateOne = readTaxFile().get(0).getState();
        String stateTwo = readTaxFile().get(1).getState();
        String stateThree = readTaxFile().get(2).getState();
        String stateFour = readTaxFile().get(3).getState();
        if (stateOne.equals(flooring.getState())) {
            flooring.setTaxRate(readTaxFile().get(0).getTaxRate());
        } else if (stateTwo.equals(flooring.getState())) {
            flooring.setTaxRate(readTaxFile().get(1).getTaxRate());
        } else if (stateThree.equals(flooring.getState())) {
            flooring.setTaxRate(readTaxFile().get(2).getTaxRate());
        } else if (stateFour.equals(flooring.getState())) {
            flooring.setTaxRate(readTaxFile().get(3).getTaxRate());
        }
        return flooring;
    }

    @Override
    public Flooring getCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException, FloorCompanyProductDaoException {
        List<Product> productOne = readProductFile();

        if (readProductFile().get(0).getProductType().equals(flooring.getProductType())) {
            flooring.setLaborCostPerSquareFoot(readProductFile().get(0).getLaborCostPerSquareFoot());
            flooring.setCostPerSquareFoot(readProductFile().get(0).getLaborCostPerSquareFoot());
        } else if (readProductFile().get(1).getProductType().equals(flooring.getProductType())) {
            flooring.setLaborCostPerSquareFoot(readProductFile().get(1).getLaborCostPerSquareFoot());
            flooring.setCostPerSquareFoot(readProductFile().get(1).getLaborCostPerSquareFoot());
        } else if (readProductFile().get(2).getProductType().equals(flooring.getProductType())) {
            flooring.setLaborCostPerSquareFoot(readProductFile().get(2).getLaborCostPerSquareFoot());
            flooring.setCostPerSquareFoot(readProductFile().get(2).getLaborCostPerSquareFoot());
        } else if (readProductFile().get(3).getProductType().equals(flooring.getProductType())) {
            flooring.setLaborCostPerSquareFoot(readProductFile().get(3).getLaborCostPerSquareFoot());
            flooring.setCostPerSquareFoot(readProductFile().get(3).getLaborCostPerSquareFoot());
        }
        return flooring;
    }

    @Override
    public List<Tax> readTaxFile() throws FloorCompanyTaxDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> readProductFile() throws FloorCompanyProductDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flooring getMaterialCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Flooring getLaborCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException {
        BigDecimal area = flooring.getArea();
        BigDecimal laborCostPersquareFoot = flooring.getLaborCostPerSquareFoot();
        BigDecimal laborCost = area.multiply(laborCostPersquareFoot).setScale(2, RoundingMode.CEILING);
        flooring.setLaborCost(laborCost);
    return flooring;
    }

    @Override
    public Flooring getTaxCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException {
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal materialCost = flooring.getMaterialCost();
        BigDecimal laborCost = flooring.getLaborCost();
        BigDecimal taxRate = flooring.getTaxRate();
        BigDecimal tax = ((materialCost.add(laborCost)).multiply(taxRate.divide(oneHundred))).setScale(2, RoundingMode.CEILING);
        flooring.setTax(tax);
        return flooring;
    }

    @Override
    public Flooring getTotalCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException {
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal materialCost = flooring.getMaterialCost();
        BigDecimal laborCost = flooring.getLaborCost();
        BigDecimal taxRate = flooring.getTaxRate();
        BigDecimal tax = (materialCost.add(laborCost).multiply(taxRate.divide(oneHundred)));
        BigDecimal total = (materialCost.add(laborCost).add(tax)).setScale(2, RoundingMode.CEILING);
        flooring.setTotal(total);
        
        return flooring;
    }

    
}

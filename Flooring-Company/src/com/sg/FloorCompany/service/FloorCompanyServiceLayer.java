/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.service;

import com.sg.FloorCompany.dao.FloorCompanyDaoException;
import com.sg.FloorCompany.dao.FloorCompanyProductDaoException;
import com.sg.FloorCompany.dao.FloorCompanyTaxDaoException;
import com.sg.FloorCompany.dto.Flooring;
import com.sg.FloorCompany.dto.Product;
import com.sg.FloorCompany.dto.Tax;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface FloorCompanyServiceLayer {
    
    List<Flooring> getAllFlooring(String date) throws FloorCompanyDaoException;
    Flooring addOrder(int orderNumber,Flooring flooring) throws FloorCompanyDaoException, FloorCompanyTaxDaoException, FloorCompanyProductDaoException;
    Flooring editOrder(int orderNumber, Flooring flooring, String userDate) throws FloorCompanyDaoException, FloorCompanyTaxDaoException, FloorCompanyProductDaoException;
    Flooring removeOrder() throws FloorCompanyDaoException;
    Flooring exportAllData() throws FloorCompanyDaoException;
    
    
    Flooring getTaxRate(int orderNumber, Flooring flooring) throws FloorCompanyDaoException, FloorCompanyTaxDaoException;
    Flooring getCost(int orderNumber, Flooring flooring) throws FloorCompanyDaoException, FloorCompanyProductDaoException;
    public List<Tax> readTaxFile() throws FloorCompanyTaxDaoException;
    public List<Product> readProductFile() throws FloorCompanyProductDaoException;
    
    Flooring getMaterialCost(int orderNumber, Flooring flooring)throws FloorCompanyDaoException;
    Flooring getLaborCost(int orderNumber, Flooring flooring)throws FloorCompanyDaoException;
    Flooring getTaxCost(int orderNumber, Flooring flooring)throws FloorCompanyDaoException;
    Flooring getTotalCost(int orderNumber, Flooring flooring)throws FloorCompanyDaoException;
}


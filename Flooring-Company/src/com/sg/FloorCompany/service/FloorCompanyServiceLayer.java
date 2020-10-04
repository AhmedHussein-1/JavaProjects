/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.service;

import com.sg.FloorCompany.dao.FloorCompanyDaoException;
import com.sg.FloorCompany.dto.Flooring;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface FloorCompanyServiceLayer {
    
    List<Flooring> getAllFlooring() throws FloorCompanyDaoException;
    void addOrder(Flooring flooring) throws FloorCompanyDaoException;
    Flooring editOrder() throws FloorCompanyDaoException;
    Flooring removeOrder() throws FloorCompanyDaoException;
    Flooring exportAllData() throws FloorCompanyDaoException;
}

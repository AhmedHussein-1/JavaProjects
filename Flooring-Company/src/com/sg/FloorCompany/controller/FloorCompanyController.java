/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.controller;

import com.sg.FloorCompany.dao.FloorCompanyDao;
import com.sg.FloorCompany.dao.FloorCompanyDaoException;
import com.sg.FloorCompany.dao.FloorCompanyProductDaoException;
import com.sg.FloorCompany.dao.FloorCompanyTaxDaoException;
import com.sg.FloorCompany.dto.Flooring;
import com.sg.FloorCompany.service.FloorCompanyServiceLayer;
import com.sg.FloorCompany.ui.FloorCompanyView;
import java.util.List;

/**
 *
 * @author Maxka
 */
public class FloorCompanyController {

    private FloorCompanyServiceLayer service;
    private FloorCompanyView view;

    public FloorCompanyController(FloorCompanyServiceLayer service, FloorCompanyView view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws FloorCompanyTaxDaoException, FloorCompanyProductDaoException {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();
                switch (menuSelection) {
                    case 1:
                        displayOrders();
                        break;
                    case 2:
                        addOrder();
                        break;
                    case 3:
//                   editOrder();
                        break;
                    case 4:
//                   removeOrder();
                        break;
                    case 5:
//                   exportOrder)();
                        break;
                    default:
                }
            }
        } catch (FloorCompanyDaoException e) {
            
        }

    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void displayOrders() throws FloorCompanyDaoException {
        String date = view.getDate();
//        List<Flooring> orderList = dao.displayAllOrder(date);
//        view.displayOrderList(orderList);
    }

    private void addOrder() throws FloorCompanyDaoException, FloorCompanyTaxDaoException, FloorCompanyProductDaoException {
        Flooring addTo = view.addNewOrderInfo();
        service.addOrder(addTo.getOrderNumber(), addTo);
    }

    private void editOrder() {

    }

    private void removeOrder() {

    }

    private void exportOrder() {

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Snack;
import com.sg.vendingmachine.service.NoItemInventoryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Maxka
 */
public class VendingMachineDaoMock implements VendingMachineDao{

    @Override
    public List<Snack> getAllSnacks() throws VendingMachineDaoException {
        Map<String, Snack> callMap = new HashMap<>();
        return new ArrayList(callMap.values());
    }

    @Override
    public Snack getSnack(String name) throws VendingMachineDaoException {
        Snack newSnack = new Snack(name);
        return newSnack;
    }

    @Override
    public Snack removeSnack(String name) throws VendingMachineDaoException, NoItemInventoryException {
        Snack newSnack = new Snack(name);
        newSnack.setInventory(-1);
        return newSnack;
    }
    
}

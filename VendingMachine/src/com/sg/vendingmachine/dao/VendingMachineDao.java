/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Snack;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface VendingMachineDao {
    
    List<Snack> getAllSnacks() throws VendingMachineDaoException;
    Snack getSnack(String name) throws VendingMachineDaoException;
    Snack removeSnack(String name);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Product;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface FloorCompanyProductDao {
    List<Product> readProductFile() throws FloorCompanyProductDaoException;
}

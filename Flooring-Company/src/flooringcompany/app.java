/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flooringcompany;

import com.sg.FloorCompany.controller.FloorCompanyController;
import com.sg.FloorCompany.dao.FloorCompanyDao;
import com.sg.FloorCompany.dao.FloorCompanyDaoImpl;
import com.sg.FloorCompany.dao.FloorCompanyProductDao;
import com.sg.FloorCompany.dao.FloorCompanyProductDaoException;
import com.sg.FloorCompany.dao.FloorCompanyProductDaoImpl;
import com.sg.FloorCompany.dao.FloorCompanyTaxDao;
import com.sg.FloorCompany.dao.FloorCompanyTaxDaoException;
import com.sg.FloorCompany.dao.FloorCompanyTaxDaoImpl;
import com.sg.FloorCompany.service.FloorCompanyServiceLayer;
import com.sg.FloorCompany.service.FloorCompanyServiceLayerImpl;
import com.sg.FloorCompany.ui.FloorCompanyView;
import com.sg.FloorCompany.ui.UserIO;
import com.sg.FloorCompany.ui.UserIOConsoleImpl;

/**
 *
 * @author Maxka
 */
public class app {
    
    public static void main(String[] args) throws FloorCompanyTaxDaoException, FloorCompanyProductDaoException {
        UserIO io = new UserIOConsoleImpl();
        FloorCompanyDao dao = new FloorCompanyDaoImpl();
        FloorCompanyView view = new FloorCompanyView(io);
        FloorCompanyTaxDao taxDao = new FloorCompanyTaxDaoImpl();
        FloorCompanyProductDao prodDao = new FloorCompanyProductDaoImpl();
        FloorCompanyServiceLayer service = new FloorCompanyServiceLayerImpl(dao, taxDao, prodDao);
        FloorCompanyController controller = new FloorCompanyController(service, view);
        controller.run();
    }
}

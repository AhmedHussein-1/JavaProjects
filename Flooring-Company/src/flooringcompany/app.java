/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flooringcompany;

import com.sg.FloorCompany.controller.FloorCompanyController;
import com.sg.FloorCompany.dao.FloorCompanyDao;
import com.sg.FloorCompany.dao.FloorCompanyDaoImpl;
import com.sg.FloorCompany.ui.FloorCompanyView;
import com.sg.FloorCompany.ui.UserIO;
import com.sg.FloorCompany.ui.UserIOConsoleImpl;

/**
 *
 * @author Maxka
 */
public class app {
    
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        FloorCompanyDao dao = new FloorCompanyDaoImpl();
        FloorCompanyView view = new FloorCompanyView(io);
        FloorCompanyController controller = new FloorCompanyController(dao, view);
        controller.run();
    }
}

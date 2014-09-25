/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Binit
 * @author Devesh
 */
@WebService(serviceName = "Service")
public class Service {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "convertPoundToKg")
    public double convertPoundToKg(@WebParam(name = "name") String txt) {
        double weight = Double.parseDouble(txt);
        return weight / 2.2046;
    }
    
    @WebMethod(operationName = "convertKgToPound")
    public double convertKgToPound(@WebParam(name = "name") String txt) {
        double weight = Double.parseDouble(txt);
        return weight * 2.2046;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import application.*;
/**
 *
 * @author Binit
 */
public class IndeedApp {
    
    public static void main(String args[]) throws IOException_Exception, ParserConfigurationException_Exception, SAXException_Exception{
        
        IndeedService_Service service = new IndeedService_Service();
        IndeedService ser = service.getIndeedServicePort();
        String jobs = ser.searchJobs("intern", "California", null, null);
        System.out.println(jobs);
    }
}

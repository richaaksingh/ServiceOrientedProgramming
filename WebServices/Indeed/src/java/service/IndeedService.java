/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Binit
 * @author Devesh
 */
@WebService(serviceName = "IndeedService")
public class IndeedService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "searchJobs")
    public String searchJobs(@WebParam(name = "name") String query, String location, String city, String jobTitle)
            throws ParserConfigurationException, SAXException, IOException {

        int resultNode = 19;

        if (query == null) {
            query = "";
        }
        location = (location == null) ? "" : location;
        if ("".equals(city)) {
            resultNode = resultNode - 2;
        }
        jobTitle = (jobTitle == null) ? "" : jobTitle;

        StringBuilder res = new StringBuilder();
        String url = "http://api.indeed.com/ads/apisearch?publisher=3715321615320257"
                + "&q=" + query + "&l=" + location + "%2C+" + city + "&sort=&radius=&st=&jt=" + jobTitle + "&start=&limit=25&fromage=&"
                + "filter=&latlong=1&co=us&chnl=&userip=1.2.3.4&v=2";
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(url);
            doc.getDocumentElement().normalize();

            NodeList currentList = doc.getDocumentElement().getChildNodes();

            Node newNode = currentList.item(resultNode);
            if (newNode != null) {
                NodeList results = newNode.getChildNodes();

                for (int i = 1; i < results.getLength(); i = i + 2) {
                    Node result = results.item(i);
                    NodeList searchResult = result.getChildNodes();

                    Node title = searchResult.item(1);
                    Node company = searchResult.item(3);
                    Node loc = searchResult.item(11);
                    Node date = searchResult.item(15);
                    Node link = searchResult.item(19);

                    res.append(title.getTextContent());
                    res.append(";;");
                    res.append(company.getTextContent());
                    res.append(";;");
                    res.append(loc.getTextContent());
                    res.append(";;");
                    res.append(date.getTextContent());
                    res.append(";;");
                    res.append(link.getTextContent());

                    res.append("~");
                }
            }
            res = new StringBuilder(res.substring(0, res.length() - 1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    //    res = new StringBuilder(url);
        if (res.length() == 0) {
            return null;
        }
        return res.toString();
    }
}

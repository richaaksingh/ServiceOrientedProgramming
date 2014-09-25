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
@WebService(serviceName = "ESPNService")
public class ESPNService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getSportsNews")
    public String getSportsNews(@WebParam(name = "sportName") String sportName) throws SAXException, IOException, ParserConfigurationException {

        int limit = 10;

        if(sportName == null)
            return null;
        
        String url = "http://api.espn.com/v1/sports/" + sportName;
        String key = "?limit=" + limit + "&apikey=4d8h88kmrqjjv7xcxpwkdsh3&_accept=text/xml";

        StringBuilder res = new StringBuilder();

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(url + key);

        doc.getDocumentElement().normalize();

        NodeList currentList = doc.getDocumentElement().getChildNodes();

        Node sports = currentList.item(0);

        NodeList sportsItemList = sports.getChildNodes();

        for (int i = 0; i < sportsItemList.getLength(); i++) {

            Node sportsItem = sportsItemList.item(i);
            NodeList sport = sportsItem.getChildNodes();

            Node name = sport.item(0);
            res.append(name.getTextContent());
            res.append(";;");

            Node links = sport.item(3);
            if (links != null) {
                Node api = links.getChildNodes().item(0);
                if (api != null) {
                    NodeList apiList = api.getChildNodes();
                    for (int j = 0; j < apiList.getLength(); j++) {
                        if ("headlines".equalsIgnoreCase(apiList.item(j).getNodeName())) {
                            Node news = apiList.item(j);
                            Node newsLink = news.getChildNodes().item(0);
//                            System.out.println("Link: " + newsLink.getTextContent() + key);
                            res.append(getNewsLink(newsLink.getTextContent() + key));
                            break;
                        }
                    }
                    res.append(";;");
                }
            }
            
            Node leagues = sport.item(4);
            if (leagues != null) {
                NodeList leaguesItemList = leagues.getChildNodes();

                for (int j = 0; j < leaguesItemList.getLength(); j++) {
                    Node leaguesItem = leaguesItemList.item(j);
                    Node league = leaguesItem.getChildNodes().item(0);
                    res.append(league.getTextContent());
                    res.append("#");
                }
                res = new StringBuilder(res.substring(0, res.length() - 1));
            } else {
                res = new StringBuilder(res.substring(0, res.length() - 1));
            }
            res.append("~");
        }
        res = new StringBuilder(res.substring(0, res.length() - 1));
        if (res.length() == 0) {
            return null;
        }
        return res.toString();
    }

    public static String getNewsLink(String url) throws ParserConfigurationException, SAXException, IOException {

        StringBuilder res = new StringBuilder();

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(url);

        doc.getDocumentElement().normalize();

        NodeList currentList = doc.getDocumentElement().getChildNodes();

        NodeList headLinesItemList = currentList.item(5).getChildNodes();

        for (int i = 0; i < headLinesItemList.getLength(); i++) {
            NodeList headLinesItem = headLinesItemList.item(i).getChildNodes();
            res.append(headLinesItem.item(0).getTextContent());
            res.append("@");
//			System.out.println("headlines: " + headLinesItem.item(0).getTextContent());
            for (int j = 0; j < headLinesItem.getLength(); j++) {
                if ("links".equalsIgnoreCase(headLinesItem.item(j).getNodeName())) {
                    res.append(headLinesItem.item(j).getChildNodes().item(1).getChildNodes().item(0).getTextContent());
                    break;
                }
            }
            res.append("#");
//			System.out.println("link: " + headLinesItem.item(5).getChildNodes().item(1).getChildNodes().item(0).getTextContent());
        }
        res = new StringBuilder(res.substring(0, res.length() - 1));
        return res.toString();

    }
}

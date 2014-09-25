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
@WebService(serviceName = "BestBuyService")
public class BestBuyService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "searchProduct")
    public String searchProduct(@WebParam(name = "search")String search, @WebParam(name = "manufacturer")String manufacturer, 
            @WebParam(name = "minPrice")String minPrice, @WebParam(name = "maxPrice")String maxPrice)
            throws SAXException, IOException, ParserConfigurationException {
        
        if("".equals(search) || search ==null)
            search = "";
        if("".equals(manufacturer) || manufacturer ==null)
            manufacturer = "";
        if("".equals(minPrice) || minPrice == null)
            minPrice = "0";
        if("".equals(maxPrice) || maxPrice == null)
            maxPrice = "";
        else maxPrice = "&salePrice<"+maxPrice;
        
        if(search.equals("") && manufacturer.equals(""))
            return null;
        
        String url = "http://api.remix.bestbuy.com/v1/products(search=" + search + "*&manufacturer=" + manufacturer + "*&salePrice>" + minPrice
                + maxPrice + ")?format=xml&show=sku,name,salePrice,url&apiKey=5py93ys4t459u8trg6tjextf";

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(url);
        doc.getDocumentElement().normalize();

        NodeList productList = doc.getDocumentElement().getChildNodes();

        StringBuilder res = new StringBuilder();
        for (int i = 1; i < productList.getLength(); i = i + 2) {
            Node product = productList.item(i);
            NodeList productDetails = product.getChildNodes();

            for (int j = 1; j < productDetails.getLength(); j = j + 2) {
                res.append(productDetails.item(j).getTextContent());
                res.append(";;");
            }
            res = new StringBuilder(res.substring(0, res.length() - 2));
            res.append("~");
        }
        if (res.length() > 0) {
            res = new StringBuilder(res.substring(0, res.length() - 1));
        }
        return res.toString();
    }
}

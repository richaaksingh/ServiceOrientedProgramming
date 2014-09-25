<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Search Jobs</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/frame.css" rel="stylesheet" type="text/css">
        <script src="scripts/service.js"></script>
        <style>
            .sleek
            {
                border:1px solid black;
                border-collapse:collapse;
            }</style>
    </head>
    <body>
        <div id="tabContainer">
            <div class="tabs">
                <ul>
                    <li >Best Buy</li>
                </ul>
            </div>
            <div class="tabscontent">
                <div class="tabpage" id="tabpage_1">
                    It is an application of Best Buy Web Service.
                    <p>You can search any product available on Best Buy website by providing information about 
                    either the product or manufacturer and price range.</p>
                    <p>Example: product = laptop, manufacturer = Lenovo, Min Price = 400, Max Price = 1000</p>
                    <br><br>
                    <form action="index.jsp" method="post">
                        <table>
                            <tr><td>Product: </td><td><input type="text" name="product"></td></tr>
                            <tr><td>Manufacturer: </td><td><input type="text" name="manu"></td></tr>
                            <tr><td>Min Price: </td><td><input type="text" name="minPrice"></td></tr>
                            <tr><td>Max Price: </td><td><input type="text" name="maxPrice"></td></tr>
                            <tr><td><input type="submit" name="search" value="Search"></td><td></td></tr>
                        </table>
                    </form>
                    
                    <%-- start web service invocation --%>
                    <%
                        String product = request.getParameter("product");
                        String manu = request.getParameter("manu");
                        String minPrice = request.getParameter("minPrice");
                        String maxPrice = request.getParameter("maxPrice");
                       
                        try {
                            application.BestBuyService_Service service = new application.BestBuyService_Service();
                            application.BestBuyService port = service.getBestBuyServicePort();
                            String searchResult = port.searchProduct(product, manu, minPrice, maxPrice);
                            if (searchResult != null && !searchResult.equals("")) {
                                String[] results = searchResult.split("~");
                    %>
                    <br>
                    <table class="sleek">
                        <tr class="sleek">
                            <th class="sleek">SKU</th>
                            <th class="sleek">Product Name</th>
                            <th class="sleek">Price</th>
                            <th class="sleek">URL</th>
                        </tr>
                        <%
                            for (String eachResult : results) {
                                String[] result = eachResult.split(";;");
                        %>
                        <tr class="sleek">
                            <td class="sleek"><%=result[0]%></td>
                            <td class="sleek"><%=result[1]%></td>
                            <td class="sleek"><%=result[2]%></td>
                            <td class="sleek"><a target="_blank" href="<%=result[3]%>">click here</a></td>
                        </tr>
                        <%}%>
                    </table>
                    <%
                            }
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                    <%-- end web service invocation --%>
                </div>
            </div>
        </div>
    </body>
</html>

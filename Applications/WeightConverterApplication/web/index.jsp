<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Weight Converter</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/frame.css" rel="stylesheet" type="text/css">
        <script src="scripts/service.js"></script>
    </head>
    <body>
        <div id="tabContainer">
            <div class="tabs">
                <ul>
                    <li id="tabHeader_1">Weight Converter</li>
                </ul>
            </div>

            <div class="tabscontent">
                <div class="tabpage" id="tabpage_1">
                    It is an application of Weight Converter Web Service.
                    <p>It converts weight from Kilograms to Pound or Pound to Kilograms.</p>
                    <p>Enter any weight and convert it to Pound or Kilograms.</p>
                    <p>Example: Weight = 150 and click on "PoundToKg"</p>
                    <br><br>
                    <form action="index.jsp" method="post">
                        Weight: <input type="text" name="wt">
                        <input type="submit" name="PoundToKg" value="PoundToKg">
                        <input type="submit" name="KgToPound" value="KgToPound">
                    </form>
                    <br>
                    <%-- start web service invocation --%>
                    <%
                        String PoundToKg = request.getParameter("PoundToKg");
                        String KgToPound = request.getParameter("KgToPound");
                        String weight = request.getParameter("wt");
                        try {
                            application.Service_Service service = new application.Service_Service();
                            application.Service port = service.getServicePort();

                            // TODO process result here
                            double result = -1;
                            if (PoundToKg != null) {
                                result = port.convertPoundToKg(weight);
                            } else if (KgToPound != null) {
                                result = port.convertKgToPound(weight);
                            }
                            if (result > -1) {
                                out.println(result);
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

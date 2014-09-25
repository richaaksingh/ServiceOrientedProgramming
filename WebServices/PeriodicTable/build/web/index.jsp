<%-- 
    Document   : index
    Created on : Jun 29, 2014, 8:15:20 PM
    Author     : Binit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Periodic Table</title>
        <link href="css/frame.css" rel="stylesheet" type="text/css">
        <script src="scripts/service.js"></script>
    </head>
    <body>
        <div id="tabContainer">
            <div class="tabs">
                <ul>
                    <li id="tabHeader_1">Periodic Table</li>
                </ul>
            </div>

            <div class="tabscontent">
                <div class="tabpage" id="tabpage_1">
                    It is an application of Periodic Table Web Service
                    <p>Click on "Get All Atoms" to get all the elements of Periodic table.</p>
                    <p>Enter any element name in the box provided to find out its Atomic number or Atomic Weight.</p>
                    <p>Example: Element = Oxygen</p>
                    <br><br>
                    <form action="index.jsp" method="post">
                        <table>
                            <tr><td><input type="submit" name="atoms" value="Get All Atoms"></td><td></td></tr>
                            <tr><td>Element: </td><td><input type="text" name="ele"></td></tr>
                            <tr><td><input type="submit" name="number" value="Get Atomic Number"></td>
                                <td><input type="submit" name="weight" value="Get Atomic Weight"></td><td></td></tr>
                        </table>
                    </form>
                    <br>
                    <%-- start web service invocation --%>
                    <%
                        String element = request.getParameter("ele");
                        String atoms = request.getParameter("atoms");
                        String number = request.getParameter("number");
                        String weight = request.getParameter("weight");
                        try {
                            service.Periodictable service = new service.Periodictable();
                            service.PeriodictableSoap port = service.getPeriodictableSoap();
                            // TODO initialize WS operation arguments here
                            String elementName = element;
                            String result = "";
                            if (atoms != null && !"".equals(atoms)) {
                                result = port.getAtoms();
                            } else if (number != null && !"".equals(number)) {
                                result = port.getAtomicNumber(elementName);
                                result = result.split(elementName)[0];
                            } else if (weight != null && !"".equals(weight)) {
                                result = port.getAtomicWeight(elementName);
                            }

                            out.println(result);
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

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Sports Search</title>
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
                    <li id="tabHeader_1">ESPN</li>
                </ul>
            </div>

            <div class="tabscontent">
                <div class="tabpage" id="tabpage_1">
                    It is an application of ESPN Web Service.
                    <p>You can find latest information and News about any sports on ESPN channel. Enter sports name in the space below.</p>
                    <p>Example: Sport Name = Soccer</p>
                    <br><br>
                    <form action="index.jsp" method="post">
                        <table>
                            <tr><td>Sport Name: </td><td><input type="text" name="sport"></td></tr>
                            <tr><td><input type="submit" name="search" value="Search"></td><td></td></tr>
                        </table>
                    </form>

                    <%-- start web service invocation --%>
                    <%
                        String sport = request.getParameter("sport");
                        try {
                            application.ESPNService_Service service = new application.ESPNService_Service();
                            application.ESPNService port = service.getESPNServicePort();

                            String searchResult = port.getSportsNews(sport);

                            if (searchResult != null) {
                                String[] sportItems = searchResult.split("~");
                    %>
                    <br>
                    <table class="sleek">
                        <tr class="sleek">
                            <th class="sleek">Sport</th>
                            <th class="sleek">News Headlines</th>
                            <th class="sleek">Leagues</th>
                        </tr>
                        <%
                            for (String sportItem : sportItems) {
                                String[] sports = sportItem.split(";;");
                        %>
                        <tr class="sleek">
                            <td class="sleek" valign="top"><%=sports[0]%></td>
                            <td class="sleek" valign="top">
                                <%if (sports.length > 1 && !"".equals(sports[1])) {
                                        String[] news = sports[1].split("#");
                                        for (String headlines : news) {
                                            String[] headline = headlines.split("@");
                                %><a target="_blank" href="<%=headline[1]%>"><%=headline[0]%></a><br>
                                <%      }
                        }%>
                            </td>
                            <td class="sleek" valign="top">
                                <%if (sports.length > 2 && !"".equals(sports[2])) {
                                        String[] leagues = sports[2].split("#");
                                        for (String league : leagues) {
                                            out.println(league);%><br>
                                <%}
                        }%>
                            </td>
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

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
                    <li id="tabHeader_1">Indeed</li>
                </ul>
            </div>

            <div class="tabscontent">
                <div class="tabpage" id="tabpage_1">
                    It is an application of Indeed Web Service.
                    <p>You can search any job postings available on Indeed website.</p>
                    <p>Provide Keyword such as intern/co op/java intern, State is mandatory, City within that state and Job Title like Software Developer/Web Developer etc.</p>
                    <p>Example: Keyword = java intern, State = California, City = San Francisco, Job Title = Software Developer Intern</p>
                    <br><br>
                    <form action="index.jsp" method="post">
                        <table>
                            <tr><td>Keyword: </td><td><input type="text" name="query"></td></tr>
                            <tr><td>State:* </td><td><input type="text" name="loc"></td></tr>
                            <tr><td>City: </td><td><input type="text" name="city"></td></tr>
                            <tr><td>Job Title: </td><td><input type="text" name="title"></td></tr>
                            <tr><td><input type="submit" name="search" value="Search"></td><td></td></tr>
                        </table>
                    </form>

                    <%-- start web service invocation --%>
                    <%
                        String query = request.getParameter("query");
                        String location = request.getParameter("loc");
                        String city = request.getParameter("city");
                        String title = request.getParameter("title");
                        try {
                            application.IndeedService_Service service = new application.IndeedService_Service();
                            application.IndeedService port = service.getIndeedServicePort();

                            String searchResult = port.searchJobs(query, location, city, title);

                            if (searchResult != null) {
                                String[] results = searchResult.split("~");
                    %>
                    <br>
                    <table class="sleek">
                        <tr class="sleek">
                            <th class="sleek">Position</th>
                            <th class="sleek">Company</th>
                            <th class="sleek">Location</th>
                            <th class="sleek">Date Posted</th>
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
                            <td class="sleek"><%=result[3]%></td>
                            <td class="sleek"><a target="_blank" href="<%=result[4]%>">click here</a></td>
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

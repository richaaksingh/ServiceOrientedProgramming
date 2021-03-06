package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Search Jobs</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"css/frame.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <script src=\"scripts/service.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .sleek\r\n");
      out.write("            {\r\n");
      out.write("                border:1px solid black;\r\n");
      out.write("                border-collapse:collapse;\r\n");
      out.write("            }</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"tabContainer\">\r\n");
      out.write("            <div class=\"tabs\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li id=\"tabHeader_1\">Indeed</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tabscontent\">\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_1\">\r\n");
      out.write("                    It is an application of Indeed Web Service.\r\n");
      out.write("                    <p>You can search any job postings available on Indeed website.</p>\r\n");
      out.write("                    <p>Provide Keyword such as intern/co op/java intern, State is mandatory, City within that state and Job Title like Software Developer/Web Developer etc.</p>\r\n");
      out.write("                    <p>Example: Keyword = java intern, State = California, City = San Francisco, Job Title = Software Developer Intern</p>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr><td>Keyword: </td><td><input type=\"text\" name=\"query\"></td></tr>\r\n");
      out.write("                            <tr><td>State:* </td><td><input type=\"text\" name=\"loc\"></td></tr>\r\n");
      out.write("                            <tr><td>City: </td><td><input type=\"text\" name=\"city\"></td></tr>\r\n");
      out.write("                            <tr><td>Job Title: </td><td><input type=\"text\" name=\"title\"></td></tr>\r\n");
      out.write("                            <tr><td><input type=\"submit\" name=\"search\" value=\"Search\"></td><td></td></tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");

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
                    
      out.write("\r\n");
      out.write("                    <table class=\"sleek\">\r\n");
      out.write("                        <tr class=\"sleek\">\r\n");
      out.write("                            <th class=\"sleek\">Position</th>\r\n");
      out.write("                            <th class=\"sleek\">Company</th>\r\n");
      out.write("                            <th class=\"sleek\">Location</th>\r\n");
      out.write("                            <th class=\"sleek\">Date Posted</th>\r\n");
      out.write("                            <th class=\"sleek\">URL</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            for (String eachResult : results) {
                                String[] result = eachResult.split(";;");
                        
      out.write("\r\n");
      out.write("                        <tr class=\"sleek\">\r\n");
      out.write("                            <td class=\"sleek\">");
      out.print(result[0]);
      out.write("</td>\r\n");
      out.write("                            <td class=\"sleek\">");
      out.print(result[1]);
      out.write("</td>\r\n");
      out.write("                            <td class=\"sleek\">");
      out.print(result[2]);
      out.write("</td>\r\n");
      out.write("                            <td class=\"sleek\">");
      out.print(result[3]);
      out.write("</td>\r\n");
      out.write("                            <td class=\"sleek\"><a target=\"_blank\" href=\"");
      out.print(result[4]);
      out.write("\">click here</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");

                            }
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

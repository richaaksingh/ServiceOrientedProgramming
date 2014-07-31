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
      out.write("        <title>Sports Search</title>\r\n");
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
      out.write("                    <li id=\"tabHeader_1\">Home</li>\r\n");
      out.write("                    <li id=\"tabHeader_2\">ESPN</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tabscontent\">\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_1\">\r\n");
      out.write("                    It is an application of ESPN Web Service\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_2\">\r\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr><td>Sport Name: </td><td><input type=\"text\" name=\"sport\"></td></tr>\r\n");
      out.write("                            <tr><td><input type=\"submit\" name=\"search\" value=\"Search\"></td><td></td></tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");

                        String sport = request.getParameter("sport");
                        try {
                            application.ESPNService_Service service = new application.ESPNService_Service();
                            application.ESPNService port = service.getESPNServicePort();

                            String searchResult = port.getSportsNews(sport);

                            if (searchResult != null) {
                                String[] sportItems = searchResult.split("~");
                    
      out.write("\r\n");
      out.write("                    <table class=\"sleek\">\r\n");
      out.write("                        <tr class=\"sleek\">\r\n");
      out.write("                            <th class=\"sleek\">Sport</th>\r\n");
      out.write("                            <th class=\"sleek\">News Headlines</th>\r\n");
      out.write("                            <th class=\"sleek\">Leagues</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            for (String sportItem : sportItems) {
                                String[] sports = sportItem.split(";;");
                        
      out.write("\r\n");
      out.write("                        <tr class=\"sleek\">\r\n");
      out.write("                            <td class=\"sleek\" valign=\"top\">");
      out.print(sports[0]);
      out.write("</td>\r\n");
      out.write("                            <td class=\"sleek\" valign=\"top\">\r\n");
      out.write("                                ");
if (sports.length > 1 && !"".equals(sports[1])) {
                                        String[] news = sports[1].split("#");
                                        for (String headlines : news) {
                                            String[] headline = headlines.split("@");
                                
      out.write("<a target=\"_blank\" href=\"");
      out.print(headline[1]);
      out.write('"');
      out.write('>');
      out.print(headline[0]);
      out.write("</a><br>\r\n");
      out.write("                                ");
      }
                        }
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"sleek\" valign=\"top\">\r\n");
      out.write("                                ");
if (sports.length > 2 && !"".equals(sports[2])) {
                                        String[] leagues = sports[2].split("#");
                                        for (String league : leagues) {
                                            out.println(league);
      out.write("<br>\r\n");
      out.write("                                ");
}
                        }
      out.write("\r\n");
      out.write("                            </td>\r\n");
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

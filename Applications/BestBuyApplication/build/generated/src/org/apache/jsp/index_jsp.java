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
      out.write("                    <li id=\"tabHeader_1\">Home</li>\r\n");
      out.write("                    <li id=\"tabHeader_2\">Best Buy</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"tabscontent\">\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_1\">\r\n");
      out.write("                    It is an application of Best Buy Web Service\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_2\">\r\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr><td>Product: </td><td><input type=\"text\" name=\"product\"></td></tr>\r\n");
      out.write("                            <tr><td>Manufacturer: </td><td><input type=\"text\" name=\"manu\"></td></tr>\r\n");
      out.write("                            <tr><td>Min Price: </td><td><input type=\"text\" name=\"minPrice\"></td></tr>\r\n");
      out.write("                            <tr><td>Max Price: </td><td><input type=\"text\" name=\"maxPrice\"></td></tr>\r\n");
      out.write("                            <tr><td><input type=\"submit\" name=\"search\" value=\"Search\"></td><td></td></tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");

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
                    
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <table class=\"sleek\">\r\n");
      out.write("                        <tr class=\"sleek\">\r\n");
      out.write("                            <th class=\"sleek\">SKU</th>\r\n");
      out.write("                            <th class=\"sleek\">Product Name</th>\r\n");
      out.write("                            <th class=\"sleek\">Price</th>\r\n");
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
      out.write("                            <td class=\"sleek\"><a target=\"_blank\" href=\"");
      out.print(result[3]);
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

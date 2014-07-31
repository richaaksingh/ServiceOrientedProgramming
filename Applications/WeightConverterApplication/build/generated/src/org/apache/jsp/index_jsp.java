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
      out.write("        <title>Weight Converter</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"css/frame.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <script src=\"scripts/service.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"tabContainer\">\r\n");
      out.write("            <div class=\"tabs\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li id=\"tabHeader_1\">Home</li>\r\n");
      out.write("                    <li id=\"tabHeader_2\">Weight Converter</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tabscontent\">\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_1\">\r\n");
      out.write("                    It is an application of Weight Converter Web Service\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tabpage\" id=\"tabpage_2\">\r\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\">\r\n");
      out.write("                        Enter Weight: <input type=\"text\" name=\"wt\">\r\n");
      out.write("                        <input type=\"submit\" name=\"PoundToKg\" value=\"PoundToKg\">\r\n");
      out.write("                        <input type=\"submit\" name=\"KgToPound\" value=\"KgToPound\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");

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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Staff Login</title>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            td{\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                width :100%;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: lightslategrey;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <img src=\"image/UTMimage10.jpg\" alt=\"\" width=\"1900\" height=\"550\"/>\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form action=\"StudentLogin\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> User name </td>\n");
      out.write("                    <td><input type=\"text\" class=\"form-control\" name =\"username\" placeholder=\"Acid\"></td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\"class=\"form-control\" name =\"password\" placeholder=\"Password\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"text-align: center\"><input class =\"btn btn-success\" type=\"submit\" value=\"submit\" </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <h1 align=\"center\"> Welcome to <img src=\"image/LOGO-UTM.png\" alt=\"\" width=\"100\" height=\"40\"> Security System  </h1>\n");
      out.write("                <center> <h1> <u> Student Login </u> </h1></center>\n");
      out.write("                \n");
      out.write("                <p style=\"font-size:30px;\"> <a href=\"index.jsp\"> Staff Login </a></p>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class helpStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>CSS Template</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the header */\n");
      out.write("header {\n");
      out.write("  background-color: #666;\n");
      out.write("  padding: 60px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 55px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create two columns/boxes that floats next to each other */\n");
      out.write("nav {\n");
      out.write("  float: left;\n");
      out.write("  width: 30%;\n");
      out.write("  height: 300px; /* only for demonstration, should be removed */\n");
      out.write("  background: #ccc;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the list inside the menu */\n");
      out.write("nav ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("article {\n");
      out.write("  float: left;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 70%;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  height: 300px; /* only for demonstration, should be removed */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write("section:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the footer */\n");
      out.write("footer {\n");
      out.write("  background-color: #777;\n");
      out.write("  padding: 30px;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("  nav, article {\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("  <h2>Help</h2>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section> \n");
      out.write("  <article>\n");
      out.write("    <h1>This Instruction for Students </h1>\n");
      out.write("    <p>    <h3> Dear Students, You can get a tracking Sticker for your own security. This security system will help you to secure your all personal belongings.\n");
      out.write("        Sticker system with tracking code will be used for university student.The student will need to log in to this profile by using the acid account.\n");
      out.write("        After logging into this system. The student will search from his own tracking ID to see if his belongings have been found or not.\n");
      out.write("            The university will provide 10 tracking id for each student and staff. Each tracking id will have 2 stickers. The student needs to attach one sticker to \n");
      out.write("         his/her important item and one will be with him/her for verification purpose.</h3>\n");
      out.write("    <h2> How to report a lost item?</h2>\n");
      out.write("           <h3> When an item is lost the student needs to report it using the lost & found web site. He/she will have to log in to the system using ic number and password.\n");
      out.write("         Then go to the lost item option and provide the information including the tracking id that he/she has. In this way the item will be in the lost category.</h3>\n");
      out.write("    <h2> How to report a found item?</h2>\n");
      out.write("            <h3> When someone found any lost item he/she will have to take the item to the faculty lost & found box or hostel lost & found box. The staff will then collect\n");
      out.write("         the item, log in to the lost & found web site, go the found item option and put the relevant information including the tracking id from the sticker that the\n");
      out.write("         student provided with the item. In this way the item will be categorized as a found item. </h3>\n");
      out.write("     <h2> How to get the found item?</h2>\n");
      out.write("           <h3>  After making a lost report the student needs to check in the found item option. If the item is found, it will be in the found item list. And then the student\n");
      out.write("         can match his/her lost tracking id with the lists found item's tracking id. If It match with the id then the student can come to the faculty or hostel for \n");
      out.write("         verification. The staff will verify using the tracking id and give the item to its owner.</h3>\n");
      out.write("   </p>\n");
      out.write("    \n");
      out.write("  </article>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

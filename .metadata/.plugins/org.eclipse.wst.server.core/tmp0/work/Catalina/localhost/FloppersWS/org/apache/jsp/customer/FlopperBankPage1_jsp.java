package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FlopperBankPage1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("   <script src=\"js/script.js\"></script>\r\n");
      out.write("<title>Welcome To Flopper's Bank</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t<div style=\"float: left;\"> <a id=\"logo\" href=\"FlopperBankPage1.jsp\">\r\n");
      out.write("\t\t\t<img width=\"150\" height=\"140\" alt=\"logo\" src=\"images/FB.jpg\"> \t\t\t\r\n");
      out.write("\t\t</a></div>\r\n");
      out.write("\t\t<div style=\"margin-left: 220px; \"><font color=\"blue\" face=\"Chiller\" size=\"36\">FLOPPERS BANK</font></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id='cssmenu'>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t   <li class='active'><a href='#'>Home</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Personal Banking</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Corporate Banking</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Loan</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Payments</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Apply New SB Account</a></li>\r\n");
      out.write("\t\t   <li><a href='#'>Contact Us</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) config.getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(JspContext.class,jspContext);

    try {
      out.write("\r\n");
      out.write("<div id='cssmenu'>\r\n");
      out.write("\t<ul style=\"list-style-type: none;\">\r\n");
      out.write("\t\t<li class='active'><a href='#'>Account</a></li>\r\n");
      out.write("\t\t<li><a href='#'>Fund Transfer</a></li>\r\n");
      out.write("\t\t<li><a href='#'>Cards</a></li>\r\n");
      out.write("\t\t<li><a href='#'>Loan</a></li>\r\n");
      out.write("\t\t<li><a href='#'>Payments</a></li>\r\n");
      out.write("\t\t<li><a href='#'>Offers</a></li>\r\n");
      out.write("\t\t<li>Help\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>");
      out.print(session.getAttribute("LASTLOGINTIME"));
      out.write("</li>\r\n");
      out.write("\t\t\t\t<li>Subitem 2</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"right\"><b class=\"value\"> &nbsp;");
      out.print(session.getAttribute("LASTLOGINTIME"));
      out.write("\r\n");
      out.write("\t\t\t</b></li>\r\n");
      out.write("\t\t\t<li class=\"right\"><b class=\"value\"> &nbsp;");
      out.print(session.getAttribute("USER_NAME"));
      out.write("\r\n");
      out.write("\t\t\t</b></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      jspContext.getELContext().putContext(JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}

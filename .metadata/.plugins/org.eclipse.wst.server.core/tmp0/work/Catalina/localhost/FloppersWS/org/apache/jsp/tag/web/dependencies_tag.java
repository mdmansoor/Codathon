package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dependencies_tag
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
      out.write('\r');
      out.write('\n');

	javax.servlet.http.HttpServletRequest _request = (javax.servlet.http.HttpServletRequest) request;
	String _path = _request.getContextPath();

      out.write("\r\n");
      out.write("<title>Bank @ Doorstep | Home</title>\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("<meta name=\"csrf-param\" content=\"authenticity_token\" />\r\n");
      out.write("<meta name=\"csrf-token\"\r\n");
      out.write("\tcontent=\"hXd+vKEj5uvuJtnzkJRrU897Hm/f3sJd1VO7SEXrRHp8+TMT9DxbrRSPR6DNk8haOLUOY6Zn/kT/Sk3mM63+8A==\" />\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\"\r\n");
      out.write("\thref=\"http://dev.kandy.io:3000/assets/favicon-3da99d2536c9fa570157780f5d5f6f0d.ico\" />\r\n");
      out.write("\r\n");
      out.write("<!--Load Bootstrap CSS (optional)-->\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\" />\r\n");
      out.write("\r\n");
      out.write("<!--Load Kandy JS files (required - jQuery is required too!)-->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://kandy-portal.s3.amazonaws.com/public/javascript/fcs/3.0.4/fcs.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://kandy-portal.s3.amazonaws.com/public/javascript/kandy/2.2.2/kandy.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Load Pace AJAX Progress Bar (optional)-->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/pace.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/pace/1.0.2/themes/pink/pace-theme-minimal.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../codebase/dhtmlxcalendar.css\" />\r\n");
      out.write("<script src=\"../codebase/dhtmlxcalendar.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/common/css/common.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(_path);
      out.write("/common/js/common.js\"></script>\r\n");
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

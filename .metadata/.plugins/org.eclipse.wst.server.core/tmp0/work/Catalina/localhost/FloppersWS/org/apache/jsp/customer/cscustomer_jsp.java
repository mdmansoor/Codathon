package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cscustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tags/dependencies.tag");
    _jspx_dependants.add("/WEB-INF/tags/script.tag");
    _jspx_dependants.add("/WEB-INF/tags/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/footer.tag");
  }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_tags_005fdependencies_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tags_005fscript_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-8\" id=\"activity-container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t<form id=\"login-form\" class=\"simple_form form-horizontal\"\r\n");
      out.write("\t\t\t\t\t\t\tnovalidate=\"novalidate\" action=\"\" accept-charset=\"UTF-8\"\r\n");
      out.write("\t\t\t\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"authenticity_token\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"OlargpQtQGzKE+3wa9sKoPyc6HIeZ9GMmL1fUGlfwejD2OYtwTL9KjC6c6M23KmpC1L4fmfe7ZWypKn+Hxl7Yg==\" />\r\n");
      out.write("\t\t\t\t\t\t\t<br> <br> <br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Login as Customer, Click login button</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group string required quick_start_login_api_key\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"string required col-sm-3 control-label hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"api_key\"><abbr title=\"required\">*</abbr> Project\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAPI Key</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"api_key\" name=\"api_key\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"string required form-control hidden\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"DAK5aa3e878df1d46ca9f83e27ad0dfba1f\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-group string required quick_start_login_username\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"string required col-sm-3 control-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"username\"><abbr title=\"required\">*</abbr> Username</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"username\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"string required form-control\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"customer1\" disabled />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-group password required quick_start_login_password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"password required col-sm-3 control-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor=\"password\"><abbr title=\"required\">*</abbr> Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"password required form-control\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"reset@123\" disabled />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-offset-3 col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" name=\"commit\" value=\"Login\" id=\"login-btn\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-success\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"hidden\" id=\"logged-in\">\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"h4 pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Hello <span class=\"username\"></span></strong>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-danger pull-right\" id=\"logout-btn\">Logout</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<div id=\"video-container\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Video</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"video\" id=\"incoming-video\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"video\" id=\"outgoing-video\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t<div class=\"hidden\" id=\"incoming-call\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Incoming Call</h4>\r\n");
      out.write("\t\t\t\t\t\t<p id=\"username-incoming\"></p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-toolbar\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-success\" id=\"answer-call-btn\">Answer\r\n");
      out.write("\t\t\t\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-warning\" id=\"reject-call-btn\">Reject\r\n");
      out.write("\t\t\t\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"hidden\" id=\"call-connected\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Call Connected</h4>\r\n");
      out.write("\t\t\t\t\t\t<p id=\"username-connected\"></p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-toolbar\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-danger\" id=\"end-call-btn\">End\r\n");
      out.write("\t\t\t\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-warning\" id=\"hold-call-btn\">Hold\r\n");
      out.write("\t\t\t\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-success hidden\" id=\"resume-call-btn\">Resume\r\n");
      out.write("\t\t\t\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"row\">\r\n");
      out.write("\t\t\t<div id=\"chat-container\" class=\"hidden\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<label for=\"chat-messages\" class=\"bg-warning\">Chat message:</label>\r\n");
      out.write("\t\t\t\t\t<div id=\"chat-messages\" class=\"bg-info\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"chat-input\" class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"chat-contacts\">Select Customer to send message</label>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"chat-contacts\" id=\"chat-contacts\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\"></select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"chat-message\">Message:</label>\r\n");
      out.write("\t\t\t\t\t\t<textarea name=\"chat-message\" id=\"chat-message\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button name=\"button\" type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\tid=\"chat-btn\">Send</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      if (_jspx_meth_tags_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_tags_005fdependencies_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:dependencies
    org.apache.jsp.tag.web.dependencies_tag _jspx_th_tags_005fdependencies_005f0 = new org.apache.jsp.tag.web.dependencies_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fdependencies_005f0);
    _jspx_th_tags_005fdependencies_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005fdependencies_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fdependencies_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fscript_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:script
    org.apache.jsp.tag.web.script_tag _jspx_th_tags_005fscript_005f0 = new org.apache.jsp.tag.web.script_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fscript_005f0);
    _jspx_th_tags_005fscript_005f0.setJspContext(_jspx_page_context);
    // /customer/cscustomer.jsp(8,0) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fscript_005f0.setSrc("customer/cscustomer.js");
    _jspx_th_tags_005fscript_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fscript_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fheader_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tags_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    _jspx_th_tags_005fheader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005fheader_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005ffooter_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:footer
    org.apache.jsp.tag.web.footer_tag _jspx_th_tags_005ffooter_005f0 = new org.apache.jsp.tag.web.footer_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005ffooter_005f0);
    _jspx_th_tags_005ffooter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005ffooter_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tags_005ffooter_005f0);
    return false;
  }
}

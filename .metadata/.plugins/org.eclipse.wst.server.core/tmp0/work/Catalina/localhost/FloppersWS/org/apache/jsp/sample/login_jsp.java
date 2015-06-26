package org.apache.jsp.sample;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      if (_jspx_meth_tags_005fdependencies_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tags_005fscript_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"doonload()\">\r\n");
      out.write("\t");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"api_key\" id=\"api_key\"\r\n");
      out.write("\t\tvalue=");
      out.print(request.getAttribute("apikey"));
      out.write(">\r\n");
      out.write("\t<input type=\"hidden\" name=\"username\" id=\"username\"\r\n");
      out.write("\t\tvalue=");
      out.print(request.getAttribute("kandyusername"));
      out.write(">\r\n");
      out.write("\t<input type=\"hidden\" name=\"password\" id=\"password\"\r\n");
      out.write("\t\tvalue=");
      out.print(request.getAttribute("kandyuserpassword"));
      out.write(">\r\n");
      out.write("\t<input type=\"hidden\" name=\"agent\" id=\"agent\"\r\n");
      out.write("\t\tvalue=");
      out.print(request.getAttribute("agent"));
      out.write(">\r\n");
      out.write("\t<div class=\"hidden\" id=\"logged-in\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"video-container\">\r\n");
      out.write("\t\t\t<h3>Video</h3>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"video\" id=\"incoming-video\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"video\" id=\"outgoing-video\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<div class=\"hidden\" id=\"incoming-call\">\r\n");
      out.write("\t\t\t<h4>Incoming Call</h4>\r\n");
      out.write("\t\t\t<p id=\"username-incoming\"></p>\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-success\" id=\"answer-call-btn\">Answer\r\n");
      out.write("\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-warning\" id=\"reject-call-btn\">Reject\r\n");
      out.write("\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"hidden\" id=\"call-connected\">\r\n");
      out.write("\t\t\t<h4>Call Connected</h4>\r\n");
      out.write("\t\t\t<p id=\"username-connected\"></p>\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-danger\" id=\"end-call-btn\">End Call</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-warning\" id=\"hold-call-btn\">Hold\r\n");
      out.write("\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-success hidden\" id=\"resume-call-btn\">Resume\r\n");
      out.write("\t\t\t\t\tCall</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"row\">\r\n");
      out.write("\t\t<div id=\"chat-container\" class=\"hidden\">\r\n");
      out.write("\t\t\t<div id=\"chat-disp\" class=\"col-xs-4\"\r\n");
      out.write("\t\t\t\tstyle=\"word-break: 200px; height: 400px; overflow-y: auto;\">\r\n");
      out.write("\t\t\t\t<label for=\"chat-messages\" class=\"bg-warning\">Chat message:</label>\r\n");
      out.write("\t\t\t\t<div id=\"chat-messages\" class=\"bg-info\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"chat-input\" class=\"col-xs-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"chat-message\">Message:</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group_chat\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<textarea name=\"chat-message\" id=\"chat-message\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group_file\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" name=\"chat-file\" id=\"chat-file\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: none;\" class=\"form-control\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"fileupload()\" value=\"File Share\"\r\n");
      out.write("\t\t\t\t\t\tid=\"fileupload\"> <input type=\"button\" onclick=\"message()\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Message\" id=\"message\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<button name=\"button\" type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\tid=\"chat-btn\" onclick=\"sendMessage()\">Send</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      if (_jspx_meth_tags_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_tags_005fdependencies_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tags:dependencies
    org.apache.jsp.tag.web.dependencies_tag _jspx_th_tags_005fdependencies_005f0 = new org.apache.jsp.tag.web.dependencies_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tags_005fdependencies_005f0);
    _jspx_th_tags_005fdependencies_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005fdependencies_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tags_005fdependencies_005f0, null));
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
    // /sample/login.jsp(10,0) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fscript_005f0.setSrc("sample/login.js");
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

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write('\r');
      out.write('\n');
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}

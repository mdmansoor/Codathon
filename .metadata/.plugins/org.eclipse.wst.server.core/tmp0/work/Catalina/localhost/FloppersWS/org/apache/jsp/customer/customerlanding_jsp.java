/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2015-06-21 09:19:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerlanding_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1434877200978L));
    _jspx_dependants.put("/WEB-INF/tags/script.tag", Long.valueOf(1434877201009L));
    _jspx_dependants.put("/WEB-INF/tags/dependencies.tag", Long.valueOf(1434877200916L));
    _jspx_dependants.put("/WEB-INF/tags/images.tag", Long.valueOf(1434877200978L));
    _jspx_dependants.put("/WEB-INF/tags/footer.tag", Long.valueOf(1434877200931L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
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
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_tags_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary pull-right\" id=\"appoint-btn\"\r\n");
      out.write("\t\t\t\tonclick=\"onappointment()\">\r\n");
      out.write("\t\t\t\t<div class=\"help\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_tags_005fimages_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary pull-right\" id=\"support-btn\"\r\n");
      out.write("\t\t\t\tonclick=\"onSupport()\">\r\n");
      out.write("\t\t\t\t<div class=\"help\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_tags_005fimages_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_tags_005ffooter_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tags_005fdependencies_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:dependencies
    org.apache.jsp.tag.webdependencies_tag _jspx_th_tags_005fdependencies_005f0 = (new org.apache.jsp.tag.webdependencies_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005fdependencies_005f0);
    _jspx_th_tags_005fdependencies_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005fdependencies_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tags_005fdependencies_005f0, null));
    _jspx_th_tags_005fdependencies_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005fdependencies_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fscript_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:script
    org.apache.jsp.tag.webscript_tag _jspx_th_tags_005fscript_005f0 = (new org.apache.jsp.tag.webscript_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005fscript_005f0);
    _jspx_th_tags_005fscript_005f0.setJspContext(_jspx_page_context);
    // /customer/customerlanding.jsp(10,0) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fscript_005f0.setSrc("customer/customerlanding.js");
    _jspx_th_tags_005fscript_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005fscript_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:header
    org.apache.jsp.tag.webheader_tag _jspx_th_tags_005fheader_005f0 = (new org.apache.jsp.tag.webheader_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005fheader_005f0);
    _jspx_th_tags_005fheader_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005fheader_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005fheader_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fimages_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:images
    org.apache.jsp.tag.webimages_tag _jspx_th_tags_005fimages_005f0 = (new org.apache.jsp.tag.webimages_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005fimages_005f0);
    _jspx_th_tags_005fimages_005f0.setJspContext(_jspx_page_context);
    // /customer/customerlanding.jsp(22,5) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fimages_005f0.setSrc("agents/appointment.png");
    _jspx_th_tags_005fimages_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005fimages_005f0);
    return false;
  }

  private boolean _jspx_meth_tags_005fimages_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:images
    org.apache.jsp.tag.webimages_tag _jspx_th_tags_005fimages_005f1 = (new org.apache.jsp.tag.webimages_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005fimages_005f1);
    _jspx_th_tags_005fimages_005f1.setJspContext(_jspx_page_context);
    // /customer/customerlanding.jsp(30,5) name = src type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fimages_005f1.setSrc("agents/cslogo.jpg");
    _jspx_th_tags_005fimages_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005fimages_005f1);
    return false;
  }

  private boolean _jspx_meth_tags_005ffooter_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:footer
    org.apache.jsp.tag.webfooter_tag _jspx_th_tags_005ffooter_005f0 = (new org.apache.jsp.tag.webfooter_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tags_005ffooter_005f0);
    _jspx_th_tags_005ffooter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tags_005ffooter_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tags_005ffooter_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write('\r');
      out.write('\n');
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}

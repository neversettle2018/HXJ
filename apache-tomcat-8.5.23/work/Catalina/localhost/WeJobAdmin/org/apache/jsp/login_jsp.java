/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-04-17 05:46:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>微兼职后台登录</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\tfunction checkForm() {\r\n");
      out.write("\t\tvar msg = \"\";\r\n");
      out.write("\t\tif (document.index.Id.value == \"\")\r\n");
      out.write("\t\t\tmsg += \"账号不能为空\\n\";\r\n");
      out.write("\t\tif (document.index.password.value == \"\")\r\n");
      out.write("\t\t\tmsg += \"密码不能为空\\n\";\r\n");
      out.write("\t\tif (document.index.code_input.value == \"\")\r\n");
      out.write("\t\t\tmsg += \"验证码不能为空\\n\";\r\n");
      out.write("\t\tif (msg == \"\")\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\talert(msg);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"6778\",secure:\"6787\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("\r\n");
      out.write("<body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc3-13\" data-genuitec-path=\"/WeJobAdmin/WebRoot/login.jsp\">\r\n");
      out.write("\t<form method=\"post\" name=\"index\" id=\"index\"\r\n");
      out.write("\t\tonsubmit=\"return checkForm()\" onsubmit=\"return validate()\" action=\"servlet/Login\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc3-13\" data-genuitec-path=\"/WeJobAdmin/WebRoot/login.jsp\">\r\n");
      out.write("\t\t<div class=\"top\">\r\n");
      out.write("\t\t\t<h1>微兼职后台管理</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fen\"></div>\r\n");
      out.write("\t\t<!--top end-->\r\n");
      out.write("\t\t<!--content begin-->\r\n");
      out.write("\t\t<div class=\"kuang\">\r\n");
      out.write("\t\t\t<div class=\"register1\">\r\n");
      out.write("\t\t\t\t<span>登录账号</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"wen1\">\r\n");
      out.write("\t\t\t\t<span class=\"a1\">&nbsp;&nbsp;&nbsp;&nbsp;账号：</span><input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" placeholder=\"管理员账号\" name=\"Id\" maxlength=\"20\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width:306px; height:38px; margin-top:4px; margin-left:5px; font-size:16px; font-family:微软雅黑; padding-left:12px; border:1px solid #CCC;\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"wen1\">\r\n");
      out.write("\t\t\t\t<span class=\"a1\">&nbsp;&nbsp;&nbsp;&nbsp;密码：</span> <input\r\n");
      out.write("\t\t\t\t\ttype=\"password\" placeholder=\"管理员密码\" name=\"password\" maxlength=\"20\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width:306px; height:38px; margin-top:4px; margin-left:5px; font-size:16px; font-family:微软雅黑; padding-left:12px; border:1px solid #CCC;\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"wen1\">\r\n");
      out.write("\t\t\t\t<span class=\"a1\">&nbsp;验证码：</span>\r\n");
      out.write("\t\t\t\t<input type=\"text\" maxlength=\"4\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"不区分大小写\" name=\"code\" id=\"code_input\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width:306px; height:38px; margin-top:4px; margin-left:5px; font-size:16px; font-family:微软雅黑; padding-left:12px;  border:1px solid #CCC;\" />\r\n");
      out.write("\t\t\t\t<div id=\"v_container\"  style=\"width: 200px;height: 50px; margin-left: 100px; margin-top: 10px;\"></div>\r\n");
      out.write("\t\t\t\t<!--  <button id=\"my_button\">验证</button>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"wen2\">\r\n");
      out.write("\t\t\t<input  id=\"code1\" type=\"hidden\" name=\"code1\"  > \r\n");
      out.write("\t\t\t\t<input id=\"my_button\" class=\"a4\"  type=\"submit\" name=\"save\" value=\"登录 \" onclick=\"function validate()\" >\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"fen2\"></div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/gVerify.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar verifyCode = new GVerify(\"v_container\");\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.getElementById(\"my_button\").onclick= function validate() \r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar res = verifyCode.validate(document.getElementById(\"code_input\").value);\r\n");
      out.write("\t\t\tif (res) {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"code1\").value = \"1\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"code1\").value = \"0\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
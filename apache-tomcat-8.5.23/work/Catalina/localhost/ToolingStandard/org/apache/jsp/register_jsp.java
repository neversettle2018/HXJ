/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2018-06-20 07:44:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  \t<link rel=\"shortcut icon\" href=\"logoicon.ico\"/>\r\n");
      out.write("\t<link rel=\"bookmark\" href=\"logoicon.ico\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t<title>ToolingStandard</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\r\n");
      out.write("\r\n");
      out.write("<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"21040\",secure:\"21051\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("<body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-16\" data-genuitec-path=\"/ToolingStandard/WebRoot/register.jsp\">\r\n");
      out.write("\t<div class=\"container demo-1\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-16\" data-genuitec-path=\"/ToolingStandard/WebRoot/register.jsp\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div id=\"large-header\" class=\"large-header\">\r\n");
      out.write("\t\t\t\t<canvas id=\"demo-canvas\"></canvas>\r\n");
      out.write("\t\t\t\t<div class=\"logo_box\">\r\n");
      out.write("\t\t\t\t\t<h3>Tooling Standard 欢迎您</h3>\r\n");
      out.write("\t\t\t\t\t<form action=\"register\" name=\"f\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ipt\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input_outer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"u_user\"></span> <input name=\"users.userName\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"username\" class=\"text\" style=\"color: #FFFFFF !important\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"请输入账户\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"showResult\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ipt\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input_outer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"us_uer\"></span> <input name=\"users.userPassword\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"password1\" class=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #FFFFFF !important; position:absolute; z-index:100;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"\" type=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"showResult2\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ipt\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input_outer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"us_uer\"></span> <input name=\"password2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"password2\" class=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #FFFFFF !important; position:absolute; z-index:100;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"\" type=\"password\" placeholder=\"请确定密码\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"showResult3\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ipt\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input_outer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"qq_uer\"></span> <input name=\"users.userPhone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"phone\" class=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #FFFFFF !important; position:absolute; z-index:100;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"\" type=\"text\" placeholder=\"请输入手机号码\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"showResult4\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mb2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"register\" class=\"act-but submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"border:none;cursor:pointer;color:#ffffff;width:330px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" name=\"save\" value=\"同意协议并注册 \">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\" style=\" margin-left: 150px; color: white;\">已有账号？马上登录</a>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/TweenLite.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/EasePack.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/rAF.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/demo-1.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/verification.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jquery-3.3.1/jquery-3.3.1.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar flag1 = false;\r\n");
      out.write("\t\t\tvar flag2 = false;\r\n");
      out.write("\t\t\tvar flag3 = false;\r\n");
      out.write("\t\t\t$(\"#username\").blur(function() {\r\n");
      out.write("\t\t\t\tver();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#password1\").blur(function() {\r\n");
      out.write("\t\t\t\tverpas();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t$(\"#password2\").focus(function() {\r\n");
      out.write("\t\t\t\t$(\"#showResult3\").html(\"\");\r\n");
      out.write("\t\t\t}).blur(function() {\r\n");
      out.write("\t\t\t\tverpas();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#phone\").blur(function() {\r\n");
      out.write("\t\t\t\tverphone();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('.submit').click(function() {\r\n");
      out.write("\t\t\t\tif (flag1 && flag2 && flag3) {\r\n");
      out.write("\t\t\t\t\t$('form').submit();\r\n");
      out.write("\t\t\t\t\talert(\"欢迎注册\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert(\"请检查信息\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction ver() {\r\n");
      out.write("\t\t\t\tvar username = $.trim($(\"#username\").val());\r\n");
      out.write("\t\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/checkusername\";\r\n");
      out.write("\t\t\t\tvar t = {\r\n");
      out.write("\t\t\t\t\t\"users.userName\" : username,\r\n");
      out.write("\t\t\t\t\t\"time\" : new Date()\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t$.post(url, t, function(data) {\r\n");
      out.write("\t\t\t\t\tif (data == \"用户名可用\") {\r\n");
      out.write("\t\t\t\t\t\t$(\"#showResult\").html(data);\r\n");
      out.write("\t\t\t\t\t\tflag1 = true;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#showResult\").html(data);\r\n");
      out.write("\t\t\t\t\t\tflag1 = false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction verpas() {\r\n");
      out.write("\t\t\t\tvar userPassword1 = $.trim($(\"#password1\").val());\r\n");
      out.write("\t\t\t\tvar userPassword2 = $.trim($(\"#password2\").val());\r\n");
      out.write("\t\t\t\tif(userPassword1!=\"\" && userPassword2!=\"\"){\r\n");
      out.write("\t\t\t\tif (userPassword1 != userPassword2) {\r\n");
      out.write("\t\t\t\t\t$(\"#showResult3\").html(\"<font color='red'>您两次输入密码不一致，请重新输入</font>\");\r\n");
      out.write("\t\t\t\t\tflag2 = false;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#showResult3\").html(\"\");\r\n");
      out.write("\t\t\t\t\tflag2 = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#showResult3\").html(\"<font color='red'>密码不能为空</font>\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction verphone() {\r\n");
      out.write("\t\t\t\tvar phone = $.trim($(\"#phone\").val());\r\n");
      out.write("\t\t\t\tif (phone == \"\") {\r\n");
      out.write("\t\t\t\t\t$(\"#showResult4\").html(\"<font color='red'>手机号码不能为空</font>\");\r\n");
      out.write("\t\t\t\t\tflag3 = false;\r\n");
      out.write("\t\t\t\t} else if (!$(\"#phone\").val().match(/^1[34578]\\d{9}$/)) {\r\n");
      out.write("\t\t\t\t\t$(\"#showResult4\").html(\"<font color='red'>您输入的手机格式错误，请重新输入</font>\");\r\n");
      out.write("\t\t\t\t\tflag3 = false;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#showResult4\").html(\"\");\r\n");
      out.write("\t\t\t\t\tflag3 = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-30 13:38:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>新零售后台管理</title>\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- basic styles -->\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/font-awesome.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!--[if IE 7]>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/font-awesome-ie7.min.css\" />\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- ace styles -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/ace.min.css\" />\r\n");
      out.write("\t<!--[if lte IE 8]>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/ace-ie.min.css\" />\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<!-- ace settings handler -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/ace-extra.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/html5shiv.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--顶部NAV-->\r\n");
      out.write("<div class=\"navbar navbar-default\" id=\"navbar\">\r\n");
      out.write("\t<div class=\"navbar-container\" id=\"navbar-container\">\r\n");
      out.write("\t\t<!--左侧logo-->\r\n");
      out.write("\t\t<div class=\"navbar-header pull-left\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\" class=\"navbar-brand\">\r\n");
      out.write("\t\t\t\t<small>\r\n");
      out.write("\t\t\t\t\t<i class=\"icon-leaf\"></i>\r\n");
      out.write("\t\t\t\t\tAce Admin\r\n");
      out.write("\t\t\t\t</small>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--右侧-->\r\n");
      out.write("\t\t<div class=\"navbar-header pull-right\" role=\"navigation\">\r\n");
      out.write("\t\t\t<ul class=\"nav ace-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"purple\">\r\n");
      out.write("\t\t\t\t\t<a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-bell-alt icon-animated-bell\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-important\">8</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-warning-sign\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t8 消息\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"btn btn-xs no-hover btn-pink icon-comment\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t未读消息\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-right badge badge-info\">+12</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"light-blue\">\r\n");
      out.write("\t\t\t\t\t<a data-toggle=\"dropdown\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\" class=\"dropdown-toggle\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"nav-user-photo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/avatars/user.jpg\" alt=\"Jason's Photo\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"user-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<small>Welcome</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t宋灿\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-caret-down\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t系统参数\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t个人中心\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-off\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t登出\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul><!-- /.ace-nav -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--顶部NAV END-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"main-container\" id=\"main-container\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main-container-inner\">\r\n");
      out.write("\t\t<a class=\"menu-toggler\" id=\"menu-toggler\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">\r\n");
      out.write("\t\t\t<span class=\"menu-text\"></span>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<!--左侧导航-->\r\n");
      out.write("\t\t<div class=\"sidebar\" id=\"sidebar\">\r\n");
      out.write("\t\t\t<!--快捷功能区-->\r\n");
      out.write("\t\t\t<div class=\"sidebar-shortcuts\" id=\"sidebar-shortcuts\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-shortcuts-large\" id=\"sidebar-shortcuts-large\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-success\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-signal\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-pencil\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-warning\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-group\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-danger\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-cogs\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-shortcuts-mini\" id=\"sidebar-shortcuts-mini\">\r\n");
      out.write("\t\t\t\t\t<span class=\"btn btn-success\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"btn btn-info\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"btn btn-warning\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"btn btn-danger\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--主菜单-->\r\n");
      out.write("\t\t\t<ul class=\"nav nav-list\">\r\n");
      out.write("\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\" class=\"dropdown-toggle\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-desktop\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu-text\"> 用户管理 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow icon-angle-down\"></b>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_normal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t普通用户\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_business\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t商家管理\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_delivery\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t配送员管理\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user_delivery\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t管理员管理\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deliver/toIndex\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-text-width\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu-text\"> 配送管理 </span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/order/toIndex\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-text-width\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu-text\"> 订单管理 </span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\" class=\"dropdown-toggle\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-desktop\"></i>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"menu-text\">商品管理 </span>\r\n");
      out.write("\t\t\t\t\t\t<b class=\"arrow icon-angle-down\"></b>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"submenu\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/product\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t商品管理\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/product_authenticate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t商品审核\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!--收缩键-->\r\n");
      out.write("\t\t\t<div class=\"sidebar-collapse\" id=\"sidebar-collapse\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-double-angle-left\" data-icon1=\"icon-double-angle-left\" data-icon2=\"icon-double-angle-right\"></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--左侧导航 end-->\r\n");
      out.write("\t\t<!--主页面-->\r\n");
      out.write("\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t<!--页面路径-->\r\n");
      out.write("\t\t\t<div class=\"breadcrumbs\" id=\"breadcrumbs\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-home home-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">Home</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\">Other Pages</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\">Blank Page</li>\r\n");
      out.write("\t\t\t\t</ul><!-- .breadcrumb -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"nav-search\" id=\"nav-search\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search ...\" class=\"nav-search-input\" id=\"nav-search-input\" autocomplete=\"off\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-search nav-search-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--页面路径-->\r\n");
      out.write("\t\t\t<!--主页面内容-->\r\n");
      out.write("\t\t\t<div class=\"page-content\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t你好你好\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--主页面内容 end-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/#\" id=\"btn-scroll-up\" class=\"btn-scroll-up btn btn-sm btn-inverse\">\r\n");
      out.write("\t\t<i class=\"icon-double-angle-up icon-only bigger-110\"></i>\r\n");
      out.write("\t</a>\r\n");
      out.write("</div><!-- /.main-container -->\r\n");
      out.write("\r\n");
      out.write("<!-- basic scripts -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    window.jQuery || document.write(\"<script src='assets/js/jquery-2.0.3.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.jQuery || document.write(\"<script src='assets/js/jquery-1.10.2.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    if(\"ontouchend\" in document) document.write(\"<script src='assets/js/jquery.mobile.custom.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/typeahead-bs2.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- page specific plugin scripts -->\r\n");
      out.write("\r\n");
      out.write("<!-- ace scripts -->\r\n");
      out.write("<!-- \t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/ace-elements.min.js\"></script> -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/js/ace.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/indexPage.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-18 15:15:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("\t\t<title>轻松点商家登录</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/base.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/layout.css\" />\r\n");
      out.write("\t\t<script src=\"https://www.promisejs.org/polyfills/promise-6.1.0.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://gosspublic.alicdn.com/aliyun-oss-sdk.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/user/register-app.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/user/imgdisplay.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t<div id=\"loginBar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w960 tr\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">登录</a> <span class=\"sp\">|</span>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">注册</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"headBox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w960 oh\">\r\n");
      out.write("\t\t\t\t\t\t<!--<a href=\"#\" class=\"fl mt10\"><img src=\"assets/css/images/logo.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"logo\" /></a>-->\r\n");
      out.write("\t\t\t\t\t\t<nav id=\"navs\" class=\"fr\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/login\">登录</a>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t<!-- // header end -->\r\n");
      out.write("\t\t\t<div class=\"container w960 mt20\">\r\n");
      out.write("\t\t\t\t<div id=\"processor\">\r\n");
      out.write("\t\t\t\t\t<ol class=\"processorBox oh\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"current\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"step_inner fl\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon_step\">1</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>填写基本信息</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"step_inner fr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon_step\">2</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>填写商户信息</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t<div class=\"step_line\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t<div id=\"step1\" class=\"step hide\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"\" method=\"post\" id=\"step1_frm\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">姓名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input username\" maxlength=\"8\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请填写你的真实姓名</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">性别</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label><input name=\"sex\" type=\"radio\" value=\"1\" checked />男 </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label><input name=\"sex\" type=\"radio\" value=\"0\" />女 </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请选择你的性别</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"\" class=\"frm_input passwd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">字母、数字或者英文符号，最短6位，区分大小写</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">再次输入密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"\" class=\"frm_input passwd2\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">电子邮箱</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" id=\"phone\" class=\"frm_input email\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\"电子邮箱用于您找回密码等验证\"</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">手机号</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" id=\"phone\" class=\"frm_input phone\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请填写常用手机号</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">手机验证码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input phoneYzm\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" id=\"btnSendCode\" value=\"获取验证码\" onclick=\"clickButton(this)\" class=\"btn btn_default\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"toolBar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a id=\"nextBtn\" class=\"btn btn_primary\" href=\"javascript:;\">下一步</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- // step1 end -->\r\n");
      out.write("\t\t\t\t\t<div id=\"step3\" class=\"step hide\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"\" method=\"post\" id=\"step2_frm\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">店铺名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input shopName\" maxlength=\"32\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请输入您的店铺名称</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">店铺封面</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"addCommodityIndex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--input-group start-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9 big-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"preview1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"imghead1\" border=\"0\" src=\"assets/css/images/photo_icon.png\" width=\"90\" height=\"90\" onclick=\"$('#preview1Img').click();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" onchange=\"preview1Image(this)\" style=\"display: none;\" id=\"preview1Img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">经营类型</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input manager_class\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请输入经营类型（零售,电商）</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">管理员姓名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input managerName\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请输入店铺管理姓名</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">身份证号码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input idCard\" maxlength=\"32\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请输入您的身份证号码</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">身份证正面照</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"addCommodityIndex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--input-group start-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9 big-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"preview2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"imghead2\" border=\"0\" src=\"assets/css/images/photo_icon.png\" width=\"90\" height=\"90\" onclick=\"$('#preview2Img').click();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" onchange=\"preview2Image(this)\" style=\"display: none;\" id=\"preview2Img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">身份证反面照</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"addCommodityIndex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--input-group start-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9 big-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"preview3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"imghead3\" border=\"0\" src=\"assets/css/images/photo_icon.png\" width=\"90\" height=\"90\" onclick=\"$('#preview3Img').click();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" onchange=\"preview3Image(this)\" style=\"display: none;\" id=\"preview3Img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">手持身份证照</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"addCommodityIndex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9 big-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"preview4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"imghead4\" border=\"0\" src=\"assets/css/images/photo_icon.png\" width=\"90\" height=\"90\" onclick=\"$('#preview4Img').click();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" onchange=\"preview4Image(this)\" style=\"display: none;\" id=\"preview4Img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">营业执照</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"frm_controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"\" class=\"frm_input license\" maxlength=\"32\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"frm_tips\">请输入您的营业执照编码</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"frm_control_group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"frm_label\">营业执照正面</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"addCommodityIndex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--input-group start-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9 big-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"preview5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"imghead5\" border=\"0\" src=\"assets/css/images/photo_icon.png\" width=\"90\" height=\"90\" onclick=\"$('#preview5Img').click();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" onchange=\"preview5Image(this)\" style=\"display: none;\" id=\"preview5Img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"toolBar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a id=\"finishedBtn\" class=\"btn btn_primary\" href=\"javascript:;\">提交审核</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- // step3 end -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- // container end -->\r\n");
      out.write("\t\t\t<footer id=\"footer\" class=\"w960 oh\">\r\n");
      out.write("\t\t\t\t<span class=\"fl\">© 2017 轻松点 All Right Reserved.</span>\r\n");
      out.write("\t\t\t\t<nav class=\"footNavs tr fr\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">联系（深圳）轻松点未来科技责任有限公司</a> <span class=\"sp\">|</span>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">投诉建议</a>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t\t<!-- // footer end -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- // wrapper end -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tvar username = $('.username').val();\r\n");
      out.write("\t\t\tvar passwd = $('.passwd').val();\r\n");
      out.write("\t\t\tvar phone = $('.phone').val();\r\n");
      out.write("\t\t\tvar email = $('.email').val();\r\n");
      out.write("\t\t\tvar passwd2 = $('.passwd2').val();\r\n");
      out.write("\t\t\tvar phoneYzm = $('.phoneYzm').val();\r\n");
      out.write("\t\t\tvar sex = $('input:radio:checked').val();\r\n");
      out.write("\t\t\tvar EmailReg = /^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$/; //邮件正则\r\n");
      out.write("\t\t\tvar phoneReg = /^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$/;\r\n");
      out.write("\t\t\t//验证文件是否已选\r\n");
      out.write("\t\t\tvar storeImage = document.getElementById('preview1Img').files[0];\r\n");
      out.write("\t\t\tvar idCardImage1 = document.getElementById('preview2Img').files[0];\r\n");
      out.write("\t\t\tvar idCardImage2 = document.getElementById('preview3Img').files[0];\r\n");
      out.write("\t\t\tvar idCardImage3 = document.getElementById('preview4Img').files[0];\r\n");
      out.write("\t\t\tvar licenseImage = document.getElementById('preview5Img').files[0];\r\n");
      out.write("\r\n");
      out.write("\t\t\t//商家信息\r\n");
      out.write("\t\t\tvar shopName = $(\".shopName\").val();\r\n");
      out.write("\t\t\tvar manager_class = $(\".manager_class\").val();\r\n");
      out.write("\t\t\tvar managerName = $(\".managerName\").val();\r\n");
      out.write("\t\t\tvar idCard = $(\".idCard\").val();\r\n");
      out.write("\t\t\tvar license = $(\".license\").val();\r\n");
      out.write("\t\t\t//获取手机验证码\r\n");
      out.write("\t\t\tfunction clickButton(obj) {\r\n");
      out.write("\t\t\t\tvar phone = $(\"#phone\").val();\r\n");
      out.write("\t\t\t\tif(phone == '') {\r\n");
      out.write("\t\t\t\t\tshowTips('请输入手机号码');\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t} else if(!(/^1[34578]\\d{9}$/.test(phone))) {\r\n");
      out.write("\t\t\t\t\tshowTips('请输入正确的手机号码');\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar obj = $(obj);\r\n");
      out.write("\t\t\t\tobj.attr(\"disabled\", \"disabled\"); /*按钮倒计时*/\r\n");
      out.write("\t\t\t\tvar time = 60;\r\n");
      out.write("\t\t\t\tvar set = setInterval(function() {\r\n");
      out.write("\t\t\t\t\tobj.val(--time + \"(s)\");\r\n");
      out.write("\t\t\t\t}, 1000); /*等待时间*/\r\n");
      out.write("\t\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t\tobj.attr(\"disabled\", false).val(\"重新获取验证码\"); /*倒计时*/\r\n");
      out.write("\t\t\t\t\tclearInterval(set);\r\n");
      out.write("\t\t\t\t}, 60000);\r\n");
      out.write("\t\t\t\t//ajax形式获取验证码\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: \"post\", //用GET方式传输\r\n");
      out.write("\t\t\t\t\tdataType: \"json\", //数据格式:JSON */\r\n");
      out.write("\t\t\t\t\tcontentType: \"application/json; charset=utf-8\",\r\n");
      out.write("\t\t\t\t\turl: '/sms/sendSms', //目标地址\r\n");
      out.write("\t\t\t\t\tdata: JSON.stringify({\r\n");
      out.write("\t\t\t\t\t\t\"phoneNumber\": $('#phone').val()\r\n");
      out.write("\t\t\t\t\t}),\r\n");
      out.write("\t\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\t//console.log(data);\r\n");
      out.write("\t\t\t\t\t\tif(data.code == 200) {\r\n");
      out.write("\t\t\t\t\t\t\tcurCount = 60;\r\n");
      out.write("\t\t\t\t\t\t\t//设置button效果，开始计时\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#btnSendCode\").attr(\"disabled\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#btnSendCode\").val(\"请在\" + curCount + \"秒内输入验证码\");\r\n");
      out.write("\t\t\t\t\t\t\tInterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tshowTips(data.msg);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t//AJAX提交以及验证表单,提交基本信息\r\n");
      out.write("\t\t\t\t$('#nextBtn')\r\n");
      out.write("\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t//验证表单数据\r\n");
      out.write("\t\t\t\t\t\t\tusername = $('.username').val();\r\n");
      out.write("\t\t\t\t\t\t\tpasswd = $('.passwd').val();\r\n");
      out.write("\t\t\t\t\t\t\tphone = $('.phone').val();\r\n");
      out.write("\t\t\t\t\t\t\tpasswd2 = $('.passwd2').val();\r\n");
      out.write("\t\t\t\t\t\t\tphoneYzm = $('.phoneYzm').val();\r\n");
      out.write("\t\t\t\t\t\t\tsex = $('input:radio:checked').val();\r\n");
      out.write("\t\t\t\t\t\t\temail = $('.email').val();\r\n");
      out.write("\t\t\t\t\t\t\tEmailReg = /^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$/; //邮件正则\r\n");
      out.write("\t\t\t\t\t\t\tphoneReg = /^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$/;\r\n");
      out.write("\t\t\t\t\t\t\tif(username == '') {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请填写您的姓名');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(passwd == '') {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请填写您的密码');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(passwd2 == '') {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请再次输入您的密码');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(passwd != passwd2 ||\r\n");
      out.write("\t\t\t\t\t\t\t\tpasswd2 != passwd) {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('两次密码输入不一致呢');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(phoneYzm == '') {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请输入验证码');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(email==''){\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('邮箱不能为空');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(!EmailReg.test(email)){\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请输入正确的电子邮箱');\r\n");
      out.write("\t\t\t\t\t\t\t}else if(phone == '') {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请输入手机号码');\r\n");
      out.write("\t\t\t\t\t\t\t} else if(!(/^1[34578]\\d{9}$/.test(phone))) {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowTips('请输入正确的手机号码');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t//校验是否通过验证\r\n");
      out.write("\t\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype: \"post\", //用GET方式传输\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdataType: \"json\", //数据格式:JSON */\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontentType: \"application/json; charset=utf-8\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\turl: '/sms/vildate', //目标地址\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata: JSON.stringify({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"phone\": $('#phone').val(),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"code\": phoneYzm\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}),\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//console.log(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(data.status == 200) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.processorBox li')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.removeClass('current').eq(1)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.addClass('current');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$('.step').fadeOut(300).eq(1).fadeIn(500);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tshowTips(data.msg);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\terror: function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tshowTips(\"请求失败,检查网络或者稍后再试\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#finishedBtn\").click(function() {\r\n");
      out.write("\t\t\t\t\t//验证表单数据\r\n");
      out.write("\t\t\t\t\tusername = $('.username').val();\r\n");
      out.write("\t\t\t\t\tpasswd = $('.passwd').val();\r\n");
      out.write("\t\t\t\t\tphone = $('.phone').val();\r\n");
      out.write("\t\t\t\t\tpasswd2 = $('.passwd2').val();\r\n");
      out.write("\t\t\t\t\tphoneYzm = $('.phoneYzm').val();\r\n");
      out.write("\t\t\t\t\tsex = $('input:radio:checked').val();\r\n");
      out.write("\t\t\t\t\temail = $('.email').val();\r\n");
      out.write("\t\t\t\t\tEmailReg = /^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$/; //邮件正则\r\n");
      out.write("\t\t\t\t\tphoneReg = /^(([0\\+]\\d{2,3}-)?(0\\d{2,3})-)?(\\d{7,8})(-(\\d{3,}))?$/;\r\n");
      out.write("\t\t\t\t\t//验证文件是否已选\r\n");
      out.write("\t\t\t\t\tstoreImage = document.getElementById('preview1Img').files[0];\r\n");
      out.write("\t\t\t\t\tidCardImage1 = document.getElementById('preview2Img').files[0];\r\n");
      out.write("\t\t\t\t\tidCardImage2 = document.getElementById('preview3Img').files[0];\r\n");
      out.write("\t\t\t\t\tidCardImage3 = document.getElementById('preview4Img').files[0];\r\n");
      out.write("\t\t\t\t\tlicenseImage = document.getElementById('preview5Img').files[0];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t//商家信息\r\n");
      out.write("\t\t\t\t\tshopName = $(\".shopName\").val();\r\n");
      out.write("\t\t\t\t\tmanager_class = $(\".manager_class\").val();\r\n");
      out.write("\t\t\t\t\tmanagerName = $(\".managerName\").val();\r\n");
      out.write("\t\t\t\t\tidCard = $(\".idCard\").val();\r\n");
      out.write("\t\t\t\t\tlicense = $(\".license\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif(shopName == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写商户名');\r\n");
      out.write("\t\t\t\t\t} else if(manager_class == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写经营类型');\r\n");
      out.write("\t\t\t\t\t} else if(managerName == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写管理员姓名');\r\n");
      out.write("\t\t\t\t\t} else if(idCard == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写省份证');\r\n");
      out.write("\t\t\t\t\t} else if(license == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写营业执照编号');\r\n");
      out.write("\t\t\t\t\t} else if(username == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写您的姓名');\r\n");
      out.write("\t\t\t\t\t} else if(passwd == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请填写您的密码');\r\n");
      out.write("\t\t\t\t\t} else if(passwd2 == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请再次输入您的密码');\r\n");
      out.write("\t\t\t\t\t} else if(passwd != passwd2 ||\r\n");
      out.write("\t\t\t\t\t\tpasswd2 != passwd) {\r\n");
      out.write("\t\t\t\t\t\tshowTips('两次密码输入不一致呢');\r\n");
      out.write("\t\t\t\t\t} else if(phoneYzm == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请输入验证码');\r\n");
      out.write("\t\t\t\t\t}else if(email==''){\r\n");
      out.write("\t\t\t\t\t\tshowTips('邮箱不能为空');\r\n");
      out.write("\t\t\t\t\t} else if(!EmailReg.test(email)){\r\n");
      out.write("\t\t\t\t\t\tshowTips('请输入正确的电子邮箱');\r\n");
      out.write("\t\t\t\t\t}else if(phone == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请输入手机号码');\r\n");
      out.write("\t\t\t\t\t} else if(!(/^1[34578]\\d{9}$/.test(phone))) {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请输入正确的手机号码');\r\n");
      out.write("\t\t\t\t\t} else if(storeImage == null || storeImage == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请选择店铺封面');\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else if(idCardImage1 == null || idCardImage1 == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请选择省份证正面照');\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else if(idCardImage2 == null || idCardImage2 == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请选择省份证反面照');\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else if(idCardImage3 == null || idCardImage3 == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('还没选择手持照片');\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else if(licenseImage == null || licenseImage == '') {\r\n");
      out.write("\t\t\t\t\t\tshowTips('请上传手持照片');\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//上传文件\r\n");
      out.write("\t\t\t\t\t\tapplyTokenDo(uploadFile);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//切换步骤（目前只用来演示）\r\n");
      out.write("\t\t\t\t$('.processorBox li').click(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tvar i = $(this).index();\r\n");
      out.write("\t\t\t\t\t\t$('.processorBox li').removeClass('current').eq(i)\r\n");
      out.write("\t\t\t\t\t\t\t.addClass('current');\r\n");
      out.write("\t\t\t\t\t\t$('.step').fadeOut(300).eq(i).fadeIn(500);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2018-04-06 01:01:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.konakart.app.Content;
import com.konakart.app.ContentDescription;
import com.konakart.appif.ContentIf;

public final class CategoryBannersBody_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/KonaKart/webapps/konakart/WEB-INF/lib/struts2-core-kk-2.3.8.jar!/META-INF/struts-tags.tld", Long.valueOf(1355759346000L));
    _jspx_dependants.put("/WEB-INF/kk.tld", Long.valueOf(1517397686000L));
    _jspx_dependants.put("/WEB-INF/jsp/Taglibs.jsp", Long.valueOf(1517397686000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-kk-2.3.8.jar", Long.valueOf(1516953392000L));
    _jspx_dependants.put("/WEB-INF/tiles-jsp.tld", Long.valueOf(1517397686000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.konakart.app.Content");
    _jspx_imports_classes.add("com.konakart.app.ContentDescription");
    _jspx_imports_classes.add("com.konakart.appif.ContentIf");
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 com.konakart.al.KKAppEng kkEng = (com.konakart.al.KKAppEng) session.getAttribute("konakartKey");
      out.write('\r');
      out.write('\n');
 ContentIf[] catBanners = null;
      out.write('\r');
      out.write('\n');
 ContentIf[] catSubBanners = null;
      out.write('\r');
      out.write('\n');
 boolean hideRow1 =  kkEng.getPropertyAsBoolean("category.page.hide.banner.row1", false);
      out.write('\r');
      out.write('\n');
 boolean hideRow2 =  kkEng.getPropertyAsBoolean("category.page.hide.banner.row2", false);
      out.write('\r');
      out.write('\n');
 String contentDir = kkEng.getContentImagesDir();
      out.write('\r');
      out.write('\n');
 boolean contentEnabled = kkEng.getContentMgr().isEnabled();
      out.write("\r\n");
      out.write("\r\n");
 if (!hideRow1) { 
      out.write('\r');
      out.write('\n');
      out.write('	');
if (contentEnabled) { 
      out.write("\r\n");
      out.write("\t\t");
 catBanners = kkEng.getContentMgr().getContentForTypeAndKey(2, 3, kkEng.getCategoryMgr().getCurrentCat().getSearchKey());
      out.write('\r');
      out.write('\n');
      out.write('	');
 } else { 
      out.write("\r\n");
      out.write("\t\t");
 catBanners = new Content[1];
      out.write("\r\n");
      out.write("\t\t");
 ContentIf banner = new Content();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Computer Peripherals")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName1("logitech.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName2("logitech-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName3("logitech-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setClickUrl("SelectProd.action?prodId=31");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Games")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName1("black-ops-2.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName2("black-ops-2-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName3("black-ops-2-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setClickUrl("SelectProd.action?prodId=63");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("DVD Movies")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName1("dark-knight.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName2("dark-knight-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName3("dark-knight-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setClickUrl("SelectProd.action?prodId=20");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Electronics")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName1("kindle-fire-hd.jpg");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName2("kindle-fire-hd-medium.jpg");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName3("kindle-fire-hd-small.jpg");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setClickUrl("SelectProd.action?prodId=34");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Home & Garden")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName1("delonghi.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName2("delonghi-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.getDescription().setName3("delonghi-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner.setClickUrl("SelectProd.action?prodId=33");
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 catBanners[0] = banner;
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
 if (catBanners.length > 0) { 
      out.write("\r\n");
      out.write("\t\t");
 if (catBanners[0].getClickUrl() != null && catBanners[0].getClickUrl().length() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(catBanners[0].getClickUrl());
      out.write("\">\r\n");
      out.write("\t\t\t\t<picture class=\"rounded-corners\">\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t\t</picture>\r\n");
      out.write("\t\t\t</a> \t\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t<picture class=\"rounded-corners\">\r\n");
      out.write("\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catBanners[0].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t</picture>\r\n");
      out.write("\t\t");
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("\r\n");
 if (!hideRow2) { 
      out.write('\r');
      out.write('\n');
      out.write('	');
if (contentEnabled) { 
      out.write("\r\n");
      out.write("\t\t");
 catSubBanners = kkEng.getContentMgr().getContentForTypeAndKey(2, 4, kkEng.getCategoryMgr().getCurrentCat().getSearchKey());
      out.write('\r');
      out.write('\n');
      out.write('	');
 } else { 
      out.write("\r\n");
      out.write("\t\t");
 catSubBanners = new Content[2];
      out.write("\r\n");
      out.write("\t\t");
 ContentIf banner1 = new Content();
      out.write("\r\n");
      out.write("\t\t");
 ContentIf banner2 = new Content();
      out.write("\r\n");
      out.write("\t\t");
if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Computer Peripherals")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName1("hp-photosmart.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName2("hp-photosmart-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName3("hp-photosmart-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setClickUrl("SelectProd.action?prodId=27");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName1("deals-of-the-week.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName2("deals-of-the-week-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName3("deals-of-the-week-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Games")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName1("swat-3.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName2("swat-3-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName3("swat-3-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setClickUrl("SelectProd.action?prodId=21");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName1("winter-deals.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName2("winter-deals-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName3("winter-deals-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("DVD Movies")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName1("harry-potter.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName2("harry-potter-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName3("harry-potter-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setClickUrl("SelectProd.action?prodId=11");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName1("movie-deals.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName2("movie-deals-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName3("movie-deals-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Electronics")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName1("xbox.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName2("xbox-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName3("xbox-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName1("electronics-sale.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName2("electronics-sale-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName3("electronics-sale-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t");
 } else if (kkEng.getCategoryMgr().getCurrentCat().getSearchKey().equals("Home & Garden")) { 
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName1("rotak-40.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName2("rotak-40-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.getDescription().setName3("rotak-40-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner1.setClickUrl("SelectProd.action?prodId=39");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setDescription(new ContentDescription());
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName1("gifts-for-the-home.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName2("gifts-for-the-home-medium.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.getDescription().setName3("gifts-for-the-home-small.png");
      out.write("\r\n");
      out.write("\t\t\t");
 banner2.setClickUrl("");
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
 catSubBanners[0] = banner1;
      out.write("\r\n");
      out.write("\t\t");
 catSubBanners[1] = banner2;
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
 if (catSubBanners.length > 1 && catSubBanners[0] != null  && catSubBanners[1] != null) { 
      out.write("\r\n");
      out.write("\t\t<div id=\"banners\">\r\n");
      out.write("\t\t");
 if (catSubBanners[0].getClickUrl() != null && catSubBanners[0].getClickUrl().length() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(catSubBanners[0].getClickUrl());
      out.write("\">\r\n");
      out.write("\t\t\t\t<picture class=\"banner-double rounded-corners\">\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t\t</picture>\r\n");
      out.write("\t\t\t</a> \t\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t<picture class=\"banner-double rounded-corners\">\r\n");
      out.write("\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[0].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t</picture>\r\n");
      out.write("\t\t");
 } 
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t");
if (catSubBanners[1].getClickUrl() != null && catSubBanners[1].getClickUrl().length() > 0) { 
      out.write("\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(catSubBanners[1].getClickUrl());
      out.write("\">\r\n");
      out.write("\t\t\t\t<picture class=\"banner-double rounded-corners last-child\">\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t\t</picture>\r\n");
      out.write("\t\t\t</a> \t\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t<picture class=\"banner-double rounded-corners last-child\">\r\n");
      out.write("\t\t\t\t<!--[if IE 9]><video style=\"display: none;\"><![endif]-->\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName1());
      out.write("\" media=\"(min-width: 750px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName2());
      out.write("\" media=\"(min-width: 440px)\">\r\n");
      out.write("\t\t\t\t<source srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName3());
      out.write("\" >\r\n");
      out.write("\t\t\t\t<!--[if IE 9]></video><![endif]-->\r\n");
      out.write("\t\t\t\t<img srcset=\"");
      out.print(kkEng.getImageBase());
      out.write('/');
      out.print(contentDir);
      out.write('/');
      out.print(catSubBanners[1].getDescription().getName1());
      out.write("\">\r\n");
      out.write("\t\t\t</picture>\r\n");
      out.write("\t\t");
 } 
      out.write("\t\r\n");
      out.write("\t");
 } 
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
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

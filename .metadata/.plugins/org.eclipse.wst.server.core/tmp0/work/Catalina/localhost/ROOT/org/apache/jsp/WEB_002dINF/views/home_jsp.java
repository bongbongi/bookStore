/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-01-09 07:50:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/코딩/ezen/book/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/book/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1672800669542L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.HttpURLConnection");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("java.io.BufferedReader");
    _jspx_imports_classes.add("java.io.InputStreamReader");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<!-- CSS only -->\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\"\n");
      out.write("	integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<!-- JavaScript Bundle with Popper -->\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("	integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/92e616dfba.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".home_main {\n");
      out.write("	margin:0 auto;\n");
      out.write("	width: 1260px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("	\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slide {\n");
      out.write("	background-color: peru;\n");
      out.write("	margin: 0 auto;\n");
      out.write("	width: 1260px;\n");
      out.write("	height: 500px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".todayBookImg {\n");
      out.write("	width: 300px;\n");
      out.write("	height: 300px;\n");
      out.write("	background-color: aqua;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".todayBookImg>img {\n");
      out.write("	width: 300px;\n");
      out.write("	height: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".todayBook {\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write(".todayBookIntroduce {\n");
      out.write("	margin: 0 auto;\n");
      out.write("	display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Best_item {\n");
      out.write("	width: 230px;\n");
      out.write("	height: 310px;\n");
      out.write("	background-color: antiquewhite;\n");
      out.write("	display: inline-block;\n");
      out.write("	vertical-align: top;\n");
      out.write("	margin-right: 10px;\n");
      out.write("	margin-bottom: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img_box {\n");
      out.write("	width: 220px;\n");
      out.write("	height: 200px;\n");
      out.write("	background-color: lightgray;\n");
      out.write("	margin: 5px;\n");
      out.write("}\n");
      out.write(".book_img{\n");
      out.write("	width: 180px;\n");
      out.write("	height: 200px;\n");
      out.write("}\n");
      out.write(".main_book_header{\n");
      out.write("	font-size:16px;\n");
      out.write("}\n");
      out.write(".main_book_writer{\n");
      out.write("	font-size:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".BestSellerList {\n");
      out.write("	list-style: none;\n");
      out.write("\n");
      out.write("	padding:0px;\n");
      out.write("	/* display: -moz-inline-box; */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".BestSellerList:nth-last-child(-n+5) {\n");
      out.write("	margin-top: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bestSeller {\n");
      out.write("	/* display: flex; */\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write(".d-block {\n");
      out.write("	height: 500px;\n");
      out.write("}\n");
      out.write(".rank{\n");
      out.write("	height: 30px;\n");
      out.write(" 	text-align: left;\n");
      out.write(" 	\n");
      out.write(" 	display: flex;\n");
      out.write(" 	align-items: stretch;\n");
      out.write(" \n");
      out.write("	\n");
      out.write("}\n");
      out.write(".fa-1{\n");
      out.write(" font-size:15px;\n");
      out.write(" 	margin-left:8px;\n");
      out.write("}\n");
      out.write(".ad{\n");
      out.write("	background-color: purple;\n");
      out.write("	height: 200px;\n");
      out.write("	margin: 25px;\n");
      out.write("}\n");
      out.write(".ad-one{\n");
      out.write("	height: 200px;\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-around;\n");
      out.write("}\n");
      out.write(".ad_mini_1{\n");
      out.write("	width: 500px;\n");
      out.write("	height:150px;\n");
      out.write("	background-color: red;\n");
      out.write("	border : 1px solid black;\n");
      out.write("}\n");
      out.write(".ad_mini_2{\n");
      out.write("	width: 500px;\n");
      out.write("	height:150px;\n");
      out.write("	background-color: pink;\n");
      out.write("	border : 1px solid black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"home_main\">\n");
      out.write("		<nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("			<div class=\"container-fluid\">\n");
      out.write("				<!-- <a class=\"navbar-brand\" href=\"#\">Navbar</a> -->\n");
      out.write("				<button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n");
      out.write("					aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("					aria-label=\"Toggle navigation\">\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("				</button>\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("					<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("						<!-- <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">이벤트</a>\n");
      out.write("              </li> -->\n");
      out.write("						<li class=\"nav-item dropdown\"><a\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\n");
      out.write("							data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> 카테고리 </a>\n");
      out.write("							<ul class=\"dropdown-menu\">\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">소설</a></li>\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">에세이</a></li>\n");
      out.write("								<li><hr class=\"dropdown-divider\"></li>\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">문제집</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">베스트</a></li>\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">이벤트</a></li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("		<div class=\"slide\">\n");
      out.write("			<div id=\"carouselExampleCaptions\" class=\"carousel slide\"\n");
      out.write("				data-bs-ride=\"false\">\n");
      out.write("				<div class=\"carousel-indicators\">\n");
      out.write("					<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\n");
      out.write("						data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\n");
      out.write("						aria-label=\"Slide 1\"></button>\n");
      out.write("					<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\n");
      out.write("						data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("					<button type=\"button\" data-bs-target=\"#carouselExampleCaptions\"\n");
      out.write("						data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"carousel-inner\">\n");
      out.write("					<div class=\"carousel-item active\">\n");
      out.write("						<img\n");
      out.write("							src=\"https://cdn.pixabay.com/photo/2020/04/28/18/33/key-5105878_1280.jpg\"\n");
      out.write("							class=\"d-block w-100\" alt=\"...\">\n");
      out.write("						<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("							<h5>First slide label</h5>\n");
      out.write("							<p>Some representative placeholder content for the first\n");
      out.write("								slide.</p>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"carousel-item\">\n");
      out.write("						<img\n");
      out.write("							src=\"https://cdn.pixabay.com/photo/2016/09/08/22/43/books-1655783_1280.jpg\"\n");
      out.write("							class=\"d-block w-100\" alt=\"...\">\n");
      out.write("						<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("							<h5>Second slide label</h5>\n");
      out.write("							<p>Some representative placeholder content for the second\n");
      out.write("								slide.</p>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"carousel-item\">\n");
      out.write("						<img\n");
      out.write("							src=\"https://cdn.pixabay.com/photo/2015/11/19/21/11/atlas-1052011_1280.jpg\"\n");
      out.write("							class=\"d-block w-100\" alt=\"...\">\n");
      out.write("						<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("							<h5>Third slide label</h5>\n");
      out.write("							<p>Some representative placeholder content for the third\n");
      out.write("								slide.</p>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<button class=\"carousel-control-prev\" type=\"button\"\n");
      out.write("					data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\n");
      out.write("					<span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("					<span class=\"visually-hidden\">Previous</span>\n");
      out.write("				</button>\n");
      out.write("				<button class=\"carousel-control-next\" type=\"button\"\n");
      out.write("					data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\n");
      out.write("					<span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("					<span class=\"visually-hidden\">Next</span>\n");
      out.write("				</button>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"todayBook\">\n");
      out.write("			<h1>오늘의 책</h1>\n");
      out.write("			<div class=\"todayBookIntroduce\">\n");
      out.write("				<div class=\"todayBookImg\">\n");
      out.write("					<img\n");
      out.write("						src=\"https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9791167740847.jpg\">\n");
      out.write("				</div>\n");
      out.write("				<div>제목 지은이,출판사 가격 책 간단 줄거리</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"ad-one\">\n");
      out.write("			<div class=\"ad_mini_1\"><a href=\"#\">미니광고1 누르면 상세페이지로</a></div>\n");
      out.write("			<div class=\"ad_mini_2\"><a href=\"#\">미니광고2 누르면 상세페이지로</a></div>\n");
      out.write("		</div>\n");
      out.write("		<h1>베스트 셀러</h1>\n");
      out.write("		<div class=\"BestSeller\">\n");
      out.write("			<ul class=\"BestSellerList\">\n");
      out.write("			");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("	\n");
      out.write("			\n");
      out.write("				\n");
      out.write("			</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("		<!-- 광고 -->\n");
      out.write("		<div class=\"ad\">\n");
      out.write("			<a href=\"#\">\n");
      out.write("				광고이미지 자리\n");
      out.write("			</a>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./layout/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(258,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(258,3) '${book_list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${book_list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home.jsp(258,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("list");
      // /WEB-INF/views/home.jsp(258,3) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setBegin(1);
      // /WEB-INF/views/home.jsp(258,3) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setEnd(10);
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("				<li class=\"Best_item\">\n");
            out.write("					<div class=\"rank\">\n");
            out.write("						<i class=\"fa-solid fa-1\"></i>	\n");
            out.write("					</div>\n");
            out.write("					<div class=\"img_box\">\n");
            out.write("						<a href=\"#\">\n");
            out.write("							<img class=\"book_img\" src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.book_image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("						</a>\n");
            out.write("					</div>\n");
            out.write("					<div class=\"info_box\">\n");
            out.write("						<span class=\"main_book_header\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.book_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\n");
            out.write("						<Br> \n");
            out.write("						<span class=\"main_book_writer\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.book_writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write(':');
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.book_publisher}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\n");
            out.write("					</div>\n");
            out.write("				</li>\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

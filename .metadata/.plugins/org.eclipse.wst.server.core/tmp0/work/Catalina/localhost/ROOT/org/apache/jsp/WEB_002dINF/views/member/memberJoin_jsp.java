/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-01-09 07:38:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<!-- CSS only -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" \n");
      out.write("rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" \n");
      out.write("crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/92e616dfba.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"../resources/css/memberJoin.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../resources/js/memberJoin.js\"></script> -->\n");
      out.write("<title>회원가입</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"/mem/join\" method=\"post\">\n");
      out.write("        <div class=\"join-container\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"/\"><img src=\"../resources/img/logo.jpg\" alt=\"로고\"></a><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"join\">\n");
      out.write("				<lable for=\"mem_id\">ID</lable>\n");
      out.write("				<br> <input type=\"text\" class=\"join-input\" name=\"mem_id\"\n");
      out.write("					id=\"mem_id\" placeholder=\"아이디\" onchange=\"checkId()\" required>\n");
      out.write("					<span class=\"id_ok\"><i class=\"fa-solid fa-check\"></i></span>\n");
      out.write("	                <span class=\"id_duplicate\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("	                <span class=\"id_null\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("	                <Br>\n");
      out.write("                <lable for=\"mem_pw\">PW</lable><br>\n");
      out.write("                <input type=\"password\" class=\"join-input\" name=\"mem_pw\" id=\"mem_pw\"\n");
      out.write("                    placeholder=\"영문(대소문자 구분), 숫자, 특수문자 조합, 9~12자리\" onchange=\"checkPw()\" required>\n");
      out.write("                <span class=\"pw_ok\"><i class=\"fa-solid fa-check\"></i></span>\n");
      out.write("                <span class=\"pw_rewrite\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("                <span class=\"pw_null\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("                <br>\n");
      out.write("                <lable for=\"mem_name\">NAME</lable><br>\n");
      out.write("                <input type=\"text\" class=\"join-input\" name=\"mem_name\" placeholder=\"이름\" required>\n");
      out.write("                <br>\n");
      out.write("                <lable for=\"mem_postzip\">ADDRESS</lable><br>\n");
      out.write("\n");
      out.write("                <input type=\"text\" class=\"join-input zip\" id=\"postcode\" name=\"mem_postzip\" placeholder=\"우편번호\" required>\n");
      out.write("                <input type=\"button\" class=\"join-input zip btn btn-outline-primary\" onclick=\"execDaumPostcode()\"\n");
      out.write("                    value=\"우편번호 찾기\">\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"text\" class=\"join-input\" id=\"address\" name=\"address\" placeholder=\"주소\" required>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input type=\"text\" class=\"join-input\" id=\"detailAddress\" name=\"detailAddress\" placeholder=\"상세주소\"\n");
      out.write("                    required>\n");
      out.write("                <input type=\"text\" class=\"join-input\" id=\"extraAddress\" name=\"extraAddress\" placeholder=\"참고항목\">\n");
      out.write("                <br>\n");
      out.write("                <lable for=\"mem_age\">AGE</lable><br>\n");
      out.write("                <td><input type=\"text\" class=\"join-input\" name=\"mem_age\" placeholder=\"나이\" required>\n");
      out.write("                    <br>\n");
      out.write("                    <lable for=\"mem_gender\">GENDER</lable><br>\n");
      out.write("                    <select class=\"join-input\" name=\"mem_gender\" required=\"required\">\n");
      out.write("                        <option value=\"null\">선택해주세요</option>\n");
      out.write("                        <option value=\"1\">남자</option>\n");
      out.write("                        <option value=\"2\">여자</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <lable for=\"mem_cell_num\">PHONE</lable><br>\n");
      out.write("                    <input type=\"text\" class=\"join-input\" name=\"mem_cell_num\" id=\"mem_cell_num\" placeholder=\"숫자만 써주세요\"\n");
      out.write("                        onchange=\"checkCellNum()\" required>\n");
      out.write("                    <span class=\"cellNum_ok\"><i class=\"fa-solid fa-check\"></i></span>\n");
      out.write("                    <span class=\"cellNum_duplicate\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("                    <span class=\"cellNum_null\"><i class=\"fa-solid fa-x\"></i></span>\n");
      out.write("                    <br>\n");
      out.write("                    <lable for=\"mno_cno\">FAVORITE</lable><br>\n");
      out.write("\n");
      out.write("                    <select class=\"join-input\" name=\"mno_cno\" required=\"required\">\n");
      out.write("                        <option value=\"0\" selected=\"selected\">선택해주세요</option>\n");
      out.write("                        <option value=\"1\">소설</option>\n");
      out.write("                        <option value=\"2\">에세이</option>\n");
      out.write("                        <option value=\"3\">건강/취미</option>\n");
      out.write("                        <option value=\"4\">컴퓨터/모바일</option>\n");
      out.write("                    </select>\n");
      out.write("                    <Br>\n");
      out.write("                    <button type=submit\" class=\"btn btn-outline-secondary btn-submit\">가입하기</button>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <p>이미 가입되어 있으신가요? <a href=\"/mem/loginPage\">로그인하기</a></p>\n");
      out.write("    </div>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("	function execDaumPostcode() {\n");
      out.write("        new daum.Postcode({\n");
      out.write("            oncomplete: function(data) {\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\n");
      out.write("\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\n");
      out.write("                var addr = ''; // 주소 변수\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\n");
      out.write("\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\n");
      out.write("                    addr = data.roadAddress;\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\n");
      out.write("                    addr = data.jibunAddress;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\n");
      out.write("                if(data.userSelectedType === 'R'){\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\n");
      out.write("                        extraAddr += data.bname;\n");
      out.write("                    }\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\n");
      out.write("                    }\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\n");
      out.write("                    if(extraAddr !== ''){\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\n");
      out.write("                    }\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\n");
      out.write("                    document.getElementById(\"extraAddress\").value = extraAddr;\n");
      out.write("                \n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"extraAddress\").value = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\n");
      out.write("                document.getElementById('postcode').value = data.zonecode;\n");
      out.write("                document.getElementById(\"address\").value = addr;\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\n");
      out.write("                document.getElementById(\"detailAddress\").focus();\n");
      out.write("            }\n");
      out.write("        }).open();\n");
      out.write("    }\n");
      out.write("	\n");
      out.write("	function checkId(){\n");
      out.write("        var mem_id = document.getElementById('mem_id').value; //id값이 \"id\"인 입력란의 값을 저장\n");
      out.write("		console.log(mem_id);\n");
      out.write("        $.ajax({\n");
      out.write("            url:'/mem/idCheck', //Controller에서 요청 받을 주소\n");
      out.write("            type:'post', //POST 방식으로 전달\n");
      out.write("            data:{mem_id:mem_id},\n");
      out.write("            success:function(isOk){ //컨트롤러에서 넘어온 isOK값을 받는다 \n");
      out.write("                if(isOk == 'id_ok'){ //ok이면 가입 가능\n");
      out.write("                    $('.id_ok').css(\"display\",\"inline-block\"); \n");
      out.write("                    $('.id_duplicate').css(\"display\", \"none\");\n");
      out.write("					$('.id_null').css(\"display\", \"none\");\n");
      out.write("                }else if(isOk =='id_null'){//input이 null값임. 입력 요청\n");
      out.write("					$('.id_ok').css(\"display\",\"none\"); \n");
      out.write("                    $('.id_duplicate').css(\"display\", \"none\");\n");
      out.write("					$('.id_null').css(\"display\", \"inline-block\");\n");
      out.write("				} \n");
      out.write("				else { //중복일 경우\n");
      out.write("                    $('.id_ok').css(\"display\", \"none\");\n");
      out.write("                    $('.id_duplicate').css(\"display\",\"inline-block\");\n");
      out.write("					$('.id_null').css(\"display\", \"none\");\n");
      out.write("                    // alert(\"아이디를 다시 입력해주세요\");\n");
      out.write("                    $('#mem_id').val('');\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("			error:function(request,status,error){\n");
      out.write("			console.log(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error:\"+error);\n");
      out.write("			}	\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        };\n");
      out.write("	function checkPw(){\n");
      out.write("	var mem_pw = document.getElementById('mem_pw').value; //id값이 \"id\"인 입력란의 값을 저장\n");
      out.write("	console.log(mem_pw);\n");
      out.write("	$.ajax({\n");
      out.write("		url:'/mem/pwCheck', //Controller에서 요청 받을 주소\n");
      out.write("		type:'post', //POST 방식으로 전달\n");
      out.write("		data:{mem_pw:mem_pw},\n");
      out.write("		success:function(isOk){ //컨트롤러에서 넘어온 isOK값을 받는다 \n");
      out.write("			if(isOk == 'pw_ok'){ //ok이면 가입 가능\n");
      out.write("				$('.pw_ok').css(\"display\",\"inline-block\"); \n");
      out.write("				$('.pw_rewrite').css(\"display\", \"none\"); //정규식 어긋나면\n");
      out.write("				$('.pw_null').css(\"display\", \"none\");\n");
      out.write("			}else if(isOk =='pw_null'){//input이 null값임. 입력 요청\n");
      out.write("				$('.pw_ok').css(\"display\",\"none\"); \n");
      out.write("				$('.pw_rewrite').css(\"display\", \"none\");\n");
      out.write("				$('.pw_null').css(\"display\", \"inline-block\");\n");
      out.write("			} \n");
      out.write("			else { //중복일 경우\n");
      out.write("				$('.pw_ok').css(\"display\", \"none\");\n");
      out.write("				$('.pw_rewrite').css(\"display\",\"inline-block\");\n");
      out.write("				$('.pw_null').css(\"display\", \"none\");\n");
      out.write("				// alert(\"아이디를 다시 입력해주세요\");\n");
      out.write("				$('#mem_pw').val('');\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error:function(request,status,error){\n");
      out.write("		console.log(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error:\"+error);\n");
      out.write("		}	\n");
      out.write("\n");
      out.write("	});\n");
      out.write("	};	\n");
      out.write("	function checkCellNum(){\n");
      out.write("        var mem_cell_num = document.getElementById('mem_cell_num').value; //id값이 \"id\"인 입력란의 값을 저장\n");
      out.write("		console.log(mem_cell_num);\n");
      out.write("        $.ajax({\n");
      out.write("            url:'/mem/cellNumCheck', //Controller에서 요청 받을 주소\n");
      out.write("            type:'post', //POST 방식으로 전달\n");
      out.write("            data:{mem_cell_num:mem_cell_num},\n");
      out.write("            success:function(isOk){ //컨트롤러에서 넘어온 isOK값을 받는다 \n");
      out.write("                if(isOk == 'cellNum_ok'){ //ok이면 가입 가능\n");
      out.write("                    $('.cellNum_ok').css(\"display\",\"inline-block\"); \n");
      out.write("                    $('.cellNum_duplicate').css(\"display\", \"none\");\n");
      out.write("					$('.cellNum_null').css(\"display\", \"none\");\n");
      out.write("                }else if(isOk =='cellNum_null'){//input이 null값임. 입력 요청\n");
      out.write("					$('.cellNum_ok').css(\"display\",\"none\"); \n");
      out.write("                    $('.cellNum_duplicate').css(\"display\", \"none\");\n");
      out.write("					$('.cellNum_null').css(\"display\", \"inline-block\");\n");
      out.write("				}\n");
      out.write("				else { //중복일 경우\n");
      out.write("                    $('.cellNum_ok').css(\"display\", \"none\");\n");
      out.write("                    $('.cellNum_duplicate').css(\"display\",\"inline-block\");\n");
      out.write("					$('.cellNum_null').css(\"display\", \"none\");\n");
      out.write("                    // alert(\"아이디를 다시 입력해주세요\");\n");
      out.write("                    $('#mem_cell_num').val('');\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("			error:function(request,status,error){\n");
      out.write("			console.log(\"code:\"+request.status+\"\\n\"+\"message:\"+request.responseText+\"\\n\"+\"error:\"+error);\n");
      out.write("			}	\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        };\n");
      out.write("\n");
      out.write("	</script>\n");
      out.write("</body>\n");
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
}

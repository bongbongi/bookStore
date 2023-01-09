<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>NO</th>
            <th>공지제목</th>
            <th>작성자</th>
            <th>작성일</th>
        </tr>
        <c:forEach items="${notice_list}" var="ntc" >
	        <tr>
	            <td>${ntc.ntc_num}</td>
	            <td><a href="/ntc/noticeDetail?ntc_num=${ntc.ntc_num}">${ntc.ntc_title}</a></td>
	            <td>${ntc.ntc_writer}</td>
	            <td>${ntc.ntc_regdate}</td>
	        </tr> 
        </c:forEach>       
    </table>
	<button type="button">공지사항 목록</button>
</body>
</html>
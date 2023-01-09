<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.noticeDetail{
	margin:0 auto;
	width: 1260px;
}
hr{
	margin: 8px;
}
button{
	margin: 8px;
}
</style>
</head>
<body>
	<jsp:include page="../layout/header.jsp"></jsp:include>
	<div class="noticeDetail">
		<h2>${nvo.ntc_title}</h2>
		${nvo.ntc_writer}
		${nvo.ntc_regdate}
		<hr>
		${nvo.ntc_content}
		<Br>
		<a href="/ntc/notice">
			<button type="button" class="btn btn-outline-secondary">공지사항 목록</button>
		</a>
	</div>
	⁠<jsp:include page="../layout/footer.jsp"></jsp:include>
</body>
</html>
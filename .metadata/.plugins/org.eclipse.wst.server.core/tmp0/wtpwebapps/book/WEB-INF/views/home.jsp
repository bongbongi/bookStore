<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.net.URL"%>
<%@ page import="java.net.HttpURLConnection"%>
<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.InputStreamReader"%>

<html>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/92e616dfba.js" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<head>
<title>Home</title>
<style>
* {
	text-align: center;
}

.home_main {
	margin:0 auto;
	width: 1260px;
}

body {
	

}

.slide {
	background-color: peru;
	margin: 0 auto;
	width: 1260px;
	height: 500px;
}

.todayBookImg {
	width: 300px;
	height: 300px;
	background-color: aqua;
}

.todayBookImg>img {
	width: 300px;
	height: 300px;
}

.todayBook {
	margin: 20px 0;
}

.todayBookIntroduce {
	margin: 0 auto;
	display: flex;
}

.Best_item {
	width: 230px;
	height: 310px;
	/* background-color: antiquewhite; */
	display: inline-block;
	vertical-align: top;
	margin-right: 10px;
	margin-bottom: 50px;
	
	border:1px solid darkgray;
	border-radius: 20px;
}

.img_box {
	width: 220px;
	height: 200px;
	/* background-color: lightgray; */
	margin: 5px;
}
.book_img{
	width: 180px;
	height: 200px;
}
.main_book_header{
	font-size:16px;
}
.main_book_writer{
	font-size:10px;
}

.BestSellerList {
	list-style: none;

	padding:0px;
	/* display: -moz-inline-box; */
}

.BestSellerList:nth-last-child(-n+5) {
	margin-top: 50px;
}

.bestSeller {
	/* display: flex; */
	
}

.d-block {
	height: 500px;
}
.rank>i{
	margin:5px;
	padding:0;
	
	text-align: center;
 /* 	text-align: left; */
}
.fa-1{
 font-size:15px;
 	margin-left:8px;
}
.foot-ad{
	background-color: purple;
	height: 200px;
	margin: 20px 0px;
}
.foot-ad>a>img{
	height: 200px;
}
.ad-one{
	margin: 20px 0;
	height: 150px;
	display: flex;
	justify-content: space-around;
}

.ad_mini{
	width: 300px;
	height:150px;
}
.ad_mini>a>img{
	border-radius: 10px;
	width: 300px;
	height:150px;
	
}
</style>
</head>
<body>
	<jsp:include page="./layout/header.jsp"></jsp:include>


	<div class="home_main">
		<nav class="navbar navbar-expand-lg bg-light">
			<div class="container-fluid">
				<!-- <a class="navbar-brand" href="#">Navbar</a> -->
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<!-- <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">이벤트</a>
              </li> -->
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 카테고리 </a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="/novel">소설</a></li>
								<li><a class="dropdown-item" href="/essay">에세이</a></li>
								
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="/problem">문제집</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link" href="/">베스트</a></li>
						<li class="nav-item"><a class="nav-link" href="#">이벤트</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="slide">
         <div id="carouselExampleCaptions" class="carousel slide"
            data-bs-ride="false">
            <div class="carousel-indicators">
               <button type="button" data-bs-target="#carouselExampleCaptions"
                  data-bs-slide-to="0" class="active" aria-current="true"
                  aria-label="Slide 1"></button>
               <button type="button" data-bs-target="#carouselExampleCaptions"
                  data-bs-slide-to="1" aria-label="Slide 2"></button>
               <button type="button" data-bs-target="#carouselExampleCaptions"
                  data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
               <div class="carousel-item active">
                  <img
                     src="../resources/img/main-slide-ad1.jpg"
                     class="d-block w-100" alt="...">
               </div>
               <div class="carousel-item">
                  <img
                     src="../resources/img/main-slide-ad2.jpg"
                     class="d-block w-100" alt="...">            
               </div>
               <div class="carousel-item">
                  <img
                     src="../resources/img/main-slide-ad3.jpg"
                     class="d-block w-100" alt="...">
               </div>
            </div>
            <button class="carousel-control-prev" type="button"
               data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
               <span class="carousel-control-prev-icon" aria-hidden="true"></span>
               <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button"
               data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
               <span class="carousel-control-next-icon" aria-hidden="true"></span>
               <span class="visually-hidden">Next</span>
            </button>
         </div>
      </div>
      
      <div class="ad-one">
         <div class="ad_mini">
            <a href="#">
               <img src="../resources/img/mini-ad1.jpg">
            </a>
         </div>
         <div class="ad_mini">
            <a href="#">
               <img src="../resources/img/mini-ad1.jpg">
            </a>
         </div>
         <div class="ad_mini">
            <a href="#">
               <img src="../resources/img/mini-ad1.jpg">
            </a>
         </div>
      </div>
      <c:choose>
      <c:when test="${content eq 'main'}">
      <div class="hidden">
      <h1>베스트 셀러</h1>
      <div class="BestSeller">
         <ul class="BestSellerList">
         <c:forEach items="${book_list}" var="list" begin="1" end="10">
            <li class="Best_item">
               <div class="rank">
                  <i class="fa-solid fa-1"></i>   
               </div>
               <div class="img_box">
                  <a href="/book/bkDetailView?book_num=${list.book_num}">
                     <img class="book_img" src="${list.book_image}">
                  </a>
               </div>
               <div class="info_box">
                  <span class="main_book_header">${list.book_title}</span>
                  <Br> 
                  <span class="main_book_writer">${list.book_writer} : ${list.book_publisher}</span>
               </div>
            </li>
         </c:forEach>   
         </ul>
      </div>
      </div>
      </c:when>
      
      <c:when test="${content eq 'novel'}">
      
      <div class="hidden">
      <h1>소설 top10</h1>
      <div class="BestSeller">
         <ul class="BestSellerList">
         <c:forEach items="${book_list}" var="list" begin="1" end="10">
            <li class="Best_item">
               <div class="rank">
                  <i class="fa-solid fa-1"></i>   
               </div>
               <div class="img_box">
                  <a href="#">
                     <img class="book_img" src="${list.book_image}">
                  </a>
               </div>
               <div class="info_box">
                  <span class="main_book_header">${list.book_title}</span>
                  <Br> 
                  <span class="main_book_writer">${list.book_writer} : ${list.book_publisher}</span>
               </div>
            </li>
         </c:forEach>   
            
         </ul>


      </div>
      </div>
      
      </c:when>
      <c:when test="${content eq 'essay'}">
      
      <div class="hidden">
      <h1>essay top10</h1>
      <div class="BestSeller">
         <ul class="BestSellerList">
         <c:forEach items="${book_list}" var="list" begin="1" end="10">
            <li class="Best_item">
               <div class="rank">
                  <i class="fa-solid fa-1"></i>   
               </div>
               <div class="img_box">
                  <a href="#">
                     <img class="book_img" src="${list.book_image}">
                  </a>
               </div>
               <div class="info_box">
                  <span class="main_book_header">${list.book_title}</span>
                  <Br> 
                  <span class="main_book_writer">${list.book_writer} : ${list.book_publisher}</span>
               </div>
            </li>
         </c:forEach>   
            
         </ul>


      </div>
      </div>
      
      </c:when>
      <c:when test="${content eq 'problem'}">
      
      <div class="hidden">
      <h1>문제집 top10</h1>
      <div class="BestSeller">
         <ul class="BestSellerList">
         <c:forEach items="${book_list}" var="list" begin="1" end="10">
            <li class="Best_item">
               <div class="rank">
                  <i class="fa-solid fa-1"></i>   
               </div>
               <div class="img_box">
                  <a href="#">
                     <img class="book_img" src="${list.book_image}">
                  </a>
               </div>
               <div class="info_box">
                  <span class="main_book_header">${list.book_title}</span>
                  <Br> 
                  <span class="main_book_writer">${list.book_writer} : ${list.book_publisher}</span>
               </div>
            </li>
         </c:forEach>   
      </div>
            
         </ul>


      </div>
      
      </c:when>
      
      </c:choose>
      <!-- order by rand() limit 1 로 mapper -->
      <div class="todayBook">
         <h1>오늘의 책</h1>
         <div class="todayBookIntroduce">
            <div class="todayBookImg">
               <img
                  src="https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9791167740847.jpg">
            </div>
            <div>
               <h4>다시, 어떻게 읽을 것인가</h4><br>
               <span>나오미 어쩌구, 전병근 옮김</span><br>
               <span>이크로스</span><br>
               <span>
                  종이에서 스크린, 오디오까지 디지털 전환 시대의 새로운 읽기 전략
               </span><br>
               
            </div>
         </div>
      </div>
      <!-- 광고 -->
      <div class="foot-ad">
         <a href="#">
            <img src="../resources/img/newYearAD.jpg">
         </a>
      </div>
   </div>
   <jsp:include page="./layout/footer.jsp"></jsp:include>
</body>
</html>

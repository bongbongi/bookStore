<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>

<head>

<link rel="stylesheet" type="text/css" href="/resources/css/adminpage.css">
<link rel="stylesheet" type="text/css" href="/resources/css/adminpageFaq.css">
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
.accordion-flush {
	margin: 0 auto;
	width: 500px;
}

.bookRegisterBox {
	width: 400px;
	margin: 0 auto;
	margin-top: 40px;
}
#logo{
	width: 100px;
	height: 100px;
}
</style>
<body>
	<script type="text/javascript">
		const ses = '<c:out value="${ses.mem_id}" />';
		if(ses == null || ses == ''){
			alert('로그아웃 되었습니다. 메인화면으로 이동합니다.');
			location.href='/';
		}
		
	</script>
	<div class="main">
		<div class="menu_wrap">
			<ul class="de01">
				<li>
					<a href="/"> <img src="../resources/img/logo.jpg" alt="로고" id="logo"></a>
				</li>
				<li>
				관리자 ${ses.mem_name}님<br>환영합니다!!
				</li>
				<li><a href="/admin/memList">회원관리</a>
					<ul class="de02">
						<li><a href="/admin/memList">리스트</a></li>
					</ul></li>
				<li><a href="/ntc/noticeList">공지사항</a>
					<ul class="de02">
						<li><a href="/ntc/noticeList">리스트</a></li>
						<li><a href="/ntc/noticeRegister">등록</a></li>
					</ul></li>
				<li><a href="/faq/faqList">FAQ</a>
					<ul class="de02">
						<li><a href="/faq/faqList">리스트</a></li>
						<li><a href="/faq/faqReg">등록</a></li>
					</ul></li>
				<li><a href="/admin/list">1대1문의</a>
					<ul class="de02">
						<li><a href="/admin/list">리스트</a></li>
					</ul></li>
				<li><a href="/book/list">상품관리</a>
					<ul class="de02">
						<li><a href="/book/list">리스트</a></li>
						<li><a href="/book/bkRegister">등록</a></li>
					</ul></li>
				<li><a href="/mem/logOut">로그아웃</a></li>
			</ul>
		</div>
		<div>
			<c:forEach items="${category}" var="category">
				<c:forEach items="${content}" var="content">
					<c:choose>
						<c:when test="${category eq 'member'}">
							<div>
								<table border="1">
									<tr>
										<th>회원번호</th>
										<th>아이디</th>
										<th>이름</th>
										<th>가입일자</th>
										<th>회원탈퇴</th>
									</tr>
									<c:forEach items="${memLi }" var="ad">
										<tr>
											<td>${ad.mem_num }</td>
											<td>${ad.mem_id }</td>
											<td>${ad.mem_name }</td>
											<td>${ad.mem_date }</td>
											<td>
												<a href="/admin/memRemove?mem_num=${ad.mem_num }">탈퇴</a>
											</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</c:when>


						<c:when test="${category eq 'notice'}">
							<c:choose>
								<c:when test="${content eq 'notice_list'}">
									<table border="1">
										<tr>
											<th>NO</th>
											<th>공지제목</th>
											<th>작성자</th>
											<th>작성일</th>
										</tr>
										<c:forEach items="${notice_list}" var="ntc">
											<tr>
												<td>${ntc.ntc_num}</td>
												<td>
													<a href="/ntc/noticeDetail?ntc_num=${ntc.ntc_num}">${ntc.ntc_title}</a>
												</td>
												<td>${ntc.ntc_writer}</td>
												<td>${ntc.ntc_regdate}</td>
											</tr>
										</c:forEach>
									</table>
									<div>
										<c:if test="${pgh.prev}">
											<a href="/ntc/noticeList?pageNo=${pgh.startPage-1}&qty=${pgh.pgvo.qty}">prev</a>
										</c:if>
										<c:forEach begin="${pgh.startPage }" end="${pgh.endPage }" var="i">
											<a href="/ntc/noticeList?pageNo=${i}&qty=${pgh.pgvo.qty}">${i} ｜ </a>
										</c:forEach>
										<c:if test="${pgh.next}">
											<a href="/ntc/noticeList?pageNo=${pgh.endPage+1}&qty=${pgh.pgvo.qty}">next</a>
										</c:if>
									</div>
								</c:when>
								<c:when test="${content eq 'noticeRegister' }">
									<form action="/ntc/noticeRegister" method="post">
										<table border="1">
											<tr>

												<th>공지제목</th>
												<th>작성자</th>
												<th>내용</th>
											</tr>

											<tr>
												<td>
													<input type="text" name="ntc_title">
												</td>
												<td>
													<input type="text" name="ntc_writer" value="${ses.mem_name}" readonly="readonly">
												</td>

												<td>
													<input type="text" name="ntc_content">
												</td>
											</tr>
										</table>
										<button type="submit">작성</button>
									</form>
								</c:when>
								<c:when test="${content eq 'noticeDetail' }">
									<div class="noticeDetail">
										<h2>${nvo.ntc_title}</h2>
										${nvo.ntc_writer} ${nvo.ntc_regdate}
										<hr>
										${nvo.ntc_content} <Br> <a href="/ntc/notice">
											<button type="button" class="btn btn-outline-secondary">공지사항 목록</button>
										</a>
									</div>

									<a href="/ntc/noticeModify?ntc_num=${nvo.ntc_num}"><button type="button">수정</button></a>
									<a href="/ntc/noticeDelete?ntc_num=${nvo.ntc_num}"><button type="button">삭제</button></a>
								</c:when>
								<c:when test="${content eq 'noticeModify' }">
									<form action="/ntc/noticeModify" method="post">
										<table border="1">
											<tr>
												<th>글번호</th>
												<th>공지제목</th>
												<th>작성자</th>
												<th>내용</th>
											</tr>

											<tr>
												<td>
													<input type="text" name="ntc_num" value="${nvo.ntc_num}">
												</td>
												<td>
													<input type="text" name="ntc_title" value="${nvo.ntc_title}">
												</td>
												<td>
													<input type="text" name="ntc_writer" value="${nvo.ntc_writer}" readonly="readonly">
												</td>

												<td>
													<input type="text" name="ntc_content" value="${nvo.ntc_content}">
												</td>
											</tr>
										</table>
										<button type="submit">수정</button>
										<a href="/ntc/noticeList"><button type="button">공지사항목록으로</button></a>
									</form>
								</c:when>
							</c:choose>
						</c:when>


						<c:when test="${category eq 'faq'}">
							<c:choose>

								<c:when test="${content eq 'faqList' }">
									<div class="accordion accordion-flush" id="accordionFlushExample">
										<c:forEach items="${li }" var="faq">
											<div class="accordion-item">
												<h2 class="accordion-header" id="flush-headingOne">
													<button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">${faq.faq_num }${faq.faq_question }</button>
												</h2>
												<div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
													<div class="accordion-body">${faq.faq_answer }</div>
													<a href="/faq/faqDetail?faq_num=${faq.faq_num}">faq 상세</a><br>
												</div>
											</div>
										</c:forEach>
									</div>
									<a href="/">홈으로</a>

								</c:when>
								<c:when test="${content eq 'faqRegister' }">
									<div class="faqRegister">
										<form action="/faq/faqReg" method="post">
											<table>
												<tr>
													<th>질문</th>
													<td>
														<input type="text" name="faq_question" class="question">
													</td>
												</tr>
												<tr>
													<th>답변</th>
													<td>
														<textarea rows="4" cols="40" name="faq_answer" style="resize: none;"></textarea>
													</td>
												</tr>
											</table>
											<button type="submit" class="btn btn-secondary">FAQ 쓰기</button>
										</form>
									</div>

								</c:when>
								<c:when test="${content eq 'faqDetail' }">
									<table border="1">
										<tr>
											<th>faq_num</th>
											<td>${fo.faq_num }</td>
										</tr>
										<tr>
											<th>faq_question</th>
											<td>${fo.faq_question }</td>
										</tr>
										<tr>
											<th>faq_answer</th>
											<td>${fo.faq_answer }</td>
										</tr>
									</table>
									<a href="/faq/faqModify?faq_num=${fo.faq_num }">수정</a>
									<a href="/faq/faqRemove?faq_num=${fo.faq_num }">삭제</a>

								</c:when>
								<c:when test="${content eq 'faqModify' }">
									<form action="/faq/faqModify?faq_num=${fo.faq_num }" method="post">
										<table>

											<tr>
												<th>질문</th>
												<td>
													<input type="text" name="faq_question" value="${fo.faq_question }">
												</td>
											</tr>
											<tr>
												<th>답변</th>
												<td>
													<textarea rows="4" cols="40" name="faq_answer">${fo.faq_answer }</textarea>
												</td>
											</tr>

										</table>
										<button type="submit">faq 수정하기</button>
									</form>

								</c:when>
							</c:choose>
						</c:when>

						<c:when test="${category eq 'mantoman'}">
							<c:choose>

								<c:when test="${content eq 'boardList' }">
									<div class="mypage-right">
										<table class="table">
											<h4>1대1문의</h4>
											<thead>
												<tr>
													<th scope="col">글번호</th>
													<th scope="col">제목</th>
													<th scope="col">카테고리</th>
													<th scope="col">글쓴이</th>
													<th scope="col">작성일자</th>
													<th scope="col">조회수</th>
												</tr>
											</thead>


											<c:forEach items="${list}" var="board">
												<c:choose>
													<c:when test="${ses.mem_auth == '0'|| ses.mem_id == board.brd_writer}">
														<tbody>
															<tr>
																<td scope="row">${board.brd_num}</td>
																<td>
																	<a href="/admin/boardDetail?brd_num=${board.brd_num}">${board.brd_title}</a>
																</td>
																<td>${board.brd_category}</td>
																<td>${board.brd_writer}</td>
																<td>${board.brd_regdate}</td>
																<td>${board.brd_views}</td>

															</tr>
														</tbody>
													</c:when>

													<c:otherwise>
														<tr>
															<td>${board.brd_num}</td>
															<td>
																<c:choose>
																	<c:when test="${ses.mem_id eq board.brd_writer}">
                                                               ${board.brd_title}
                                                            </c:when>
																	<c:otherwise>
                                                               ${board.brd_title}
                                                            </c:otherwise>
																</c:choose>
															</td>
															<td>${board.brd_category}</td>
															<c:choose>
																<c:when test="${ses.mem_id eq board.brd_writer}">
																	<td>${board.brd_writer}</td>
																</c:when>
																<c:otherwise>
																	<td>******</td>
																</c:otherwise>
															</c:choose>
															<td>${board.brd_regdate}</td>
															<td>${board.brd_views}</td>
														</tr>
													</c:otherwise>
												</c:choose>
											</c:forEach>


										</table>
										<div>
											<c:if test="${pgh.prev}">
												<a href="/admin/list?pageNo=${pgh.startPage-1}&qty=${pgh.pgvo.qty}&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">prev</a>
											</c:if>
											<c:forEach begin="${pgh.startPage }" end="${pgh.endPage }" var="i">
												<a href="/admin/list?pageNo=${i}&qty=${pgh.pgvo.qty}&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">${i} ｜ </a>
											</c:forEach>
											<c:if test="${pgh.next}">
												<a href="/admin/list?pageNo=${pgh.endPage+1}&qty=${pgh.pgvo.qty}&type=${pgh.pgvo.type}&keyword=${pgh.pgvo.keyword}">next</a>
											</c:if>
										</div>
										<!-- search -->

										<div class="col-sm-12 col-md-6">
											<form action="/admin/list" method="get">
												<div class="input-group mb-3">
													<!-- 값을 별도 저장 -->
													<c:set value="${pgh.pgvo.type}" var="typed" />
													<select class="form-select" name="type">
														<option ${typed==null ? 'selected' :'' }>항목</option>
														<option value="t" ${typed eq 't' ? 'selected' :'' }>제목</option>
														<option value="c" ${typed eq 'c' ? 'selected' :'' }>내용</option>
														<option value="w" ${typed eq 'w' ? 'selected' :'' }>작성자</option>
													</select>
													<input class="form-control" type="text" name="keyword" placeholder="포함해서찾기" value="${pgn.pgvo.keyword }"> <input type="hidden" name="pageNo" value="1"> <input type="hidden" name="qty" value="${pgh.pgvo.qty }">
													<button type="submit" class="btn btn-success position-relative">
														결과 <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"> ${pgh.totalCount}개 <span class="visually-hidden">unread messages</span>
														</span>
													</button>
												</div>
											</form>
										</div>

									</div>
								</c:when>

								<c:when test="${content eq 'boardDetail' }">
									<div class="mypage-right boardDetail">
										글번호 ${board.brd_num}
										<h2>${board.brd_title}</h2>
										<sapn class="boardDetail-writer">${board.brd_writer}</sapn>
										<span class="boardDetail-regdate">${board.brd_regdate}</span>
										<hr>
										<div class="boardDetail-content">${board.brd_content}</div>
										<Br> <a href="/admin/boardModify?brd_num=${board.brd_num}">
											<button type="button" class="btn btn-success">수정</button>
										</a> <a href="/admin/boardRemove?brd_num=${board.brd_num}">
											<button type="button" class="btn btn-danger">삭제</button>
										</a><a href="/admin/list">
											<button type="button" class="btn btn-outline-secondary">1대1문의 리스트 목록</button>
										</a> <br>

										<div class="container">
											<div class="input-group my-3">
												<span class="input-group-text" id="cmtWriter">${ses.mem_id}</span> <input type="text" class="form-control" id="cmtText" placeholder="Test Add Comment ">
												<button class="btn btn-success" id="cmtPostBtn" type="button">Post</button>
											</div>
											<ul class="list-group list-group-flush" id="cmtListArea">
												<li class="list-group-item d-flex justify-content-between align-items-start">
													<div class="ms-2 me-auto">
														<div class="fw-bold">Writer</div>
														Content for Comment
													</div> <span class="badge bg-dark rounded-pill">modAt</span>
												</li>
											</ul>
										</div>


										<script type="text/javascript">
											const bnoVal = '<c:out value="${board.brd_num}" />';
											const id = '<c:out value="${ses.mem_id}"/>'
											console.log(id);
											console.log(bnoVal);
										</script>
										<script type="text/javascript" src="/resources/js/boardComment.js"></script>
										<script type="text/javascript">
											getCommentList(bnoVal, id);
										</script>
									</div>

								</c:when>
								<c:when test="${content eq 'boardModify' }">
									<div class="boardRegister mypage-right">
										<div class="boardRegisterBox">
											<form action="/admin/modify" method="post">
												<input type="text" name="brd_num" value="${board.brd_num}" readonly hidden><br>

												<div class="brd_titleAndWriter">
													<label for="brd_title">제목</label> <input type="text" name="brd_title" class="brd_title" value="${board.brd_title}" required> <label for="brd_writer">작성자</label> <input type="text" name="brd_writer" value="${ses.mem_id}" value="${board.brd_writer}" readonly><br>
												</div>
												<div class="brd_regdate">
													<label for="brd_regdate">작성일</label> <input type="text" name="brd_regdate" value="${board.brd_regdate}" readonly><br>
												</div>
												<div class="brd_content">
													<label for="brd_content">내용</label><br> <input type="text" name="brd_content" class="brd_content" value="${board.brd_title}" required>

												</div>
												<button type="submit" class="btn btn-secondary btnModify">수정</button>
												<div name="brd_mem_num" value="${ses.mem_num}"></div>
											</form>
										</div>
									</div>
								</c:when>

							</c:choose>

						</c:when>

						<c:when test="${category eq 'product'}">
							<c:choose>
								<c:when test="${content eq 'bookList' }">
									<table border="1" class="table table-hover">
										<tr>
											<th>book_num</th>
											<th>book_image</th>
											<th>book_title</th>
											<th>book_writer</th>
											<th>book_price</th>
											<th>book_saleprice</th>
											<th>book_sales</th>
											<th>book_publisher</th>
											<th>book_writer_num</th>
											<th>book_date</th>
											<th>book_count</th>
											<th>book_content</th>
											<th>book_ca_num</th>
											<th>control</th>
										</tr>
										<c:forEach items="${li }" var="bo">
											<tr>
												<td>${bo.bvo.book_num }</td>
												<td>
													<img src="/upload/${fn:replace(bo.save_dir,'\\','/')}/${bo.uuid}_th_${bo.file_name}" alt="bookThumbnail">
												</td>
												<td>${bo.bvo.book_title }</td>
												<td>${bo.bvo.book_writer }</td>
												<td>${bo.bvo.book_price }</td>
												<td>${bo.bvo.book_saleprice }</td>
												<td>${bo.bvo.book_sales }</td>
												<td>${bo.bvo.book_publisher }</td>
												<td>${bo.bvo.book_writer_num }</td>
												<td>${bo.bvo.book_date }</td>
												<td>${bo.bvo.book_count }</td>
												<td>${bo.bvo.book_content }</td>
												<td>${bo.bvo.book_ca_num }</td>
												<td>
													<a href="/book/detail?book_num=${bo.bvo.book_num }"><button class="view">view</button></a> 
													<a href="/book/bkRemove?book_num=${bo.bvo.book_num }"><button class="delete">Delete</button></a>
												</td>
											</tr>
										</c:forEach>
									</table>

									<!-- paging line -->
									<ul class="pagination justify-content-center">
										<c:if test="${pgn.prev }">
											<li class="page-item"><a href="/book/list?pageNo=${pgn.startPage - 1 }&qty=${pgn.pgvo.qty}&type=${pgn.pgvo.type}&keyword=" ${pgn.pgvo.keyword }" class="page-link">Prev</a></li>
										</c:if>
										<c:forEach begin="${pgn.startPage }" end="${pgn.endPage }" var="i">
											<li class="page-item ${pgn.pgvo.pageNo == i ? 'active':''}" aria-current="page"><a class="page-link" href="/book/list?pageNo=${i }&qty=${pgn.pgvo.qty}&type=${pgn.pgvo.type}&keyword="${pgn.pgvo.keyword }">${i }</a></li>
										</c:forEach>
										<c:if test="${pgn.next }">
											<li class="page-item"><a class="page-link" href="/book/list?pageNo=${pgn.endPage + 1 }&qty=${pgn.pgvo.qty}&type=${pgn.pgvo.type}&keyword="${pgn.pgvo.keyword }">Next</a></li>
										</c:if>
									</ul>
									<a href="/book/bkRegister">
										<button type="button" class="btn btn-outline-info">글쓰기</button>
									</a>

								</c:when>

								<c:when test="${content eq 'bookDetail' }">
									<table border="1" class="table table-hover">
										<tr>
											<th>book_title</th>
											<td>${bo.book_title }</td>
										</tr>
										<tr>
											<th>book_writer</th>
											<td>${bo.book_writer }</td>
										</tr>
										<tr>
											<th>book_price</th>
											<td>${bo.book_price }</td>
										</tr>
										<tr>
											<th>book_saleprice</th>
											<td>${bo.book_saleprice }</td>
										</tr>
										<tr>
											<th>book_sales</th>
											<td>${bo.book_sales }</td>
										</tr>
										<tr>
											<th>book_publisher</th>
											<td>${bo.book_publisher }</td>
										</tr>
										<tr>
											<th>book_writer_num</th>
											<td>${bo.book_writer_num }</td>
										</tr>
										<tr>
											<th>book_date</th>
											<td>${bo.book_date }</td>
										</tr>
										<tr>
											<th>book_count</th>
											<td>${bo.book_count }</td>
										</tr>
										<tr>
											<th>book_content</th>
											<td>
												<textarea rows="5" cols="50">${bo.book_content }</textarea>
											</td>
										</tr>
										<tr>
											<th>book_ca_num</th>
											<td>${bo.book_ca_num }</td>
										</tr>

									</table>
									<!-- file 표현라인 -->
									<div>
										<ul style="list-style: none;">
											<!-- c:if 파일이 없으면 첨부 File이 없습니다. 출력 -->
											<c:forEach items="${fList }" var="fvo">
												<!-- 파일이 여러개 일 때 반복적으로 li 추가 -->
												<li><c:choose>
														<c:when test="${fvo.file_type > 0 }">
															<div>
																<!--D:~fileUpload/2022/12/28/dog.jpg -->
																<img src="/upload/${fn:replace(fvo.save_dir,'\\','/')}/${fvo.uuid}_th_${fvo.file_name}" style="list-style: none;">
															</div>
														</c:when>
														<c:otherwise>
															<div>
																<!-- 파일모양 아이콘을 넣어서 일반 파일임을 표현하면 됨. -->
															</div>
														</c:otherwise>
													</c:choose> <!-- 파일이름, 등록일, 사이즈 -->
													<div>
														<div>${fvo.file_name }</div>
													</div></li>
											</c:forEach>
										</ul>
									</div>
									<a href="/book/bkModify?book_num=${bo.book_num}"><button type="button">책 수정</button></a>
								</c:when>
								<c:when test="${content eq 'bookRegister' }">
									<div class=bookRegisterBox>
										<form action="/book/bkRegister" method="post" enctype="multipart/form-data">
											<table border="1" class="table table-hover">
												<tr>
													<td>책제목</td>
													<td>
														<input type="text" name="book_title">
													</td>
												</tr>
												<tr>
													<td>작가</td>
													<td>
														<input type="text" name="book_writer">
													</td>
												</tr>
												<tr>
													<td>책가격</td>
													<td>
														<input type="text" name="book_price">
													</td>
												</tr>
												<tr>
													<td>할인가격</td>
													<td>
														<input type="text" name="book_saleprice">
													</td>
												</tr>
												<tr>
													<td>판매량</td>
													<td>
														<input type="text" name="book_sales">
													</td>
												</tr>
												<tr>
													<td>출판사</td>
													<td>
														<input type="text" name="book_publisher">
													</td>
												</tr>
												<tr>
													<td>작가번호</td>
													<td>
														<input type="text" name="book_writer_num">
													</td>
												</tr>
												<tr>
													<td>출판일</td>
													<td>
														<input type="text" name="book_date">
													</td>
												</tr>
												<tr>
													<td>책수량</td>
													<td>
														<input type="text" name="book_count">
													</td>
												</tr>
												<tr>
													<td>책이미지</td>
													<td>
														<input type="file" style="display: none;" id="files" name="files" multiple>
														<button type="button" id="trigger">Files Upload</button>
													</td>
												</tr>
												<tr>
													<td>책소개내용</td>
													<td>
														<textarea rows="5" cols="50" name="book_content" style="resize: none; width: 185px;"></textarea>
													</td>
												</tr>
												<tr>
													<td>카테고리번호</td>
													<td>
														<input type="text" name="book_ca_num">
													</td>
												</tr>
											</table>

											<div id="fileZone"></div>
											<button type="submit" id="regBtn" class="btn btn-secondary">책 등록</button>
										</form>
									</div>
									<script src="/resources/js/bookRegister.js"></script>
								</c:when>
								<c:when test="${content eq 'bookModify' }">
									<form action="/book/modify" method="post" enctype="multipart/form-data">
										<table border="1" class="table table-hover">
											<tr>
												<th>book_num</th>
												<td>
													<input type="text" name="book_num" value="${bo.book_num }" readonly>
												</td>
											</tr>
											<tr>
												<th>book_title</th>
												<td>
													<input type="text" name="book_title" value="${bo.book_title }">
												</td>
											</tr>
											<tr>
												<th>book_writer</th>
												<td>
													<input type="text" name="book_writer" value="${bo.book_writer }">
												</td>
											</tr>
											<tr>
												<th>book_price</th>
												<td>
													<input type="text" name="book_price" value="${bo.book_price }">
												</td>
											</tr>
											<tr>
												<th>book_publisher</th>
												<td>
													<input type="text" name="book_publisher" value="${bo.book_publisher }">
												</td>
											</tr>
											<tr>
												<th>book_count</th>
												<td>
													<input type="text" name="book_count" value="${bo.book_count }">
												</td>
											</tr>
											<tr>
												<th>book_content</th>
												<td>
													<textarea rows="5" cols="50" name="book_content">${bo.book_content }</textarea>
												</td>
											</tr>
										</table>

										<!-- file 표현라인 -->
										<div>
											<ul style="list-style: none;">
												<c:forEach items="${fList }" var="fvo">
													<!-- 파일이 여러개 일 때 반복적으로 li 추가 -->
													<li><c:choose>
															<c:when test="${fvo.file_type > 0 }">
																<div>
																	<!--D:~fileUpload/2022/12/28/dog.jpg -->
																	<img src="/upload/${fn:replace(fvo.save_dir,'\\','/')}/${fvo.uuid}_th_${fvo.file_name}">
																</div>
															</c:when>
															<c:otherwise>
																<div>
																	<!-- 파일모양 아이콘을 넣어서 일반 파일임을 표현하면 됨. -->
																</div>
															</c:otherwise>
														</c:choose> <!-- 파일이름, 등록일, 사이즈 -->
														<div>
															<div>${fvo.file_name }</div>
															${fvo.reg_at }
														</div> <span>${fvo.file_size } Byte</span>
														<button type="button" data-uuid=${fvo.uuid } class="file-x">X</button></li>
												</c:forEach>
											</ul>
										</div>
										<!-- 파일 수정에 따른 등록라인 -->
										<input type="file" style="display: none;" id="files" name="files" multiple>
										<button type="button" id="trigger">Files Upload</button>

										<div id="fileZone"></div>
										<button type="submit" id="regBtn">수정</button>
									</form>
									<script src="/resources/js/bookRegister.js"></script>
									<script src="/resources/js/bookRemove.js"></script>
								</c:when>

							</c:choose>
						</c:when>



					</c:choose>
				</c:forEach>
			</c:forEach>
		</div>
	</div>

</body>

</html>
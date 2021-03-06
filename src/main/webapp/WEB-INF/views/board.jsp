<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath }" var="cp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Home</title>
<script src="https://kit.fontawesome.com/cc3f76d574.js"></script>
<link rel="styleSheet" href="${cp}/css/style.css" />
</head>
<body style="background: url('${cp}/img/pixel_heart.png');">
	<main>
		<div class="main1">
			<div class="wrapper">
				<div class="wrapper2">
					<div class="context1">
						<div class="context1__visitor">TODAY 00 | TOTAL 00</div>
						<div class="context1__profile">
							<div class="context1__boardList">
								<div class="boardList-1 board">
									<a href="${cp}/board/board/"><i class="fas fa-folder"></i> <span>1번 게시판</span></a>
								</div>
								<div class="boardList-1 board">
									<a href="${cp}/board/board2/"><i class="fas fa-folder"></i> <span>2번 게시판</span></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="main2">
			<div class="wrapper_1">
				<div class="wrapper2_1">
					<div class="context2">
						<div class="context2__title">
							<div class="title-context"></div>
							<div class="setting"></div>
						</div>
						<div class="context2__main" style="overflow: auto;">
							<!--이부분만 바뀜-->
							<div class="context2__insert">
								<div class="context2__insert-Btn">
									<i class="fas fa-pencil-alt" onclick="location.href = '${cp}/board/${path}/insert/'"></i>
									글쓰기
								</div>
							</div>
							<table>
								<tr class="table__firstRow">
									<th class="table__check"></th>
									<th class="table__bnum">번호</th>
									<th class="table__title">제목</th>
									<th class="table__writer">작성자</th>
									<th class="table__time">작성일</th>
									<th class="table__views">조회</th>
								</tr>
								<c:forEach var="vo" items="${list }">
									<tr>
										<td>
											<form action="method">
												<input type="checkbox" value="${vo.bnum}">
											</form>
										</td>
										<td>${vo.bnum }</td>
										<td><a href="${cp}/board/${path }/${vo.bnum}/">${vo.title }</a></td>
										<td>${vo.writer }</td>
										<td>
											<fmt:formatDate value="${vo.time }" pattern="yyyy.MM.dd" />
										</td>
										<td>${vo.views }</td>
									</tr>
								</c:forEach>
							</table>
							<div class="context2__menu">
								<div class="context2__delete-Btn">
									<i class="fas fa-eraser"></i>
									삭제
								</div>
								<div class="context2__insert-Btn" onclick="location.href = '${cp}/board/${path}/insert/'">
									<i class="fas fa-pencil-alt"></i>
									글쓰기
								</div>
							</div>
						</div>
						<!--이까지-->
						<div class="nav__home nav" onclick="location.href = '${cp}/'">
							홈</div>
						<div class="nav__profile nav"
							onclick="location.href = '${cp}/profile'">
							프로필</div>
						<div class="nav__diary nav"
							onclick="location.href = '${cp}/diary'">
							다이어리</div>
						<div class="nav__gallary nav"
							onclick="location.href = '${cp}/gallary'">
							사진첩</div>
						<div class="nav__board nav"
							style="z-index: 9; background-color: white; color: black; border-left: none;"
							onclick="location.href = '${cp}/board'">
							게시판</div>
						<div class="nav__guest nav"
							onclick="location.href = '${cp}/guest'">
							방명록</div>
						<div class="nav__setting nav"
							onclick="location.href = '${cp}/setting'">
							관리</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clip clip1"></div>
		<div class="clip clip2"></div>
		<div class="clip clip3"></div>
		<div class="clip clip4"></div>
	</main>
</body>
</html>

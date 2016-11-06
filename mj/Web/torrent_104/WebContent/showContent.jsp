<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<link href="./css/login_css.css" rel="stylesheet">
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
<script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function popupDelete() {
		window.open("deletePass_popup.jsp?id=${bvo.id}&&no=${bvo.no}", "",
				"resizeable=true, toolbar=no, width=600, height=450");
	}
</script>
<style type="text/css">
img {
	max-width: 700px;
}
body {
	padding-top: 100px;
	background-image: url("./img/img1.jpg");
}

tr, td{
	border-right: 1px solid black;
	text-align: center;
	padding: 5px;
	border-bottom: 1px solid black;
}


table {
	border: 2px solid black;
	width: 120%;
}

.showbtn, #pagebtn{
	background-color: #008080;
	color: white;
}


.hd {
	background-color: #73B2B4;
	color: white;
}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${loginMember != null}">
			<div>
				<nav class="navbar navbar-inverse navbar-fixed-top">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse" data-target="#navbar"
								aria-expanded="false" aria-controls="navbar">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="main.do">Kosta Torrent</a>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav navbar-right">
								<li><a href="logout.do">Logout</a></li>
								<li><a href="informView.jsp">회원정보 수정</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				alert("로그인을 하여 주십시오.");
				location.href = "index.jsp";
			</script>
			<div>
				<nav class="navbar navbar-inverse navbar-fixed-top" id="searchBar">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse" data-target="#navbar"
								aria-expanded="false" aria-controls="navbar">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">Project name</a>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav navbar-right">
								<li><a href="index.jsp">Login</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</c:otherwise>
	</c:choose>

	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<p class="lead" align="center">KOSTA 104</p>
				<div class="list-group">
					<a href="main.do?" class="list-group-item">전체보기</a> <a
						href="searchContent.do?pageno=1&&category=movie&&title="
						class="list-group-item">영화</a> <a
						href="searchContent.do?pageno=1&&category=drama&&title="
						class="list-group-item">드라마</a> <a
						href="searchContent.do?pageno=1&&category=comedy&&title="
						class="list-group-item">예능</a>
				</div>
				<div><a href="file/uTorrent.exe"><img alt="" src="./img/utorrent.jpg"></a></div>
			</div>
			<div class="col-md-8">
				<form action="updateRecommand.do" method="post">
					<input type="hidden" name="recommand" value="ok"> 
					<input type="hidden" name="no" value="${bvo.no }">
					<input type="hidden" name="category" value="${bvo.category}">
					<input type="hidden" name="pageno" value="${param.pageno}">
					<table align="center">
						<tr>
							<td class="hd">번호 </td>
							<td>${bvo.no}</td>
							<td class="hd">제목 </td>
							<td colspan="5">${bvo.title}</td>
						</tr>
						<tr>
							<td class="hd"> 카테고리</td>
							<td>${bvo.category}</td>
							<td class="hd">추천수</td>
							<td>${bvo.recommand}</td>
							<td class="hd">조회수</td>
							<td>${bvo.hits}</td>
							<td class="hd">작성자</td>
							<td>${bvo.writer}</td>
						</tr>
						<tr>
							<td class="hd">링크</td>
							<td colspan="5"><a href="/upload/${bvo.link}">${bvo.link}</a></td>
							<td class="hd">작성일시</td>
							<td>${bvo.time_posted}</td>
						</tr>
						<tr>
							<td colspan="8" style="width: 300px; height: 300px">${bvo.content}</td>
						</tr>
						<tr>
							<td colspan="8" style="border-top: 1px solid black;">
							<c:if test="${param.category!=null}">
								<input type="button" value="목록" class="btn showbtn" onclick="javascript:location.href='searchContent.do?pageno=${param.pageno}&category=${bvo.category}&&title='">&nbsp;&nbsp;
							</c:if>
							<c:if test="${param.category==null}">
								<input type="button" value="목록" class="btn showbtn" onclick="javascript:location.href='main.do'">&nbsp;&nbsp;
							</c:if>
								<c:if test="${bvo.id==loginMember.id}">
									<input type="button" value="삭제" class="btn showbtn" onclick="popupDelete()">
									&nbsp;&nbsp;<input type="button" value="수정" class="btn showbtn"onclick="javascript:location.href='showContent.do?no=${bvo.no}&update=1'">
									&nbsp;&nbsp;
								</c:if> 
								<input type="submit" value="추천" class="btn showbtn"></td>
						</tr>
					</table>
					<p></p>
					<div class="pagebtn" align="left">
					<c:if test="${preNo != null }">
					<input type="button"  class = "btn showbtn"value="이전 글" 
					onclick="javascript:location.href='pageInfo.do?no=${preNo}&&pageno=${param.pageno }'">
					</c:if>
					<c:if test="${nextNo!=null}">
					<input type="button" class = "btn showbtn"value="다음 글" 
						onclick="javascript:location.href='pageInfo.do?no=${nextNo}&&pageno=${param.pageno }'">
					</c:if>
					
					</div>
				</form>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>
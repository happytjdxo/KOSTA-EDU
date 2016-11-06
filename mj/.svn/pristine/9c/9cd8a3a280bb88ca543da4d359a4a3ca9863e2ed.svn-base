<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet"> 
<link href="./css/login_css.css" rel="stylesheet">
 <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="js/bootstrap.min.js"></script>
<title>Kosta Torrent</title>
<style type="text/css">
body {
	padding-top: 100px;
	background-image: url("./img/img1.jpg");
}

h1 {
	color: orange;
	padding: 30px;
	font-family: Segoe Print;
}

.input-group{
	margin: 50px;
}

 #boardTable {
	border-top: 1px solid;
	border-color: black;
	text-align: center;
	font-family: 휴먼모음T;
}

#loginButton {
	text-align: center;
	background-color: #008080;
}
 
tr, td, th{
	text-align: center;
	padding: 5px;
}
th{
	padding: 10px;
	border-bottom: 1px solid black;
	background-color: #73B2B4;
	color: white;
	text-align: center;
}

.writeBtn {
	background-color: #008080;
	color: white;
}

.listBtn {
	background-color: #008080;
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
			location.href="index.jsp";
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
							<a class="navbar-brand" href="main.do">Project name</a>
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
						<a href="main.do?" class="list-group-item">전체보기</a>
						<a href="searchContent.do?pageno=1&&category=movie&&title=" class="list-group-item">영화</a> 
						<a href="searchContent.do?pageno=1&&category=drama&&title=" class="list-group-item">드라마</a> 
						<a href="searchContent.do?pageno=1&&category=comedy&&title=" class="list-group-item">예능</a>
					</div>
					<div><a href="file/uTorrent.exe"><img alt="" src="./img/utorrent.jpg"></a></div>
			</div>
			<div class="col-md-8">
				<div style="width: 100%; text-align: center;">
					<form action="searchContent.do" class="form-inline">
						 <div class="form-group">
						<select name="category" class="form-control selector"  >
							<option value="movie">영화</option>
							<option value="drama">드라마</option>
							<option value="comedy">예능</option>
						</select>
						
						<input type="text" name="title" class="searchBar form-control" value="${param.title }">
						<input type="submit" value="검색" class="writeBtn btn">
						</div>
						<p>
					</form>
				</div>
				
				<c:if test="${category==null}">
						<c:import url="main_list.jsp"></c:import>
					</c:if>
					<c:if test="${category!=null}">
						<c:import url="showlist.jsp"></c:import>
					</c:if>
				</div>
			<div class="col-md-2"></div>
		</div>
	</div>

</body>
</html>
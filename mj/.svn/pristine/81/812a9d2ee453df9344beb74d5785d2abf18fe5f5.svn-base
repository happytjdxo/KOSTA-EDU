<%@page import="model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
 <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript" src="SE/js/HuskyEZCreator.js" charset="utf-8"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">

	function sub() {
	oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []); 

	}

	function up() {
		var file1 = document.getElementById("file1");
		var file2 = document.getElementById("file2");
		if(file2.style.display=='none'){
			file2.style.display='block';
			file1.style.display='none';
		}else{
			file1.style.display='block';
			file2.style.display='none';
		}
	}
</script>
<style type="text/css">
body {
	padding-top: 100px;
	background-image: url("./img/img1.jpg");
}

.updatebtn {
	background-color: #008080;
	color: white;
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
	border-bottom: 1px solid black;
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
				<p class="lead">Shop Name</p>
					<div class="list-group">
						<a href="main.do?" class="list-group-item">전체보기</a>
						<a href="searchContent.do?pageno=1&&category=movie&&title=" class="list-group-item">영화</a> 
						<a href="searchContent.do?pageno=1&&category=drama&&title=" class="list-group-item">드라마</a> 
						<a href="searchContent.do?pageno=1&&category=comedy&&title=" class="list-group-item">예능</a>
					</div>
					<div><a href="file/uTorrent.exe"><img alt="" src="./img/utorrent.jpg"></a></div>
			</div>
			<div class="col-md-10">

<form action="updateContent.do" method="post" enctype="multipart/form-data">
	<input type="hidden" name="no" value="${bvo.no}" > 
	<table class="form-inline" width="700px">
		<tr>
			<td>
				<div class="form-group">
			제목 : <input type="text" size="50" class="form-control" maxlength="100" name="title" required="required" value="${bvo.title}">
			&nbsp;&nbsp; 카테고리:
			<select name="category" class="form-control">
					<option value="default" >선택하세요</option>
			<c:choose>
				<c:when test="${bvo.category=='movie'}">
					<option value="movie" selected="selected">영화</option>
					<option value="drama">드라마</option>
					<option value="comedy" >예능</option>
				</c:when>
				<c:when test="${bvo.category=='drama'}">
					<option value="movie">영화</option>
					<option value="drama" selected="selected">드라마</option>
					<option value="comedy">예능</option>
				</c:when>
				<c:when test="${bvo.category=='comedy'}">
					<option value="movie">영화</option>
					<option value="drama">드라마</option>
					<option value="comedy"selected="selected">예능</option>
				</c:when>
				<c:otherwise>
					<option value="movie">영화</option>
					<option value="drama">드라마</option>
					<option value="comedy">예능</option>
				</c:otherwise>
			</c:choose>
			</select>
			</div>
			</td>
		</tr>
		
		<tr>
			<td style="text-align: center;"><div id="file1">
			링크 : ${bvo.link}&nbsp;
			<input type="button" value="upload수정" onclick="up()"></div>
				<div id="file2" style="display: none"><input type="file" name="link"> <input type="button" value="upload취소" onclick="up()"></div>
			</td>
		</tr>
		<tr>
		<td>
		<textarea style="min-width:680px; height: 350px;" id="content" required="required" name="content" >
		</textarea>
		<script type="text/javascript">
			var oEditors = [];
			nhn.husky.EZCreator.createInIFrame({
			oAppRef: oEditors,
			elPlaceHolder: "content",
			sSkinURI: "SE/SmartEditor2Skin.html",
			htParams : {
				bUseToolbar : true,				// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseVerticalResizer : true,		// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseModeChanger : true,			// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
				//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
				fOnBeforeUnload : function(){
				//alert("완료!");
			}
		}, //boolean
		fOnAppLoad : function(){
			//예제 코드
			oEditors.getById["content"].exec("PASTE_HTML", ['${bvo.content}']);
		},
		fCreator: "createSEditor2"});
		</script>
	</td>
	</tr>
	<tr>
	<td align="center">
	<input type="submit" value="수정" class="btn updatebtn" onclick="sub()">
	<input type="button" value="취소" class="btn updatebtn" onclick="javascript:history.back()">
	<input type="button" value="다시쓰기"class="btn updatebtn" onclick="javascript:location.reload()">
	</td>
	</tr>
	</table>
	</form>
			</div>
		</div>
	</div>
	
</body>
</html>
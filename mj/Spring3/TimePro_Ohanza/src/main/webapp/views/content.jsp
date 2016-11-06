<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.2.js"></script>
<link href="/ohanza/css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<link href="/ohanza/css/main/content.css" rel="stylesheet" type="text/css" />
<link href="/ohanza/css/common.css" rel="stylesheet" type="text/css" />
<link href="/ohanza/css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" charset="utf-8" src="/ohanza/js/jquery.leanModal.min.js"></script>
<script type="text/javascript" src="/ohanza/js/main.js"></script>

<script>

	$(function() {
		$('.toggler').hide();
		var flag = true;

		$('#commentBtn').click(function() {
			if (flag == true) {
				$('.toggler').show();
				flag = false;
			}

			else if (flag == false) {
				$('.toggler').hide();
				flag = true;
			}
		});
	});
	
</script>
<style type="text/css">
body{
	height: 650px;
}
div #content-body {
	text-align: center;
}

div #content-main {
	margin-top: 150px;
	background-color: white;
}

.col-md-2 {
	text-align: right;
}

div #icon{
  margin-bottom : 10px;
  text-align: right;
  }
#loginmodal{border:2px solid #808040; width: 260px; height: 240px}

</style>
</head>
<body style="background-color: #a6ce39;">
<div id="mainMenu"><c:import url="header.jsp"></c:import></div>
<div id="loginmodal" style="display: none;">
		<h2 align="center">LOGIN</h2>
		<div class="p_c_text" align="center">오한자에 오신 것을 환영합니다.</div>
		<div class="login_line">
			<div class="box_in">
				<input type="text" name="id" id="id" size="23"> 
				<input type="password" name="pw" id="pw" size="23">
			</div>
			<span class="btn_login"><a href="">LOGIN</a></span>
		</div>
		<div class="find_join">
			<a href="#"  onclick="searchId()">아이디 / 비밀번호 찾기</a> | <a href="agreement.jsp">회원가입</a>
		</div>
	</div>

	<div class="row">
		<div class="col-6 col-sm-4 col-lg-2"></div>
		<div id="content-main" class="col-6 col-sm-4 col-lg-8">
			<div id="content-body">
				<h4 align="left">${boardDTO.title }</h4>
				<h5 align="right">${boardDTO.writeDate }</h5>
				<h5 align="right">${boardDTO.hits }</h5>
				<img alt="" src="images/line.png" width="100%">
				<div>
<pre>
${boardDTO.content }
</pre>
<img alt="" src="/ohanza/views/images/line.png" width="100%">
				</div>
			</div>
			<div style="margin-bottom: 10px;">
				<a href="#" class="btn btn-xs btn-default" id="commentBtn"> 
				<span class="glyphicon glyphicon-chevron-down"></span></a>댓글 
				<a href="#" class="btn btn-xs btn-success">
				<span class="glyphicon glyphicon-thumbs-up"></span></a>추천수
				<a href="#" class="btn btn-xs btn-danger">
				<span class="glyphicon glyphicon-thumbs-down"></span></a>비추천수
			</div>
			<div class="toggler">
				<div class="comment">
					<div class="col-md-10">
						<p><b>닉네임</b> 작성일-작성시간</p>
						<p>댓글내용
					</div>
					<div class="col-md-2">
						<a href="#" class="btn btn-xs btn-success">
						<span class="glyphicon glyphicon-thumbs-up"></span></a>1111
						<a href="#" class="btn btn-xs btn-danger">
						<span class="glyphicon glyphicon-thumbs-down"></span></a>1111
					</div>
				</div>
			</div>
			<div class="row">
<div class="col-md-12" id="icon">
<a href="/ohanza/views/subpage01.jsp">목록</a> | ▲<a>윗글</a> | ▼<a>아랫글</a>
</div>
</div>
		</div>
		<div class="col-6 col-sm-4 col-lg-2"></div>
	</div>
</body>
</html>
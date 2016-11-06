<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>Boostrap Validator</title>
 <style type="text/css">
		#txtArea{
			height: 300px;
			border-radius: 0px;
		}
		
		#fileWindow{
			width: 100%;
		}
		
		#contactForm{
			margin-top: -10%;
		}
		#loginmodal{border:2px solid #808040; width: 260px; height: 240px}
	</style>
	
</head>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/main/main.css" rel="stylesheet" type="text/css" />
<link href="../css/common.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/jquery.leanModal.min.js"></script>
<body style="background-color: #a6ce39;">
<div id="mainMenu"><c:import url="header.jsp"></c:import></div>
앞에서 받아온 board 값 : ${param.board }
<form id="contactForm" action="../board.do" method="post" class="form-horizontal" style="margin-left: 5%;">
<input type="hidden" name="command" value="writeBoard">
<input type="hidden" name="board" value="${param.board}">
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
<div class="form-group" style="margin: 10%;">
    <div class="form-group">
        <label class="col-md-3 control-label">글제목</label>
        <div class="col-md-6">
            <input type="text" class="form-control" name="title" />
        </div>
    </div>
    
    
    <c:choose>
    <c:when test="${param.board == typeboard}">
    <div class="form-group">
        <label class="col-md-3 control-label">카테고리</label>
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
           
        <input type="radio" name="house_category" id="category1" value="소주">
           소주
      </span>
        </div>
    </div>
    </c:when>
    
     <c:when test="${param.board == houseboard}">
    <div class="form-group">
        <label class="col-md-3 control-label">카테고리</label>
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
           
        <input type="radio" name="house_category" id="category1" value="수정구">
           수정구
      </span>
        </div>
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
        <input type="radio" name="house_category" id="category2" value="중원구">중원구
      </span>
        </div>
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
        <input type="radio" name="house_category" id="category3" value="분당구">분당구
      </span>
        </div>
    </div>
    </c:when>
    
     <c:when test="${param.board == tipboard}">
    <div class="form-group">
        <label class="col-md-3 control-label">카테고리</label>
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
           
        <input type="radio" name="house_category" id="category1" value="게임 팁">
           게임 팁
      </span>
        </div>
    </div>
    </c:when>
    
    <c:otherwise>
    	<div class="form-group">
        <label class="col-md-3 control-label">카테고리</label>
        
        
        <div class="col-md-2">
            <span class="input-group-addon" style="background-color: white;">
        <input type="radio" name="house_category" id="category1" value="잡담">잡담
      </span>
        </div>
    </div>
    </c:otherwise>
    </c:choose>
    <div class="form-group">
        <label class="col-md-3 control-label">사진</label>
        <div class="col-md-6">
            <input type="file" id="fileWindow" name="originalFileName" />
        </div>
    </div>

    <div class="form-group">
        <label class="col-md-3 control-label">글내용</label>
        <div class="col-md-6">
            <textarea class="form-control" id="txtArea" name="content" rows="5"></textarea>
        </div>
    </div>
    <!-- #messages is where the messages are placed inside -->
    <div class="form-group">
        <div class="col-md-9 col-md-offset-3">
            <div id="messages"></div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-9 col-md-offset-3">
            <button type="submit" class="btn btn-default">글쓰기</button>
        </div>
    </div>
</div>
</form>
</body>
</html>
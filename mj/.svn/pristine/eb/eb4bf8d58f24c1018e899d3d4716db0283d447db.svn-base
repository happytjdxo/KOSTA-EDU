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
<script type="text/javascript">
function content_submit(){
   var f=document.write_form;

   f.submit();
}
</script>
<body style="background-color: #a6ce39;">
<div id="mainMenu"><c:import url="header.jsp"></c:import></div>
<form action="../board.do" id="contactForm" name="write_form" method="post" class="form-horizontal" style="margin-left: 5%;">
<input type="hidden" name="command" value="writeBoard">
<div id="loginmodal" style="display: none;">
      <h2 align="center">LOGIN</h2>
      <div class="p_c_text" align="center">오한자에 오신 것을 환영합니다.</div>
      <div class="login_line">
         <div class="box_in">
            <input type="text" name="id" id="id" size="23"> 
            <input type="password" name="password" id="pw" size="23">
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
            <input type="text" class="form-control" name="title" required="required"/>
        </div>
    </div>
    <div class="form-group">
        <label class="col-md-3 control-label">사진</label>
        <div class="col-md-6">
            <input type="file" id="fileWindow" name="email" />
        </div>
    </div>

    <div class="form-group">
        <label class="col-md-3 control-label">글내용</label>
        <div class="col-md-6">
            <textarea class="form-control" id="txtArea" name="content" rows="5" required="required"></textarea>
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
           <button type="button" class="btn btn-default" onclick="content_submit()">글쓰기</button>
        </div>
    </div>
</div>
</form>
</body>
</html>
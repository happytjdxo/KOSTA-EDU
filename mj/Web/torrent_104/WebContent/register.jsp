<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Kosta Torrent</title>
<script type="text/javascript" src="httpRequest.js"></script>
<script type="text/javascript">
var checkFirst = false;
var lastKeyword = '';
var loopSendKeyword = false;

function checkId() {
 if (checkFirst == false) {
  //0.5초 후에 sendKeyword()함수 실행
  setTimeout("sendId();", 500);
  loopSendKeyword = true;
 }
 checkFirst = true;
}

function checkPwd(){
 var form = document.registerForm;
 var password = form.password.value;
 var repassword = form.repassword.value;
 if(password!=repassword){
  document.getElementById('checkPwd').style.color = "red";
  document.getElementById('checkPwd').innerHTML = "동일한 암호를 입력하세요."; 
 }else{
  document.getElementById('checkPwd').style.color = "black";
  document.getElementById('checkPwd').innerHTML = "암호가 확인 되었습니다."; 
  
 }
 
}


function sendId() {
 if (loopSendKeyword == false) return;
 
 var keyword = document.registerForm.id.value;
 if (keyword == '') {
  lastKeyword = '';
  document.getElementById('checkMsg').style.color = "black";
  document.getElementById('checkMsg').innerHTML = "아이디를 입력하세요.";
 } else if (keyword != lastKeyword) {
  lastKeyword = keyword;
  
  if (keyword != '') {
   var params = "id="+encodeURIComponent(keyword);
   sendRequest("index.jsp", params, displayResult, 'POST');
  } else {
  }
 }
 setTimeout("sendId();", 500);
}


function displayResult() {
 if (httpRequest.readyState == 4) {
  if (httpRequest.status == 200) {
   var resultText = httpRequest.responseText;
   var listView = document.getElementById('checkMsg');
   if(resultText==0){
    listView.innerHTML = "사용 할 수 있는 ID 입니다";
    listView.style.color = "blue";
   }else{
    listView.innerHTML = "이미 등록된 ID 입니다";
    listView.style.color = "red";
   }
  } else {
   alert("에러 발생: "+httpRequest.status);
  }
 }
}
</script>
<style type="text/css">
h1{
		color: orange;
		padding: 30px;
		font-family: Segoe Print;
	}
	#loginTable{
	    border-top: 1px solid red;	   
		text-align: center;
		border-color: red;
		font-family: 휴먼모음T;
	}
	
	#loginButton{
		border-top: 1px dotted pink;
		 border-bottom: 1px solid red;
		 text-align: center;
	}
	tr, td{
		padding: 17px;
	}
	.registerbtn{
		background-color: #440077;
		color: white;
	}
	.resetBtn{
		background-color: #ff6677;
		color: white;
	}
</style>
</head>
<body background="./img/img1.jpg">
<h1 align="center">KostaTorrent Register</h1><p></p>

<form action="register.do" method="post" name="registerForm">
<!-- <input type="hidden" name="command" value="register"> -->
<table align="center" id="registerTable" width="400">
	<tr>
		<td>ID  </td>
		<td><input type="text" name="id"  placeholder="id를 입력하세요" required="required" onkeyup="checkId()" />
				<div id = "checkMsg">아이디를 입력하세요.</div>
		</td>
	</tr>
	<tr>
		<td>Password  </td>
		<td><input type="password" name="password" placeholder="password를 입력하세요" required="required">
		</td>
	</tr>
	<tr>
		<td>RePassword  </td>
		<td><input type="password" name="repassword"  placeholder="한번 더 입력하세요" required="required" onkeyup="checkPwd()">
				<div id = "checkPwd">동일한 패스워드를 입력하세요..</div>
		</td>
	</tr>
	<tr>
		<td>이름 </td>
		<td><input type="text" name="name"  placeholder="name를 입력하세요" required="required"></td>
	</tr>
	<tr>
		<td>닉네임 </td>
		<td><input type="text" name="nickname"  placeholder="nickname를 입력하세요" required="required"></td>
	</tr>
	<tr>
		<td>주민번호 </td>
		<td><input type="text" name="ssn"  placeholder="ssn를 입력하세요" required="required"></td>
	</tr>
</table>
<table align="center" id="loginButton" width="400">
	<tr>
		<td colspan="2" >
			<input type="submit" value="회원가입" class="registerbtn btn" >&nbsp;
			<input type="button" value="취소" class="resetBtn btn" onclick="javascript:location.href='index.jsp'">
		</td>
	</tr>
</table>
</form>
</body>
</html>
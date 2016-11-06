<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Delete Board Form</title>
<style type="text/css">
h1{
		color: white;
		padding: 30px;
		font-family: Segoe Print;
	}
	#searchPassTable{
	    border-top: 1px solid red;	   
		text-align: center;
		border-color: red;
		font-family: 휴먼모음T;
	}
	
	#searchButton{
		border-top: 1px dotted pink;
		 border-bottom: 1px solid red;
		 text-align: center;
	}
	tr, td{
		padding: 17px;
	}
	.findIdbtn{
		background-color: #440077;
		color: white;
	}
	.resetbtn{
		background-color: #ff6677;
		color: white;
	}
	.registerbtn{
		background-color: #440077;
		color: white;
	}
	
</style>

</head>
<body background="./img/flower.jpg">
<h1 align = "center">Delete Board Form</h1><p></p>
<form action = "deletePass.do" method = "post" name = "loginForm">
<input type = "hidden" name = "id" value = "${param.id}">
<input type = "hidden" name = "no" value = "${param.no}">
<table align="center">
	<tr>
		<td>Password</td>
	 	<td><input type = "text" name = "password" placeholder = "password를 입력하세요." required = "required"></td>
	</tr>
	<tr align="center">
		<td colspan = "2">
			<input type = "submit" value = "삭제완료" class = "registerbtn btn">&nbsp;
			<input type = "button" value = "취소" class = "resetbtn btn" onclick ="javascript:self.close()">
	</table>
</form>
</body>
</html>
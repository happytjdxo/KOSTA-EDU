<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Search Id Form</title>
<style type="text/css">
	body{
		background-image: url("./img/flower.jpg");	
	}
h1{
		color: white;
		padding: 30px;
		font-family: Segoe Print;
	}
	#searchIdTable{
		color: white;
	    border-top: 1px solid white;	   
		text-align: center;
		font-family: 휴먼모음T;
	}
	
	#searchIdButton{
		border-top: 1px dotted pink;
		 border-bottom: 1px solid white;
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
	

	.input{
		color: black;
	}
</style>
</head>
<body>
<h1 align="center">ID Search Form</h1><p></p>
<form action="searchId.do" method="post" name="loginForm">

<table align="center" id="searchIdTable" width="400">
	<tr>
		<td>이 름 </td>
		<td><input type="text" name="name" class="input" placeholder="이름" required="required"></td>
	</tr>
	<tr>
		<td>주민 번호</td>
		<td><input type="text" name="ssn" class="input"  placeholder="-과 함께 입력해주세요." required="required"></td>
	</tr>
</table>
<table align="center" id="searchIdButton" width="400">
	<tr>
		<td colspan="2" >
			<input type="submit" value="검색" class="findIdbtn btn">&nbsp;
			<input type="button" value="취소" class="resetbtn btn" onclick="javascript:self.close()">
		</td>
	</tr>
</table>
</form>
</body>
</html>
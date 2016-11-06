<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>MemberInfo Update</title>
<style type="text/css">
	h1{
		color: #224499;'
		padding: 30px;
		font-family: 휴먼모음T;
	}
	#updateTable{
	    border-top: 2px solid orange;	   
		text-align: center;
		border-color: orange;
	}
	
	#updateButton{
		border-top: 1px dotted pink;
		 border-bottom: 1px solid red;
		 text-align: center;
	}
	tr, td{
		padding: 17px;
	}
	.updatebtn{
		background-color: #440077;
		color: white;
	}
	.resetbtn{
		background-color: #ff6677;
		color: white;
	}
	

</style>
</head>
<body>
<h1 align="center">비밀번호를 입력하세요</h1>
<form action="UpdateMemberInfo.jsp" method="post" name="check">

<table align="center" id="updateTable" width="400">
	<tr>
		<td>ID  </td>
		<td><input type="text" name="id"  placeholder="id를 입력하세요" required="required"></td>
	</tr>
	<tr>
		<td>Password  </td>
		<td><input type="password" name="password" placeholder="password를 입력하세요" required="required"></td>
	</tr>
	<tr>
		<td>RePassword  </td>
		<td><input type="password" name="repassword"  placeholder="한번 더 입력하세요" required="required"></td>
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
<table align="center" id="updateButton" width="400">
	<tr>
		<td colspan="2" >
			<input type="button" value="회원정보 수정" class="updatebtn btn">&nbsp;
			<input type="button" value="취소" class="resetBtn btn">
		</td>
	</tr>
</table>
</form>
</body>
</html>
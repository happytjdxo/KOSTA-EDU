<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Update Information View</title>
<script type="text/javascript">
	function back() {
		location.href="main.do";
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
		font-family: 한컴 솔잎 M;
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
<body background="./img/WPP_blog_0918_wallpaper.jpg">
<h1 align="center">Member Information Change</h1><p></p>

<form action="updateMember.do" method="post" name="registerForm">
<table align="center" id="registerTable" width="400">
	<tr><!-- 수정불가 -->
		<td>ID  </td>
		<td><input type="text" name="id" value = "${loginMember.id}" readonly="readonly"></td>
	</tr>
	<tr>
		<td>Password  </td>
		<td><input type="password" name="password" placeholder="password를 입력하세요" required="required"></td>
	</tr>
	<tr><!-- 수정불가 -->
		<td>이름 </td>
		<td><input type="text" name="name" value = "${loginMember.name}" readonly="readonly"></td>
	</tr>
	<tr>
		<td>닉네임 </td>
		<td><input type="text" name="nickname"  value = "${loginMember.nickname}" placeholder="nickname를 입력하세요" required="required"></td>
	</tr>
</table>
<table align="center" id="loginButton" width="400">
	<tr>
		<td colspan="2" >
			<input type="submit" value="수정완료" class="registerbtn btn" >&nbsp;
			<input type="button" value="취소" class="resetBtn btn" onclick="back()">
		</td>
	</tr>
</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Search ID Form</title>
<style type="text/css">
	h1{
		color: white;
		padding: 30px;
		font-family: Segoe Print;
	}
	#searchTable{
		border-bottom: 1px solid white;
		border-top: 1px solid white;
		text-align: center;
		padding: 20px;
		font-family: 휴먼모음T;
	}
	tr, td{
		padding: 20px;
	}
	body{
		background-image: url("./img/flower.jpg");
	}
	
	.input{
		color: black;
	}
	.homehtn{
	background-color: #440077;
	color: white;
}
</style>
</head>
<body>
<h1 align="center">ID Search Result</h1><p></p>
<table id="searchTable" width="400" style="text-align: center;" align="center">
<c:choose>
	<c:when test="${rName !=null }">
		<tr>
			<td><h2>당신의 ID는 ${requestScope.rName} 입니다.</h2>
		</td>
	</tr>
	</c:when>
	<c:otherwise>
		<tr>
			<td>입력한 정보에 해당하는 ID가 없습니다.</td>
		</tr>
	</c:otherwise>
</c:choose>	
	<tr>
		<td><input type="button" value="Home"  class="btn homehtn"onclick="javascript:self.close()"></td>
	</tr>
</table>
</body>
</html>
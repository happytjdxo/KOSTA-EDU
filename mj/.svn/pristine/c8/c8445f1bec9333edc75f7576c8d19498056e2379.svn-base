<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
    #searchTable{
       border-top: 1px solid white;
       border-bottom: 1px solid white;
       text-align: center;
    }
    h1{
		color: white;
		padding: 30px;
		font-family: Segoe Print;
		text-align: center;
	}
	tr,td{
	    padding: 30px;
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
<h1>Pass Search  Result</h1>
<table id="searchTable" width="400" style="text-align: center;" align="center">
<c:choose>
   <c:when test="${id  != null}">
      <tr>
         <td><h2>${id } 회원님의 비밀번호는<p> ${rpass} 입니다.</p></h2> 
      </td>
   </tr>
   </c:when>
   <c:otherwise>
      <tr>
         <td>${error }</td>
      </tr>
   </c:otherwise>
</c:choose>   
   <tr>
      <td><input type="button" class="btn homehtn" value="Home"  onclick="javascript:self.close()"></td>
   </tr>
</table>
</body>
</html>

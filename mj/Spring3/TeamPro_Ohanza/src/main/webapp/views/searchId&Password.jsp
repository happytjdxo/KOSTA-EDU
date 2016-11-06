<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>jsp</title>
  <link href="css/bootstrap.min.css" rel="stylesheet"> 
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/start/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style type="text/css">
   #ul{
      background: white;
      border-color: white;
   }
   
     #tabs{
       width: 300px;
       height: 150px;
       border-color: gray;
            }
     #tabs-1,#tabs-2{
        text-align: center;
     }
     
     #id{
       text-align: left;
     }
     
     #searchId{
       background-color: red;
     }
     
  </style>
  <script>
  $(function() {
    $( "#tabs" ).tabs();
  });
  </script>
</head>
<body>
<form action="../member.do" id="searchForm" name="searchForm" method="post">
<input type="hidden" name="command" value="findPassword">
<div id="tabs">
  <ul id="ul">
    <li id="searchId"><a href="#tabs-1">아이디 찾기</a></li>
    <li><a href="#tabs-2">비밀번호 찾기</a></li>
  </ul>
  <div id="tabs-1">
    <p><p>
       주민번호<input type="text" id="idSearch" size="10%">
       <a href="#" class="btn btn-success"><span class="glyphicon glyphicon-search"></span>찾기</a>
  </div>
  <div id="tabs-2">
       <c:choose>
       <c:when test="${password==null}">
       <table>
         <tr>
           <td>아이디</td><td><input type="text" name="id" size="10%">&nbsp;</td>
           <!-- <td rowspan="2"><a href="" class="btn btn-success"><span class="glyphicon glyphicon-search"></span>찾기</a></td> -->
            <td rowspan="2"><input type="submit" class="btn btn-success" value="찾기"><span class="glyphicon glyphicon-search"></span>
         </tr>
         <tr>
           <td>주민번호</td><td><input type="text" name="ssn" size="10%">&nbsp;</td>
         </tr>
       </table>
       </c:when>
       <c:otherwise>
           ${password}
       </c:otherwise>
       </c:choose>
  </div>
</div>
</form>
</body>
</html>
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
.listbtn{
	text-align: right;
	background-color: #008080;
	color: white;
}

 table th, tr, td{
 	text-align: center;
 	padding: 5px;
 }
</style>
</head>
<body>
<div class="row">
			<div class="col-md-11">

				<form action="write.jsp" method="get" name="board">
					<table align="center" id="boardTable" width="850" class="table-hover" >
						<tr>
							<th width="10%">글번호</th>
							<th width="10%">카테고리</th>
							<th width="40%">제 목</th>
							<th width="10%">작성자</th>
							<th width="10%">작성일자</th>
							<th width="10%">조회수</th>
							<th width="10%">추천수</th>
						</tr>
						<c:forEach var="content" items="${contentList}" begin="${recordStart }" end="${recordEnd }">
						<tr >
							<td>${content.no}</td>
							<td>[${content.category}]</td>
							<td><a href="pageInfo.do?no=${content.no}&&pageno=${pageno}">${content.title}</a>
							<c:if test="${content.time_posted.length()==5}">
							&nbsp;<font color="red" size="2">new</font>
							</c:if>
							</td>
							<td>${content.writer}</td>
							<td>${content.time_posted}</td>
							<td>${content.hits}</td>
							<td>${content.recommand}</td>
						</tr>
						</c:forEach>
					</table>
					<table  align="center" id="boardTable" width="850" >
					<tr>
							<td style="border-top:1px solid black; text-align: right;" colspan="7" >
							<input type="submit" value="글쓰기" class="btn listbtn" ></td>
							
						</tr>
					</table>
				</form>
				
 					<nav style="text-align: center;">
						  <ul class="pagination">
						    <li>
						      <a href="main.do?pageno=1" aria-label="Previous">
						        <span aria-hidden="true">&laquo;</span>
						      </a>
						    </li>
						    <li>
						      <a href="main.do?pageno=${(pageno<2?1:pageno-1)}" aria-label="Previous">
						        <span aria-hidden="true">&lt;</span>
						      </a>
						    </li>
						    <c:forEach begin="${page_sno}" end="${page_eno}" varStatus="pn">
						    	<li><a href="main.do?pageno=${page_sno+pn.count-1}">${page_sno+pn.count-1}</a></li>
						    </c:forEach>
						    <li>
						      <a href="main.do?pageno=${(pageno>=pageEnd?pageEnd:pageno+1)}" aria-label="Next">
						        <span aria-hidden="true">&gt;</span>
						      </a>
						    </li>
						    <li>
						      <a href="main.do?pageno=${pageEnd}" aria-label="Next">
						        <span aria-hidden="true">&raquo;</span>
						      </a>
						    </li>
						  </ul>
					</nav>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</body>
</html>
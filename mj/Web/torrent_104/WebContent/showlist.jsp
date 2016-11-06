<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="./css/bootstrap.min.css" rel="stylesheet"> 
<link href="./css/login_css.css" rel="stylesheet">
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="js/bootstrap.min.js"></script>
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

				<form action="write.jsp" method="post" name="board">
				<input type="hidden" name="searchContentCheck" value="Y">

					<table align="center" id="boardTable" width="850" class="table-hover">
						<tr>
							<th width="10%">글번호</th>
							<th width="10%">카테고리</th>
							<th width="40%">제 목</th>
							<th width="10%">작성자</th>
							<th width="10%">작성일자</th>
							<th width="10%">조회수</th>
							<th width="10%">추천수</th>
						</tr>
						<c:forEach var="content" items="${contentList}" begin="${recordStart}" end="${recordEnd }">
						<tr>
							<td>${content.no}</td>
							<td>[${content.category}]</td>
							<td><a href="pageInfo.do?no=${content.no}&&category=${content.category}&&pageno=${pageno}">${content.title}</a>
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
						<tr>
					</table>
					<table  align="center" id="boardTable" width="850" >
					<tr>
							<td style="border-bottom:0px solid white;  text-align: right;" colspan="7">
							<input type="submit" value="글쓰기" class="btn listbtn"></td>
						</tr>
					</table>
				
				
 					<nav style="text-align: center;">
						  <ul class="pagination">
						    <li>
						      <a href="searchContent.do?pageno=1&&category=${category}&&title=${title}" aria-label="Previous">
						        <span aria-hidden="true">&laquo;</span>
						      </a>
						    </li>
						    <li>
						      <a href="searchContent.do?pageno=${(pageno<2?1:pageno-1)}&&category=${category}&&title=${title}" aria-label="Previous">
						        <span aria-hidden="true">&lt;</span>
						      </a>
						    </li>
						    <c:forEach begin="${page_sno}" end="${page_eno}" varStatus="pn">
						    	<li><a href="searchContent.do?pageno=${page_sno+pn.count-1}&&category=${category}&&title=${title}">${page_sno+pn.count-1}</a></li>
						    </c:forEach>
						    <li>
						      <a href="searchContent.do?pageno=${(pageno>=pageEnd?pageEnd:pageno+1)}&&category=${category}&&title=${title}" aria-label="Next">
						        <span aria-hidden="true">&gt;</span>
						      </a>
						    </li>
						    <li>
						      <a href="searchContent.do?pageno=${pageEnd}&&category=${category}&&title=${title}" aria-label="Next">
						        <span aria-hidden="true">&raquo;</span>
						      </a>
						    </li>
						  </ul>
					</nav>
					</form>
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
</body>
</html>
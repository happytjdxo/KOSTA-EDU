<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<b> ${param.userName } </b> 님의 정보를 출력합니다. <br>
<ul>
	<li>${param.userId }</li><!-- id -->
	<li>${param.userAddress }</li><!-- address -->
</ul>
</body>
</html>
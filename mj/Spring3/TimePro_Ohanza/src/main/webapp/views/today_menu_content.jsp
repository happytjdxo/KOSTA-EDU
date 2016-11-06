<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>today_menu 결과 페이지 입니다.</b><br>
	<h3>메인 페이지를 눌렀을 때, 연결되는 페이지로,</h3>
	<h3>날씨 API에서 받아온 날씨와, todayDTO의 weather가 동일하면 띄워주게 됨니다.</h3><br><br>
	
	${today.content}

	
</body>
</html>
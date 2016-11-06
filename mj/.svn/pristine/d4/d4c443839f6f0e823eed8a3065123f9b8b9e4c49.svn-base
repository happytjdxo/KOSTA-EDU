<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
	
	function startRequest(id) {
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange=callback;
		id = encodeURIComponent(id);
		xhr.open("get", "DispatcherServlet?command=select&&id=" + id);
		xhr.send(null);
	}
	function callback() {
		if(xhr.readyState==4){
			if(xhr.status==200){
				document.getElementById("resultScope").innerHTML = 
					"<font color='green' size=5>"+ xhr.responseText+"</font>";
			}
		}
	}
</script>
</head>
<body>
<form name="listInfo">
<h2 align="center"><b>ID LIST INFORMATION....</h2><p>
list에서 특정아이디를 선택해주세요...</b><p>


<select name="select" onchange="startRequest(this.value)">
	<c:forEach var="list" items="${list}">
		<option value="${list.id}"> ${list.id} </option>
	</c:forEach>
</select>
</form>
<span id="resultScope"></span>

</body>
</html>
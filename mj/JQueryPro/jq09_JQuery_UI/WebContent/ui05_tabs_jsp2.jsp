<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>

<html lang="en">

<head>
  <meta charset="utf-8">
  <title>jQuery UI Tabs - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/sunny/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#tabs" ).tabs();
  });
  </script>
</head>
<body>
	<div id="tabs">
		<ul>
			<li><a href="tabpage/content1.jsp">Education Article</a></li>
			<li><a href="tabpage/content2.jsp">Marketing Article</a></li>
			<li><a href="tabpage/content3.jsp">Well Being Article</a></li>
		</ul>
	</div>
</body>
</html>
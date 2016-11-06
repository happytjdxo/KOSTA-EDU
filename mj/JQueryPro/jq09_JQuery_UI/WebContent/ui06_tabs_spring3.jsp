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
			<li><a href="test.do?command=breakfast">Breakfast Menu</a></li>
			<li><a href="test.do?command=lunch">Lunch Menu</a></li>
			<li><a href="test.do?command=dinner">Dinner Being Menu</a></li>
		</ul>
	</div>
</body>
</html>
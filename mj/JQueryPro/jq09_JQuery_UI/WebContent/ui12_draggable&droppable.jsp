<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>

<html lang="en">
<head>

<meta charset="utf-8">
<title>jQuery UI Droppable - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/start/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

<style>
	#clothing{ float: left; width: 500px; margin-left: 3em }
	#cart{ width: 450px; float: left; margin-top: 1em }
	#cart{ margin: 0px; padding: 1em 0em 1em 3em }
</style>

<script>
	$(function() {
	//어코디언을 적용..
	$('#catalog').accordion();
	
	//draggable을 적용..
	$('#catalog li').draggable({
		helper: 'clone', //복사본을 만들어서 드래깅 한다.
		appendTo: '#cart'
	}); //draggable
	
	// droppable을 적용
	$('#cart ol').droppable({
		drop:function(event, ui){
			//.palceholder 부분을 먼저 삭제해야 한다.
			$(this).find(".palceholder").remove();
			var uidrag = ui.draggable.text();
			
			$(this).append("<li>" + uidrag + "</li>");
		}
	}); //droppable
	});
</script>
</head>
<body>
	<div id="clothing">
		<h2 class="ui-widget-header">카탈로그</h2>
		<!-- 드래그 되어지는 대상들 -->
		<div id="catalog">
			<h2><a href="#">상의류</a></h2>
			<div>
				<ul>
					<li>블라우스</li>
					<li>정장 티셔츠</li>
					<li>발팔티</li>
					<li>목폴라</li>
					<li>후드티</li>
				</ul>
			</div>
			<h2><a href="#">하의류</a></h2>
			<div>
				<ul>
					<li>정장바지</li>
					<li>반바지</li>
					<li>청바지</li>
					<li>츄리닝</li>
				</ul>
			</div>
			<h2><a href="#">악세서리</a></h2>
			<div>
				<ul>
					<li>장지갑</li>
					<li>반지갑</li>
					<li>목걸이</li>
					<li>반지</li>
				</ul>
			</div>
		</div><!-- catalog -->
	</div>
	
	<!-- drop할 영역을 다시 지정하겠다. 이곳으로 draggable되어지면 된다. -->
	<div id = "cart">
		<h2 class = "ui-widget-header">장바구니</h2>
		<div class = "ui-widget-content">
			<ol>
				<li class = "palceholder">Dropping Cart!!</li>
			</ol>
		</div>
	</div>
</body>
</html>
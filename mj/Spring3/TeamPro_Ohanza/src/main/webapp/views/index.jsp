<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8" http-equiv="X-UA-Compatible" content="IE=11" />
<title>Insert title here</title>
<style type="text/css">
#loginmodal{border:2px solid #808040; width: 260px; height: 240px}
</style>

<link href="../css/main/main.css" rel="stylesheet" type="text/css" />
<link href="../css/common.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />
<script	src="http://cdnjs.cloudflare.com/ajax/libs/gsap/1.16.1/TweenMax.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script type="text/javascript" src="../js/mainGallery.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/jquery.leanModal.min.js"></script>
<script type="text/javascript">
	function login(){
			document.login.submit();
	}
</script>
<script type="text/javascript">
	$(function() {
		
		for(var i =1 ; i<4 ; i++ )
		{
			$('#icon'+i+' >img').css('cursor', 'pointer');
			$('#icon'+i+' >img').hover(iconOver,iconOut);
			$('#icon'+i+' >img').click(iconClick);
		}
		
		function iconOver()
		{
			var overSrc ="";
			if($(this).parent().attr('id')=='icon1')
			{
				overSrc ="../img/main/main_icon/hit_alcohol_over_btn.png";
			}else if($(this).parent().attr('id')=='icon2')
			{
				overSrc ="../img/main/main_icon/hot_content_over_btn.png";
			}else if($(this).parent().attr('id')=='icon3')
			{
				overSrc ="../img/main/main_icon/today_menu_over_btn.png";
			}
			 $(this).attr('src',overSrc); 
			
			//alert( $(this).attr('src'))
			//$(this).html('<img src="../img/main/main_icon/hit_alcohol_over_btn.png">');
		}
		function iconOut()
		{
			var outSrc ="";
			if($(this).parent().attr('id')=='icon1')
			{
				outSrc ="../img/main/main_icon/hit_alcohol_btn.png";
			}else if($(this).parent().attr('id')=='icon2')
			{
				outSrc ="../img/main/main_icon/hot_content_btn.png";
			}else if($(this).parent().attr('id')=='icon3')
			{
				outSrc ="../img/main/main_icon/today_menu_btn.png";
			}
			 $(this).attr('src',outSrc); 
			
		}
		
		function iconClick()
		{
			var url ="";
			if($(this).parent().attr('id')=='icon1')
			{
				url ="subpage01.jsp";
			}else if($(this).parent().attr('id')=='icon2')
			{
				url ="subpage02.jsp";
			}else if($(this).parent().attr('id')=='icon3')
			{
				url ="subpage03.jsp";
			}
			location.href=url;
		}
		
	});
	
</script>
<!-- <style type="text/css">
	#icon1 a{ background-repeat:no-repeat; width: 199px; height: 190px ; background-image: url("../img/main/main_icon/hit_alcohol_btn.png");}
	#icon1 a:hover { background-position:0px 22%; background-image: url("../img/main/main_icon/hit_over_alcohol_btn.png");}
	
</style> -->
</head>
<body>
	<div id="mainMenu"><c:import url="header.jsp"></c:import></div>
	
	<div id="loginmodal" style="display: none;">
		<h2 align="center">LOGIN</h2>
		<div class="p_c_text" align="center">오한자에 오신 것을 환영합니다.</div>
		
		<form action="../member.do" method="post" name="login">
		<input type="hidden" name="command" value="login">
		<div class="login_line">
			<div class="box_in">
				<input type="text" name="id" id="id" size="23"> <input
					type="password" name="password" id="password" size="23">
			</div>
			<a href="javascript:login()"><span class="btn_login">LOGIN</span></a>
		</div>
		</form>
		
		<div class="find_join">
			<a href="searchId&Password.jsp" onclick="searchId()">아이디 / 비밀번호 찾기</a> | <a href="agreement.jsp">회원가입</a>
		</div>
	</div>
	
	
	<div id="abox" onmouseDown="onMouseDown()" onmouseUp="onMouseUp()">
		<ul id="a">
			<li><img src="../img/main/main_img.jpg"></li>
			<li><img src="../img/main/main_img.jpg"></li>
			<li><img src="../img/main/main_img.jpg"></li>
			<li><img src="../img/main/main_img.jpg"></li>
			<li><img src="../img/main/main_img.jpg"></li>
		</ul>
		<div id="icon">
			<a id="icon1" ><img src="../img/main/main_icon/hit_alcohol_btn.png"></a> 
			<a id="icon2" ><img src="../img/main/main_icon/hot_content_btn.png"></a>
			<a id="icon3" class="" href="../today.do?command=getBoard&&weather=hurim"><img
				src="../img/main/main_icon/today_menu_btn.png"></a>
		</div>
		<div id="nav">
			<a href="#" class="action" onClick="btn1Click()">1</a> 
			<a href="#" class="action" onClick="btn2Click()">2</a> 
			<a href="#"	class="action" onClick="btn3Click()">3</a> 
			<a href="#"	class="action" onClick="btn4Click()">4</a>

		</div>
		<div id="footer">
			<img alt="" src="../img/main/main_icon/copy.jpg">
		</div>
	</div>


</body>
</html>
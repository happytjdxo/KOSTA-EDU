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
<title>Kosta Torrent</title>
<script type="text/javascript">
	function popupIdOpen() {
		window.open("searchId_popup.jsp", "", "resizeable=true, toolbar=no, width=600, height=450");
	}
	function popupPassOpen() {
		window.open("searchPass_popup.jsp", "", "resizeable=true, toolbar=no, width=600, height=450");
	}
	function linkRegister() {
		var form = document.loginForm;
		
		location.href="register.jsp";
	}
</script>
<style type="text/css">
	h1{
		color: white;
		padding: 30px;
		font-family: Segoe Print;
	}
	#loginTable{
		color: white;
	    border-top: 1px solid white;	   
		text-align: center;
		font-family: 휴먼모음T;
	}
	
	#loginButton{
		border-top: 1px dotted pink;
		 border-bottom: 1px solid white;
		 text-align: center;
	}
	tr, td{
		padding: 17px;
	}
	body{
		background-image: url("./img/IMGP3893.jpg");
		background-repeat: no-repeat;
		 width: 100%;
  	 	 height: 100%;
	}
	.loginbtn, .registerbtn, .findIdbtn, .findPassbtn{
		background-color: #957745;
		color: white;
	}
	.input{
		color: black;
	}
</style>
</head>
<body >

	<header id="top" class="header">
        <div class="text-vertical-center">
            <h1>Kosta Torrent Welcome</h1>
            <br>
            <a href="#login" class="btn btn-dark btn-lg">Login</a>
        </div>
    </header>

    <!-- About -->
    <section id="login" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                	<h1 align="center">Member Login</h1>
                     <form action="login.do" method="post" name="loginForm">
						<!-- <input type="hidden" name="command" value="login"> -->
						<table align="center" id="loginTable"  width="700" height="250">
							<tr>
								<td><h3>ID</h3></td>
								<td><input type="text" class="input"name="id" placeholder="id를 입력하세요" required="required" size="30"></td>
							</tr>
							<tr>
								<td><h3>Password</h3></td>
								<td><input type="password"  class="input"name="password" placeholder="password를 입력하세요" required="required" size="30"></td>
							</tr>
						</table>
						<table align="center" id="loginButton" width="700"height="150">
							<tr>
								<td colspan="2" >
									<input type="submit" value="로그인" class="loginbtn btn " >&nbsp;
									<input type="button" value="회원가입" class="registerbtn btn " onclick="linkRegister()">&nbsp;
									<input type="button" value="ID 찾기" class="findIdbtn btn " onclick="popupIdOpen()">
									<input type="button" value="Password 찾기" class="findPassbtn btn" onclick="popupPassOpen()">
								</td>
							</tr>
						</table>
				</form>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>

</body>
</html>
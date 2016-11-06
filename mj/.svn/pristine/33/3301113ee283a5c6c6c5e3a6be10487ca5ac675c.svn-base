<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>
<script type="text/javascript" src="/ohanza/js/httpRequest.js"></script>
<script type="text/javascript" src="js/jquery-1.11.3.js"></script>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/main/main.css" rel="stylesheet" type="text/css" />
<link href="../css/common.css" rel="stylesheet" type="text/css" />
<link href="../css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/jquery.leanModal.min.js"></script>
<style type="text/css">
.signup {
   background-color: #222535;
   border-color: #DD8705;
}

pre {
   font-family: sans-serif;
}

label {
   text-align: left;
}
 body {
   background-color: #a6ce39;
   margin: 0;
   padding: 0;
   width: 100%;
   }

.container {
   width: 40%;
   height: 580px;
   margin-top: 5%; 
   /* margin-bottom: 0px; */
   /* padding-top: 50px; */
    /* padding-left: 30%;  */
}
  #loginmodal{border:2px solid #808040; width: 260px; height: 240px}
#btns {
   /* position:absolute; */
   margin-top: 10px;
}

#inputscreenname {
   width: 80%;
}
</style>

<script type="text/javascript">
   function check(click_radio) {
      var total = 2;
      for (var i = 1; i <= total; i++) {
         if (document.getElementById("radioCheck" + i).checked) {
            // 선택된 애들이 있으면 풀고..
            document.getElementById("radioCheck" + i).checked = false;
         }
      }
      // 지금 선택한 애를 선택. 
      click_radio.checked = true;

   }

</script>
<script type="text/javascript">
   function register(){
      alert("111")
      var register = document.register;
      register.submit();   
   }
</script>

<script type="text/javascript">
   $(function(){
      $('input[name=id]').keyup(function(){
         
          var id = $(this).val();
          //alert(id);
          $.ajax({
            type : "post",
            url : "/ohanza/member.do",
            data : "command=idCheck&&id="+id,
            dataType : "json",
         
            success:function(data){
               if(data.flag == false){//false면, 없는 값.
                  $('#idCheck').html("해당 ID는 사용 가능합니다.").css({
                     'color' : 'blue'
                  })
               } else if(data.flag == true){
                  $('#idCheck').html("해당 ID는 사용이 불가능합니다.").css({
                     'color' : 'red'
                  })
               }
            }
         }) // ajax */
      
      
      /* $(function(){
      $('input[name=nickname]').keyup(function(){
         
          var nickname = $(this).val();
          //alert(id);
          $.ajax({
            type : "post",
            url : "/ohanza/member.do",
            data : "command=nickNameCheck&&nickname="+nickname,
            dataType : "json",
         
            success:function(data){
               if(data.result == false){//false면, 없는 값.
                  $('#idCheck').html("해당 ID는 사용 가능합니다.").css({
                     'color' : 'blue'
                  })
               } else if(data.result == true){
                  $('#idCheck').html("해당 ID는 사용이 불가능합니다.").css({
                     'color' : 'red'
                  })
               }
            }
         }) // ajax */
      }) 
   });
</script>
<script type="text/javascript">
   function checkPwd() {
      var f1 = document.forms[0];
      var pw1 = f1.password.value;
      var pw2 = f1.passwordCheck.value;
      if (pw1 != pw2) {
         document.getElementById('checkPwd').style.color = "red";
         document.getElementById('checkPwd').innerHTML = "동일한 패스워드를 입력하세요.";
      } else {
         document.getElementById('checkPwd').style.color = "blue";
         document.getElementById('checkPwd').innerHTML = "패스워드가 확인되었습니다..";

      }
   }
</script>
</head>
<body>

   <div id="mainMenu"><c:import url="header.jsp"></c:import></div>
   
   <div id="loginmodal" style="display: none;">
      <h2 align="center">LOGIN</h2>
      <div class="p_c_text" align="center">오한자에 오신 것을 환영합니다.</div>
      <div class="login_line">
         <div class="box_in">
            <input type="text" name="id" id="id" size="23"> <input
               type="password" name="pw" id="pw" size="23">
         </div>
         <span class="btn_login"><a href="">LOGIN</a></span>
      </div>
      <div class="find_join">
         <a href="#" onclick="searchId()">아이디 / 비밀번호 찾기</a> | <a href="agreement.jsp">회원가입</a>
      </div>
   </div>
   
   <div class="container">
      <div class="panel-heading" style="background-color: #22b14c">
         <h4 class="panel-title" align="center">회 원 가 입</h4>
      </div>
      
      <form action="../member.do" id="register" name="register" method="post" class="form-horizontal" style="border: 1.5px solid #22b14c;">
         <input type="hidden" name="command" value="registerMember">
         <div class="form-group" >
            <label for="inputscreenname" class="col-md-4 control-label"
               style="margin-top: 10px;"> 아 이 디</label>
            <div class="col-md-8" style="margin-top: 10px;">
               <input type="text" name="id" class="form-control" id="inputscreenname"
                  placeholder="아이디를 입력해주세요" />
               <div id="idCheck"></div>
            </div>
         </div>
         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               비밀번호</label>
            <div class="col-md-8">
               <input type="password" name="password" class="form-control" id="inputscreenname"
                  placeholder="비밀번호를 입력해주세요">
            </div>
         </div>
         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               비밀번호 재확인</label>
            <div class="col-md-8">
               <input type="password" name="passwordCheck" class="form-control" id="inputscreenname"
                  placeholder="비밀번호를 다시 입력해주세요" onkeyup="checkPwd()"/>
            <div id="checkPwd"></div>
            </div>
         </div>
         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               이름</label>
            <div class="col-md-8">
               <input type="text" name="name" class="form-control" id="inputscreenname"
                  placeholder="이름을 입력해주세요" />
            </div>
         
         </div>

         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               주민등록번호</label>
            <div class="col-md-8">
               <input type="text" name="ssn" class="form-control" id="inputscreenname"
                  placeholder="주민등록 번호를 입력해주세요" />
            </div>
         </div>

         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               닉네임</label>
            <div class="col-md-8">
               <input type="text" name="nickname" class="form-control" id="inputscreenname"
                  placeholder="닉네임을 입력해주세요" />
               <div id="nicknameCheck">이 곳에 닉네임 중복체크</div>
            </div>
         </div>
         <div class="form-group">
            <label class="col-md-4 control-label"> 주소</label>
            <div class="col-md-8">
               <select name="address">
                  <option>주소를 선택해주세요</option>
                  <option>수정구</option>
                  <option>중원구</option>
                  <option>분당구</option>
               </select>
            </div>
         </div>
         <div class="form-group">
            <label for="inputscreenname" class="col-md-4 control-label">
               성별</label>
            <div class="col-md-8">
               <input id="radioCheck1" name="gender" type="radio" value="남성"
                  onclick="check(this)">남성 <input id="radioCheck2"
                  type="radio" value="여성" onclick="check(this)">여성
            </div>
         </div>
         <div id="btns" align="center">
         <input type="button" class="btn btn-default" value="가입 하기" onclick="javascript:register()"></input>
         <input type="button" class="btn btn-default" value="취소" onclick="javascript:location.href='index.jsp'"></input>
      </div>
      </form>
   </div>
</body>
</html>
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
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
   function check() {
      var ck_radio = document.register.gender;
      var flag = false;
      for(i=0; i<ck_radio.length; i++){
         if(ck_radio[i].checked){
            flag = true;
         break;
      }
      if(flag==false){
         Alert("성별을 반드시 체크해 주세요");
      }
      }
      /* var total = 2;
      for (var i = 1; i <= total; i++) {
         if (document.getElementById("radioCheck" + i).checked) {
            // 선택된 애들이 있으면 풀고..
            document.getElementById("radioCheck" + i).checked = false;
         }
      }
      // 지금 선택한 애를 선택. 
      click_radio.checked = true; */

   /* $('#cancleBtn').click(AA); */

   /* function AA() {
      //alert('1');
      self.close();
   } */
</script>
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
   function register(){
      alert("111")
      var register = document.register;
      register.submit();   
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
      
      <form action="../member.do" name="register" method="post" class="form-horizontal" style="border: 1.5px solid #22b14c;">
         <input type="hidden" name="command" value="registerMember">
         <div class="form-group" >
            <label for="inputscreenname" class="col-md-4 control-label"
               style="margin-top: 10px;"> 아 이 디</label>
            <div class="col-md-8" style="margin-top: 10px;">
               <input type="text" name="id" class="form-control" id="inputscreenname"
                  placeholder="아이디를 입력해주세요" />
               <div id="idCheck">이 곳에 아이디 중복체크</div>
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
               <input type="password" class="form-control" id="inputscreenname"
                  placeholder="비밀번호를 다시 입력해주세요" />
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
               <input type="radio" name="gender" value="남성" 
               onclick="check()">남성 
               <input type="radio" name="gender" value="여성" 
               onclick="check()">여성
            </div>
         </div>
         <div id="btns" align="center">
         <input type="submit" class="btn btn-default" value="가입 하기">
         
            <input type="button" class="btn btn-default" value="취 소">
      </div>
      </form>
   </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>jQuery UI Autocomplete - Default functionality</title>
  <!-- 자동완성기능 :: ajax + jquery + Spring -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/sunny/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
   $('#choose').autocomplete({
	  source:function(request, response){
		 /*  //입력박스에 입력한 값을 alert로 출력이 되도록
		  alert(request.term); */
		  $.ajax({
			 type: "post",
			 url: "test.do",
			 data: "command=autocomplete&&term="+request.term,
			 dataType: "json",
			 
			 success:function(data){
				response(data.course); 
			 } //callback
		  }); //ajax
	  } //source
   }); //autocomplete
   
   $('#chooseBtn').click(function(){
	   /* $('#resultView').html($('#choose').val()) */
	   $.ajax({
		   type: "post",
		   url: "test.do",
		   data: "command=search&&word="+$('#choose').val(),
		   dataType: "json",
		   
		   success:function(data){
			   $('#resultView').html(data.result).css('background','orange');
		   }
	   }); //ajax
   });//click
   
   // Key Event를 적용..버튼을 누르지 않고 Enter키를 입력하면 바로 동일한 효과가 나타나도록
   $('#choose').keyup(function(event){
	   if(event.which==13){ //Enter 키를 눌렀다면
		  //alert("enter..");
		   $.ajax({
			   type: "post",
			   url: "test.do",
			   data: "command=search&&word="+$('#choose').val(),
			   dataType: "json",
			   
			   success:function(data){
				   $('#resultView').html(data.result).css('background','blue');
			   }
		   }); //ajax
	   }
   });
  });
  </script>
</head>
<body>
 <div class = "ui-widget">
 	Choose Date Course :: <input type = "text" id = "choose">
 	<input type = "button" value = "Choose Course" id = "chooseBtn">
 </div>
 
 <div id = "resultView"></div>
</body>
</html>
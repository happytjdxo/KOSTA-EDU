<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/sunny/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#accordion" ).accordion({
    	//컨텐트에 맞게 어코디언의 height  폭을 조절하기 위한 속성
    	heightStyle:'content' /* heightStyle 디폴트 값은 fill이다 */
    });//accordion
    
    //1. h3를 클릭하면..
  	$('h3').click(function(){
  		var text = $(this).text();
  		//alert(text);
  		
  		//2. ajax 연결...
  		if(text=="IT Education Subject"){
  			$.ajax({
  				type:"post",
  				url:"test.do",
  				data:"command=getSubject",
  				dataType:"json",
  				
  				success:function(jsonData){
  					$('#subject').html(jsonData.info);
  				}//callback
  			});//ajax
  		}else if(text=="Association IT Company"){
  			$.ajax({
  				type:"post",
  				url:"test.do",
  				data:"command=getCompany",
  				dataType:"json",
  				
  				success:function(jsonData){
  					//alert(jsonData);
  					var str = "";
  					$.each(jsonData.info, function(index, value){
  						str += "<li>"+value+"</li>";
  					});//each
  					$('#itcom').html(str);
  				}//callback
  			});//ajax
  		}//else if
  	});//click
  	
  	$('#createSection').click(function(){
  		var footerContent = 
  			"<h3>Addiction</h3><div>경기도 성남시 판교 삼평동 유스페이스2 8층</div>";
  		
  		// 버튼을 없앤다.
  		$(this).remove();
  		//동적으로 아코디언을 생성한다...append() 사용
  		/* 
  			동적으로 새로 생성되는 어코디언을 만들때는 'destroy' 옵션으로
  			완벽하게 다 삭제를 한 뒤에 다시 아코디언을 생성해야 한다.
  		*/
  		
  		$('#accordion').append(footerContent).accordion('destroy').accordion({
  			heightStyle:'content'
  		});
  	});//click
  });
  
 
  </script>
</head>
<body>
	<div id="accordion">
		<h3>협회 소개 : INFORMATION</h3>
		<div>KOSTA 소프트웨어 진흥협회를 방문해 주셔서 감사합니다.
		     아래 Section 에서 이수할 과목을 확인하시기 바랍니다.</div>
		     
		<h3>IT Education Subject</h3>
		<div id="subject"></div>
		
		<h3>Association IT Company</h3>
		<div>
			<ul id="itcom">
				<!-- 밑에 it company가 붙을 것이다. -->
			</ul>
		</div>
	</div>
	<hr>
	<input type="button" value="Create Addiction" id="createSection">
</body>
</html>
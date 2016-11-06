<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script type="text/javascript">
   $(function(){
      //1. 주소를 하나 선택하지 않으면..."하나의 주소를 선택하세여" 메세지 띄움
      $('#addrSel').change(function(){
          if($(this).val()==""){ //아무것도 선택하지 않았다.
                alert("하나의 주소를 선택하세여");
                  return;
             }
      //2. 1이 아니라면...(선택했다면)...ajax로 들어가도록
           $.ajax({
            type:"post",
            url:"member.do",
            data:"command=getMemberCountByAddress&&address="+$(this).val(),
            dataType:"json",
            
            success:function(data){
               //alert("response..."+data);
               $('#countView').html(data.count+"명");
            } //callback
          }); //ajax
      }); //change
      
      //버튼을 클릭하면 해당 주소에 사는 회원의 모든 정보가 테이블 형식으로 뜨도록...
      $('#showBtn').click(function(){
         $.ajax({
            type:"post",
            url:"member.do",
            data:"command=getAddressKindList&&address="+$('#addrSel').val(),
            dataType:"json",
            success:function(data){
            	//$('#showAll').html("");
            	// 이전에 append된게 있다면 그걸 일단 지우고 다시 append 되도록
            	//$('#showAll>tr').remove();
            	//$('#showAll tr').remove();
            	//$('#showAll>*').remove();
            	
            	$('#showAll').children('tr').remove();
            	
            	$.each(data.memList, function(index,mem){
            		var ht = "<tr><td>" + mem.id + "</td><td>" + mem.name + 
            		"</td><td>" + mem.address + "</td></tr>";
            		$('#showAll').append(ht);
            	}); //each
            } //callback
         }); //ajax
      }); //click
   });//ready
</script>
</head>
<body>
<h2>member table의 Address List</h2><p>
<select id="addrSel">
   <option value="">======</option>
   <c:forEach items="${requestScope.addressList}" var="address">
      <option value="${address}">${address}</option>
   </c:forEach>
</select>
<span id="countView"></span>
<input type="button" value="회원보기" id="showBtn">
<hr>
<table border="2" bgcolor="yellow">
   <thead>
      <tr><td>ID</td><td>NAME</td><td>ADDRESS</td></tr>
   </thead>
   <tbody id="showAll">
   <!-- 이안에 붙는다...내용이.. -->
   </tbody>
</table>
</body>
</html>
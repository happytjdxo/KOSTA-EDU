function checkAge() {
		var af = document.ageForm.age;
		if(af.value==""){
			alert("나이는 필수 입력항목입니다.");
		}else if(af.value>=19) {	// 성인
			if(confirm("정말 성인 사이트로 이동하시겠습니까?")){
				//사이트로 이동.. 자바스크립트에서 바로 페이지를 이동하는 방법!!★
				location.href("http://127.0.0.1:7777/web06_javaScript/adult.jsp");
			}
		}else if(isNaN(af.value)){	//NAN : Not a Number 문자입력시 true
			alert("나이는 숫자로만 입력하세요..");
		}else{
			alert("나이 더 먹고 오삼..");
		}//미성년자의경우
		// 제어문의 블럭안에다 넣지 말고..checkAge()를 빠져 나오기 전에 작성..
		// 모든 제어문의 로직들이 빠져나온후 이 부분을 다 수행하기 때문이다.
		af.value="";
		af.focus();
	}
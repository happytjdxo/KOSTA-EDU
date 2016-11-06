$(function(){
	//1. p태그가 몇개인지 알아본다.. p태그 갯수를 alert()창으로 출력
	//alert($('p').length);
	
	//2. 2번째 p태그의 내용을 alert()창으로 출력.. text(), html(), val()
	//alert($('p:eq(1)').text());
	var firstP=$('p:eq(1)');
	//alert(firstP.text()); // html()
	
	//3. a 태그를 클릭하면 슬라이딩 효과..
	$('a.more').click(function(){
		if(firstP.is(':hidden')){//firstP가 안보인다면..
			firstP.slideToggle('slow');
			$(this).html('read less');
		}else{//firstP가 보인다면
			firstP.slideToggle('slow');
			$(this).html('read more');
		}
	}); //click
	
	var speech = $('div.speech');
	
	//4. speech의 기본 글자 사이즈
	var defaultSize = speech.css('fontSize');	//19.2px
	//alert(defaultSize);
	var num = parseInt(defaultSize, 10); // 19px
	//alert(num);
	
	//5. 각각의 버튼을 클릭할때마다 글자 크기가 점진적으로 커지거나 / 작아지도록
	$('#switcher>button').click(function(){
		switch(this.id){
		case 'switcher-large': //5
			num +=5;
			break;
		case 'switcher-small': //5
			num -=5;
			break;
		default: //num
			num = parseInt(defaultSize, 10);
			break;
		}
		// 이 부분을 반드시 줘야 한다.
		speech.animate({fontSize:num+'px'}, 'slow');
	});
});

$(function(){
	$('#menu1').click(menu1click);
	for(var i=1; i < 6 ; i++)
	{
		$('#menu'+i).css('cursor', 'pointer');
		$('#menu'+i).click(menuClick);
		
	}


	function menuClick(event)
	{
		//$(this).children().index(1);
		//alert('click')
		var menuName=$(this).attr("id");
		//alert(menuName)
		if(menuName=="menu2")
		{
			location.href="/ohanza/board.do?command=getBoardList";
		}else if(menuName=="menu3"){
			location.href="/ohanza/views/subpage02.jsp";
		}else if(menuName=="menu4"){
			location.href="/ohanza/views/subpage03.jsp";
		}else if(menuName=="menu5"){
			location.href="/ohanza/views/freePage.jsp";
		}else if(menuName=="menu6"){
			location.href="/ohanza/views/subpage01.jsp";
		}
		
	}

	function menu1click()
	{
		location.href='/ohanza/views/index.jsp';
	}
	
	
});
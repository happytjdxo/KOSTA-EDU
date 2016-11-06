$(function(){


$('#modaltrigger').leanModal({ top: 110, overlay: 0.8, closeButton: ".hidemodal" });
$('#openWindow').click(windowOpen);

for(var i=1; i < 6 ; i++)
{
	$('#subMenu'+i).hover(subMenuBarOver,subMenuBarOut);
}
function windowOpen() {
	var url = $
	{
		initParam.root
	}
	+"views/target.jsp";
	//alert(url);
	window.open(url, " ", "width:300px, height:300px");
}

function subMenuBarOver(index)
{
	//alert()
	//alert($('#subMenu'+index).name)
	var btnY = $(this).offset().top;
	$('#subMenuBar').index(10);
	//$('#subMenuBar').animate({top:(btnY-355)+'px'},'fast');
	TweenMax.to($('#subMenuBar'),0.6,{top:btnY-315});
}

function subMenuBarOut()
{
	
}

var btn = $('#subMenu1').offset().top;
$('#subMenuBar').index(10);
TweenMax.to($('#subMenuBar'),0.6,{top:btn-315});
});

function searchId()
{
	window.open("searchId&Password.html", "아이디찾기" , "width= 300, height=150");
}

function agreementClick(){
	 window.open("agreement.html", "회원가입" , "width= 350, height=620");
} 
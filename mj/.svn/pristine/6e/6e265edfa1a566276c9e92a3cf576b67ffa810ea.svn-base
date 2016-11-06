$(function(){

var menuArr =[
      			'<img src="img/main/MainMenu_btn/alcohol_type_btn_over.png">',
      			'<img src="img/main/MainMenu_btn/alcohol_house_btn_over.png">',
      			'<img src="img/main/MainMenu_btn/alcohol_tip_btn_over.png">',
      			'<img src="img/main/MainMenu_btn/free_board_btn_over.png">'
              
             ];
		

$('#menu1').click(menu1click);
$('#menu2').hover(menu2Over,menu2Out);
$('#menu3').hover(menu3Over,menu3Out);
$('#menu4').hover(menu4Over,menu4Out);
$('#menu5').hover(menu5Over,menu5Out);

$('#icon1').hover(icon1Over,icon1Out);
$('#icon2').hover(icon2Over,icon2Out);
$('#icon3').hover(icon3Over,icon3Out);

$('#modaltrigger').leanModal({ top: 110, overlay: 0.8, closeButton: ".hidemodal" });
$('#openWindow').click(windowOpen);

for(var i=1; i < 6 ; i++)
{
	$('#menu'+i).css('cursor', 'pointer');
	$('#menu'+i).click(menuClick);
	
}

function menuClick(event)
{
	var menuName=$(this).html();
	if(menuName==menuArr[0])
	{
		location.href="ohanza/views/subpage01.jsp";
	}else if(menuName==menuArr[1]){
		location.href="ohanza/views/subpage02.jsp";
	}else if(menuName==menuArr[2]){
		location.href="ohanza/views/subpage03.jsp";
	}else if(menuName==menuArr[3]){
		location.href="ohanza/views/freePage.jsp";
	}else if(menuName==menuArr[4]){
		location.href="ohanza/views/subpage01.jsp";
	}
	
}

function menu1click()
{
	location.href='index.html';
}

function icon1Over()
{
	$(this).html('<img src="img/main/main_icon/hit_alcohol_over_btn.png">');
}
		
function icon1Out()
{
	$(this).html('<img src="img/main/main_icon/hit_alcohol_btn.png">');
}

function icon2Over()
{
	$(this).html('<img src="img/main/main_icon/hot_content_over_btn.png">');
}
		
function icon2Out()
{
	$(this).html('<img src="img/main/main_icon/hot_content_btn.png">');
}

function icon3Over()
{
	$(this).html('<img src="img/main/main_icon/today_menu_over_btn.png">');
}
		
function icon3Out()
{
	$(this).html('<img src="img/main/main_icon/today_menu_btn.png">');
}

function menu2Over()
{
	$(this).html(menuArr[0]);
}
		
function menu2Out()
{
	$(this).html('<img src="img/main/MainMenu_btn/alcohol_type_btn.png">');
}


function menu3Over()
{
	$(this).html(menuArr[1]);
}
		
function menu3Out()
{
	$(this).html('<img src="img/main/MainMenu_btn/alcohol_house_btn.png">');
}


function menu4Over()
{
	$(this).html(menuArr[2]);
}
		
function menu4Out()
{
	$(this).html('<img src="img/main/MainMenu_btn/alcohol_tip_btn.png">');
}


function menu5Over()
{
	$(this).html(menuArr[3]);
}
		
function menu5Out()
{
	$(this).html('<img src="img/main/MainMenu_btn/free_board_btn.png">');
}

function menu6Over()
{
	$(this).html('<div><a href="#loginmodal" id="modaltrigger"><img src="img/main/MainMenu_btn/login_btn.png"></a></div>');
}
		
function menu6Out()
{
	$(this).html('<img src="img/main/MainMenu_btn/login_btn.png">');
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

});
function searchId()
{
	window.open("searchId&Password.html", "아이디찾기" , "width= 300, height=150");
}

function agreementClick(){
	//alert('1')
	 window.open("agreement.html", "회원가입" , "width= 350, height=620");
} 
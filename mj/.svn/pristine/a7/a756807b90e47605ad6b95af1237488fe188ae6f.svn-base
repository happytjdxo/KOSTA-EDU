package step1;

class WhiteBoard{
	// field선언
	String company;
	double price;
	char color;
	boolean scratch;
	int size;  
	String material; 
	
	// field 추가									------>????
	KostaEducation kosta;							//KostaEducation 이부분.(내가만든 참조형)

	//method 정의
	public String wirte(){
		return "잘써진다";
	}
	public String eraze(){
		return "잘 안지워진다";
	}
	//필드에 값을 저장하는 기능
	public void setDetails(String com, char co, boolean sc){
		company = com;
		color = co;
		scratch = sc;
	}

	//저장된 필드값을 받아오는 기능
	public String getDetails(){
		return company + "\t" + price + "\t" + color + "\t" + scratch + "\t" + size +
				"\t" + material;
	
	}//getDetails

//////////////////////////////////////////////////////////////////////////////////////HAR
	
	public void setKosta(KostaEducation ko){
		kosta = ko;
	}

	public KostaEducation getKosta(){
		return kosta;
	}


}//class

class KostaEducation{
	String roomNumber;
	public void setRoomNumber(String number){
		roomNumber = number;
	}
	public String getRoomNumber(){
		return roomNumber;
	}
}
class WhiteBoardTest1{
	public static void main(String[] args){
		WhiteBoard wb = new WhiteBoard();
		wb.setDetails("KOSTA", 'W', true); //calling
		System.out.println(wb.getDetails());
	
	//////////////////////////////////////////////////////////////////////
/*		
		 KostaEducation ke = new KostaEducation();
		 ke.setRoomNumber("7 강의실");
		// System.out.println(ke.getRoomNumber());									===> 내가한거
		// ke.setRoomNumber("해당 화이트 보드는 '7 강의실'에 있습니다");			===>	"

		String roomNum = ke.getRoomNumber(); // 7강의장이 이곳으로 리턴 된다.	--//----------------------------------> 앞에 String roomNum는 왜?
		
		// System.out.println("\n 위에서 출력된 WhiteBoard는 " +
		//	roomNum + " 에 있는 WhiteBoard는 입니다.");
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	//KostaEducation ke = new KostaEducation();
	wb.setKosta(new KostaEducation());	// 이 시점에서 WhiteBoard 와 KostaEducation이 관계성을 갖는다.
	KostaEducation ke = wb.getKosta();		// wb.KostaEducation(ke); //=??//KostaEducation wb.KostaEducation(ke); 이걸 안하고 바로 ke = wb.getKosta(); 이걸로 하면 null이 나온다.

	ke.setRoomNumber("7강의장");
	System.out.println("당신이 출력한 WhiteBoard는" + ke.getRoomNumber() +
			" 에 있는 Board입니다,");

	}//main
}//class








// has a relation // get/set 관계...다시 봐야겟음..


package step2;
//	WhiteBoard와 KostaEducation의 Hasing 관계를 설정.
//	1. 필드에 선언 : KostaEducation
//	2. WhiteBoard에 setXxxxx()를 만들어서 실제로 KostaEducation을 주입시켜야 한다.
//	----> 이럴때만 Hasing 관계가 성립.
//	----> Hasing 관계가 성립되면 WhiteBoard가 KostaEducation의 모든 구성요소
//		  들을 사용할 수 있다.(값 할당 / 호출)

class WhiteBoard{
	double price;
	int size;
	char color;
	
	KostaEducation kosta;

	public void setKosta(KostaEducation k){
		kosta = k;
	}
	public KostaEducation getKosta(){
		return kosta;
	}

	public void setInfo(double p, int s, char c){
		price = p;
		size = s;
		color = c;
	}
	public void getInfo(){
		System.out.println("Board Information : " + price + "\t" + size + "\t" + color);

	}
}
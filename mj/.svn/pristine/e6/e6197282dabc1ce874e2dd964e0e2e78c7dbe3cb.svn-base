// page 227 예제 7-1

package inheritance.book.test;

class Tv {
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	void power() { power =!power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTVTest extends Tv{
	boolean caption;	// 캡션상태 (on/off)
	void displatCaption(String text) {
		if (caption) {	// 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}
class CaptionTvTest{
	public static void main(String[] args) {
		CaptionTVTest ctv = new CaptionTVTest();
		ctv.channel = 10;		// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();		// 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displatCaption("Hello, World");
		ctv.caption = true;					// 캡션기능을 켠다.
		ctv.displatCaption("hello, World");	// 캡션을 화면에 보여준다.
	}

}

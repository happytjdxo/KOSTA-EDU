package book.event.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import event.chatting.test.ChattingClient;

public class ChatWin implements ActionListener { // public 으로 클래스 Chatwin 정의하는데, ActionListener 라는 인터페이스를 구현
	// 필드 선언 -> 멤버
	Frame f; // 프레임이라는 클래스형 타입으로 f라는 객체를 선언.
	TextField tf;
	TextArea ta;
	
	ChatWin(String title){ // ChatWin 생성자에 String형 title 인자를 할당해서,
		f = new Frame("Chatting."); // 프레임 객체 f 를 "Chatting" 값을 지닌 Frame() 생성자를 사용해서 객체를 생성.
		tf = new TextField();		// tf 객체를 TextField() 생성자를 사용해서 아무것도 없는 객체를 생성.
		ta = new TextArea();		// ta객체를 TextArea()생성자를 사용해서 아무것도 없는 객체를 생성.
		
		f.add(tf, "South"); 	// 객체 f에 있는 add라는 메서드를 사용하는데, tf와 "South"를 인자로 할당.
		f.add(ta, "Center");	// 객체 f에 있는 add라는 메어드를 사용하는데, ta와"Center"라는 인자를 할당.
		f.setSize(300, 200);	// 객체 f에 있는 setSize라는 메서드를 사용해 가로 300 세로 200이라는 인자를 할당.
		f.setVisible(true);		// 객체 f에 있는 setVisible이라는 메서드를 사용해 true 값을 할당.
		
		tf.requestFocus();		// tf에 있는 requestFous 메서드를 사용해 textfile 에 포커스를 할당.
		ta.setEditable(false);	// ta에 있는 setEditable 메서드를 사용해 false 값을 할당.
		ta.setBackground(Color.LIGHT_GRAY);	// ta에 있는 setBackground 메서드를 사용해 라이트 그레이라는 색을 할당.
	}
	
	public void lunchFrame(){ // 메서드는 멤버 ////////// new something extends WidnowAdapter()
		f.addWindowListener(new WindowAdapter() { // f에 있는 addWindowListener 메서드에 InnerClass 를 구현해줘.
												  // WindowAdapter()라는 부모클래스를 상속받고, 이름이 주어지지 않은 클래스를
											      // 구현함과 동.시.에. new라는 키워드를 통해서 객체의 생성까지 해주는 것.
			@Override // 부모클래스에서 선언된 메서드의 내용을 변경하는 것으로 재정의 또는 오버라이딩이라고 표현한다.
			public void windowClosing(WindowEvent e) { // 부모클래스 WindowAdapter()의 구현부를 재정의하는 과정 시작
													   // 클릭 같은 행위 조차도 객체로 인자를 넣어줌으로 메서드의 수행.
				System.exit(0); // 시스템의 종료. 0 은 정상종료 상태.
			} // windowClosing() 메서드 종료.
		}); // 객체 선언 및 생성 종료와 동시에 addWindowListener 메서드 종료.
		tf.addActionListener(this); // tf에 있는 addActionListener라는 메서드를 수행하고, 인자로 this(해당 클래스)를 할당.

	}
	
	public static void main(String[] args) { // 메인메서드 실행
		ChatWin cc = new ChatWin("Chatting Room.."); // ChatWin 클래스 타입으로 cc 객체의 선언 과 동시에 "Chatting Room" 이라는
													 // 인자를 가진 생성자를 통해 객체를 생성.
		cc.lunchFrame(); // cc.에 있는 lunchFrame()메서드를 실행.
	}
	
	@Override // 현재 인터페이스에는 구현되어있지 않음.
	public void actionPerformed(ActionEvent e) { // 상속을 받았으므로, 상속받은 클래스(ChatWin)에서 구현을 해줘야하고, 해주었다.

		ta.append(tf.getText() + "\n");
		tf.setText("");
		tf.requestFocus();
	}
}

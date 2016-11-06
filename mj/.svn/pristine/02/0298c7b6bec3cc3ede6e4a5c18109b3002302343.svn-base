package gui.container.test;
/*
 * 해당 코드에서는 기본으로 동작하는 레이아웃매니저를 변경해보겠다.
 * Frame : BorderLayot
 * Panel : FlowLayout
 * Panel에 Button이 부착.. 왼쪽에서 오른쪽으로 부착되었다.
 * 이것을 변경..setLayout()
 * Panel에 동작하는 레이아웃 --> BorderLayout
 * b1 - North
 * b2 - South
 * b3 - West
 * b4 - East
 */
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanelTest3 {
	// Button의 4개 선언, 생성하고
	// 4개의 버튼을 panel에 부착해 보세요.
	private Frame f;
	private Panel p;
	private Button b1, b2, b3, b4;
	
	
	public FrameWithPanelTest3() {
		f = new Frame("Frame With Panel");
		p = new Panel();
		b1 = new Button("open");
		b2 = new Button("close");
		b3 = new Button("OK");
		b4 = new Button("Fail");
		
		// layout..panel이 frame의 어디에 부착될지를 지정하는 것.
		//f.add(p,BorderLayout.SOUTH);
		p.setLayout(new BorderLayout());	// 변경..
		f.add(p,BorderLayout.NORTH);
		//f.add(p,BorderLayout.WEST);
		//f.add(p,BorderLayout.EAST);
		//f.add(p,BorderLayout.CENTER);
		
		f.setSize(500, 400);
		f.setBackground(Color.RED);
		p.setBackground(Color.CYAN);
		
		//FlowLayout은 Panel에 기본으로 작동하는 LayOutManager.dlek.
/*		p.add(b1, BorderLayout.NORTH);
		p.add(b2, BorderLayout.SOUTH);
		p.add(b3, BorderLayout.CENTER);
		p.add(b4, BorderLayout.EAST);*/
		
		p.add(b1, "North");
		p.add(b2, "South");
		p.add(b3, "Center");
		p.add(b4, "East");
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameWithPanelTest3();
	}
}

/*
 *	Component들이 어디에 배치되나는가를 전문적으로 관리하는 매니저가 있다.
 *	--> LayouyManager
 *	1) BorderLayout
 *	2) FlowLayout
 *  3) GridLayout
 *  3) CardLayout
 */
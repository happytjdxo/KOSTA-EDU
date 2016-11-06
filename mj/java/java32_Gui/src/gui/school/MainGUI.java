// Panel np, wp, cp, ep, sp;
// Button stuAdd, teaAdd, empAdd, delete, find, update, apply, clear;
//List view;
// Label l1, l2 l3, l4, l5, l6, l7 listLavel, pro;

package gui.school;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class MainGUI {
	private Frame f;
	private TextField ta1, ta2, ta3, ta4, ta5, ta6, ta7;
	private Panel np, wp, cp, ep, sp;
	private Button stuAdd, teaAdd, empAdd, delete, find, update, apply, clear;
	private List view;
	private Label l1, l2, l3, l4, l5, l6, l7, listLavel, pro;

	public MainGUI() {
		f = new Frame("학원 인사 관리 프로그램");
		
		ta1 = new TextField(10);
		ta2 = new TextField(10);
		ta3 = new TextField(10);
		ta4 = new TextField(10);
		ta5 = new TextField(10);
		ta6 = new TextField(10);
		ta7 = new TextField(10);

		np = new Panel();
		wp = new Panel();
		cp = new Panel();
		ep = new Panel();
		sp = new Panel();
		
		stuAdd = new Button("학생 추가");
		teaAdd = new Button("선생 추가");
		empAdd = new Button("직원 추가");
		delete = new Button("삭제");
		find = new Button("찾기");
		update = new Button("수정");
		apply = new Button("적용");
		clear = new Button("clear");
		
		l1 = new Label("이 름");
		l2 = new Label("나 이");
		l3 = new Label("학 번");
		l4 = new Label("과 목");
		l5 = new Label("부 서");
		l6 = new Label("주 소");
		l7 = new Label("전화 번호");
		listLavel = new Label("인원 명단");
		pro = new Label("SCHOOL PROJECT SAMPLE");
		view = new List(15);	// 이건 뭐임?
	}

	public void lunchFrame() {
		
		np.add(pro);
		np.setBackground(Color.blue);
		
		sp.setBackground(Color.RED);
		sp.add(stuAdd);
		sp.add(teaAdd);
		sp.add(empAdd);
		sp.add(delete);
		sp.add(find);
		sp.add(update);
		sp.add(apply);
		sp.add(clear);
		
		wp.setLayout(new GridLayout(7,2));
		wp.add(l1);
		wp.add(ta1);
		wp.add(l2);
		wp.add(l2);
		wp.add(ta2);
		wp.add(l3);
		wp.add(ta3);
		wp.add(l4);
		wp.add(ta4);
		wp.add(l5);
		wp.add(ta5);
		wp.add(l6);
		wp.add(ta6);
		wp.add(l7);
		wp.add(ta7);
		
		ep.setLayout(new BorderLayout());
		ep.add(listLavel, "North");
		ep.add(view);
		
		
		cp.add(wp);
		cp.add(ep);
		f.setSize(500, 480);
		
		
		f.add(sp, "South");
		f.add(np, "North");
		f.add(cp);
		
	
		f.setVisible(true);
	}

	public static void main(String[] args) {
		MainGUI test = new MainGUI();
		test.lunchFrame();
	}
}



// Frame - BorderLayout()	---> 위아래 왼쪽 오른쪽 중간 다 할수 있음
// panel - FlowLayout()		---> 중간에서 추가될 수록 왼쪽으로 쏠림
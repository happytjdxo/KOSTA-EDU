package event.mouse.test;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter{
	
	MouseTwoListenerTest tow;
	
	MouseHandler(MouseTwoListenerTest tow){
		this.tow = tow;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		String s = "프레임 안에 커서가 있습니다";
		tow.tf.setForeground(Color.GREEN);
		tow.tf.setText(s);
		
		/*
		tow.tf.setText("프레임 안에 커서가 있습니다.");
		tow.tf.setForeground(Color.GREEN);
		*/
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		tow.tf.setText("프레임 밖에 커서가 있습니다.");
		tow.tf.setForeground(Color.BLUE);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		tow.tf.setText("x : " + e.getX() + ", y : " + e.getY());
	}
}

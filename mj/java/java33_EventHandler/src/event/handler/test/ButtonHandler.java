package event.handler.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Event Handling을 여기서 하겠다.
// 재사용성이 높다. 유지보수가 뛰어나다.
public class ButtonHandler implements ActionListener {

	@Override
	/*public void actionPerformed(ActionEvent e) {
		System.out.println("왜 불러");
		System.out.println("왜 자꾸 불러");
	}*/
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());	// Button의 Title이 출력.
	}
	
}

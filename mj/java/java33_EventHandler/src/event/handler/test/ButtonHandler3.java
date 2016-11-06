package event.handler.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler3 implements ActionListener {
	FourButton3 fb3;
	
	ButtonHandler3(FourButton3 bt3){
		this.fb3 = fb3; 
	}
   public void actionPerformed(ActionEvent e) {
      //각각의 버튼이 눌러졌을때 서로 다른 메세지를 TextField에 출력
      if(e.getSource()==fb3.b1){
    	  fb3.b1.setForeground(Color.RED);
    	  fb3.tf.setText("쓰레기사랑해");
      }
      if(e.getSource()==fb3.b2){
    	  fb3.b2.setForeground(Color.orange);
    	  fb3.tf.setText("끝날때까지 끝난게 아니다");
      }
      if(e.getSource()==fb3.b3){
    	  fb3.b3.setForeground(Color.YELLOW);
    	  fb3.tf.setText("나정이사랑해");
      }
      if(e.getSource()==fb3.b4){
    	  fb3.b4.setForeground(Color.BLUE);
    	  fb3.tf.setText("윤진이사랑해");
      }

      
   }

}
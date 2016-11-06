package event.handler.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FourButton4{
   //1. GUI구성
   private Frame f;
   private Panel p;
   private Button b1, b2, b3, b4;
   private TextField tf;

   FourButton4(){
      f = new Frame("Four Button");
      p = new Panel();
      b1 = new Button("나정이");
      b2 = new Button("칠봉이");
      b3 = new Button("쓰레기");
      b4 = new Button("삼천포");
      tf = new TextField(30);
   }
   public void lunchFrame(){
      p.add(b1); p.add(b2); p.add(b3); p.add(b4);
      f.add(p,"North");
      f.add(tf,"South");
      f.setBackground(Color.pink);
      f.pack();
      f.setVisible(true);
      
      //2. Listsner 부착
      b1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
		         b1.setForeground(Color.RED);
		         tf.setText("쓰레기사랑해");
		      }
		}
	});
     
      b2.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b2){
		         b2.setForeground(Color.orange);
		         tf.setText("끝날때까지 끝난게 아니다");
		      }
		}
	});
     
      b3.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			 if(e.getSource()==b3){
		         b3.setForeground(Color.YELLOW);
		         tf.setText("나정이사랑해");
		      }
		}
	});
    
      b4.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b4){
		         b4.setForeground(Color.BLUE);
		         tf.setText("윤진이사랑해");
		      }
		}
	});
 
   }
}
public class FourButtonTest4 {

   public static void main(String[] args) {
      FourButton4 fb4 = new FourButton4();
      fb4.lunchFrame();
   
   }

}
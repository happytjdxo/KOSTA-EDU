package thread.basic.test;

import java.awt.Toolkit;

/*
 * 별도의 쓰레드를 만드지 않고 main 쓰레드만으로 작업을 수행...
 * 경고음을 발생시킬 것이다. / 동시에 콘솔로 띵띵띵띵띵을 출력할 것이다.
 * main 쓰레드가 두가지 일을 해야하는데...동시에 가능한가?? 
 * ==> 동시에 불가능 (single Thread 이므로)
 * ::   
 * 경고음을 5번 보내고 나서 / 띵을 출력할 수 밖에 없다.
 */
public class BeepPrintTest3 {
   public static void main(String[] args) {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      for(int i=1 ; i<6 ; i++){
         try{
         Thread.sleep(500);
         toolkit.beep();
         }catch(InterruptedException e){
            e.printStackTrace();
         }
      }
      
      for(int i=1 ; i<6 ; i++){
         try{
         Thread.sleep(500);
         System.out.println("띵");
         }catch(InterruptedException e){
            e.printStackTrace();
         }
      }
   }
}
package thread.basic.test;

import java.awt.Toolkit;

/*
 * Step2 ::
 * 동시성을 보장받으면서 작업하기 위해서 쓰레드를 하나더 정의한다.
 * (mainThrea / 작업Thread)
 * 경고음을 울리는 동시에 콘솔창 출력이 가능해진다.
 * BeepThread라는 작업쓰레드를 직접 구현하세요.
 */
class BeepThread implements Runnable {
   Toolkit toolkit = Toolkit.getDefaultToolkit();

   @Override
   public void run() {
      for (int i = 1; i < 6; i++) {
         toolkit.beep();
         try {

            Thread.sleep(500);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}

public class BeepPrintTest4 {
   public static void main(String[] args) {
      BeepThread bt = new BeepThread();
      Thread thread = new Thread(bt);

      thread.start();
      for (int i = 1; i < 6; i++) {
         try {
            System.out.println("띵");
            Thread.sleep(500);
            
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
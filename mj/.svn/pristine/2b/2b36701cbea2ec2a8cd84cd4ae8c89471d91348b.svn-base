package queue.step5.test;

import java.util.LinkedList;
import java.util.Queue;

import queue.step5.Message;

public class QueueMessageTest {
	public static void main(String[] args) {
		
		Queue<Message> queue = new LinkedList<Message>();
		
		queue.offer(new Message("sendMail", "란"));
		queue.offer(new Message("sendKaKaoTalk", "혜진"));
		queue.offer(new Message("sendSMS", "민재"));
		
		while(!queue.isEmpty()){
			Message message = queue.poll();
			// System.out.println(message.command);
			switch(message.command){
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendKaKaoTalk" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			}
		}
	}
}

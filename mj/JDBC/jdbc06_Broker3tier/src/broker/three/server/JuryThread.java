package broker.three.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;

import broker.three.exception.DuplicateSSNException;
import broker.three.exception.InvalidTransactionException;
import broker.three.exception.RecordNotFoundException;
import broker.three.shares.Command;
import broker.three.shares.Result;
import broker.three.vo.CustomerRec;
import broker.three.vo.StockRec;

public class JuryThread extends Thread{
	Database db;
	Socket s;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Command cmd;
	
	/*
	 * 1. 이 쓰레드가 하는 역할은?
	 * 2. 해당 쓰레드가 생성될 때, 생성자에 인자를 2개 넣어주는 이유는 무엇인가?
	 * try - catch 문에서 ois 와 oos 는 이 쓰레드의 역할 때문에 생성자에서 호출하는 거야. 그러니까 1번 답 찾아.
	 */
	JuryThread(Socket s, Database db){
		this.s = s;
		this.db = db;
		try{
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
		}catch(IOException e){
			
		}
		System.out.println("Jury Creating.....");
	}//생성자
	/*
		계속 돌면서 도시락 받아낸다.
		도식락받아서 까본다....상수값, 반찬들이 튀어나온다.
		이걸 토대로 Database의 메소드를 직접 호출한다...
		switch문 안에서		
	 */
	public void run(){ // 쓰레드니까 run() 메서드가 반드시 들어가야 하는거 알지?
		System.out.println("jury run().....");
		while(true){ // 이 쓰레드가 while문을 돈다는 것은 아래의 문장들이 계속적으로 실행됨을 의미한다.
					 // 그리고 쓰레드는 메인과 별개로 지속적으로 도는 프로그램. 즉, 사용되고 사용이 종료되면 사라지는 것이 쓰레드의 특성인데
					 // 그 쓰레드를 계속 살리면서, 어떤 인터럽트가 발생하면 메모리의 점유를 통해 실행시키기 위해서 위와 같은 방법을 사용한다.
			try{
				//1. 도시락 받는다.
				cmd = (Command)ois.readObject(); // 객체를 읽어들이는 스트림을 통해서 반환되는 값은 Object야. 그런데 Object는 부모지?
												 // 그런데, cmd는 너가 만든 사용자 지정 클래스잖아. 그리고 모든 클래스는 Obejct가 부모고,
												 // 그러니까 캐스팅을 해주는거야. cmd로 명시적형변환을 통해서 넣어주려고.
				System.out.println("cmd....jury reading....");
			}catch(Exception e){				 // 예외 처리하는거니까 걍 외우고.
				e.printStackTrace();
			}//catch
			
			//2. 도시락 깐다....Data UnPack
			int comm=cmd.getCommandValue();//10~90
			String[ ] args = cmd.getArgs();
			Result r = cmd.getResults(); // 3. cmd가 정확히 어떠한 역할을 하는건지 정확히 알아봐. 그리고 이 라인부터 위 3줄 설명해봐.
			
			//3. switch문 안에서 상수값에 따라서 데이타베이스의 기능을 호출
			switch(comm){ // 4. 스위치문 사용법은 내가 말 안해도 알지? 모르면 물어보고 switch안의 저 comm이 어디에서 온 값이고, 무엇을 위한 값인지 설명해봐.
			case 10 : //buyShares()
				try{
					db.buyShares(args[0], args[1], Integer.parseInt(args[2])); // 잘 체크해야할 것이, 이 쓰레드의 db랑 Broker클래스의 db랑은 이름만 같을 뿐,
																			   // 구현되는 내용이 달라. 그런데 인자는 같지. 그게 포인트야. 왜 같게 해주었냐면,
																			   // 개발자가 이해하기 쉽도록 하기 위해서야. 너가 저 buyShares()라는 메서드를
																			   // 사용할 때, 패킹 하는 개념을 생각하는 게 아니고, 저 인자에 맞게 주식을 산다는
																			   // 느낌이 강한데, 문제는 db에 연결되지 않으면 그와 같은 방식으로 사용할 수는 없잖아.
																			   // 
					r.setStatus(0);
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 20 : //sellShares()
				try{
					db.sellShares(args[0], args[1], Integer.parseInt(args[2]));
					r.setStatus(0);
				}catch(RecordNotFoundException e){
					System.out.println("주식을 팔 고객이 없네여..jury..");
					r.setStatus(-1);
				}catch(InvalidTransactionException e){
					System.out.println("주식을  너무 많이 팔려고..jury..");
					r.setStatus(-3);
				}catch(SQLException e){
					
				}
				break;
			case 30 : //getAllStock()
				try{
					ArrayList<StockRec> list=db.getAllStock();
					r.setStatus(0);
					r.add(list); //이부분이 있다..
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 40://getStockPrice
				try{
					float price=db.getStckPrice(args[0]);
					r.setStatus(0);
					r.add(price);
				}catch(Exception e){
					e.printStackTrace();
				}				
				break;
			case 50: //getAllCustomer()
				try{
					ArrayList<CustomerRec> list=db.getAllCustomer();
					r.setStatus(0);
					r.add(list);
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 60: //getCustomer()
				try{
					CustomerRec cust=db.getCustomer(args[0]);
					r.setStatus(0);
					r.add(cust);
				}catch(Exception e){
					e.printStackTrace();
				}				
				break;
			case 70: //addCustomer
				try{
					db.addCustomer(new CustomerRec(args[0], args[1], args[2]));
					r.setStatus(0);
				}catch(DuplicateSSNException e){
					r.setStatus(-2);
					System.out.println("그런 사람 이미 있어여...jury..");
				}catch(Exception e){
					
				}
				break;
			case 80: //deleteCustomer
				try{
					db.deleteCustomer(args[0]);
					r.setStatus(0);
				}catch(RecordNotFoundException e){
					r.setStatus(-1);
					System.out.println("삭제할 사람 없어여.....jury..");
				}catch(Exception e){
					
				}
				break;
			case 90: //updateCustomer
				try{
					db.updateCustomer(new CustomerRec(args[0], args[1], args[2]));
					r.setStatus(0);
				}catch(RecordNotFoundException e){
					r.setStatus(-2);
					System.out.println("수정할 사람이 없어여...jury..");
				}catch(Exception e){
					
				}
				break;
			}//switch		
			
			//다시 Protocol 쪽으로 보낸다.
			try{
				oos.writeObject(cmd);
			}catch(Exception e){
				e.printStackTrace();
			}
		}//while
	}//run
}//class















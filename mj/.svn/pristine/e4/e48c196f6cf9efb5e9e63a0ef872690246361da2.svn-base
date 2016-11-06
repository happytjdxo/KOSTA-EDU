package jdbc.step2.test;

import java.util.ArrayList;

import jdbc.step2.dao.CustDAO;
import jdbc.step2.vo.CustVO;
import config.OracleInfo;

/*
 * step1에서는 ROW를 인스턴스화 시킨 객체 vo를 사용하지 않았다
 * step2에서는 
 * 	1) VO를 사용하고 
 *  2) Business Logic을 별도의 DAO 클래스에 담는다
 *  3) Test는 따로 작성하서 실행한다.
 *  --------------------------------------------------------
 *  cust 클래스를 다시 생성...
 	CREATE TABLE cust(
 				 id varchar2(20) primary key,
 				 name varchar2(30) not null,
 				 addr varchar2(40) not null);
   -->
   테이블 작성이 끝났으면
   vo 클래스 작성으로 바로 간다.
   1)이때 vo클래스 이름은 주로 테이블명을 사용한다
     ex)CustVO | MemberVO | CustomerVO.... 	
   2)VO클래스는 주로 패키지 이름에 vo가 들어간다...
     나중에는 domain | dto 라는 이름으로도 사용되는데, 이건 나중에 이야기 하자		 
  */
public class CustomerUseVOTest2 {
	static{
		try{
			Class.forName(OracleInfo.DRIVER_NAME);
			System.out.println("드라이버 로딩 성공...");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패...");
		}
	}
	public static void main(String[] args) throws Exception{
		/*
		 * DAO 클래스에서 b.l() 하나씩 구현할때마다 
		 * main() 밑에서 하나씩 호출해서 일일히 실행해봐야 한다.
		 * 실행에 성공하면 호출한 부분을 다시 주석처리 한다.
		 */
		CustDAO dao = new CustDAO();
		//test....start.
		//dao.addCust(new CustVO("kim", "김제동", "서초동"));
		//dao.deleteCust("kim");
		dao.updateCust(new CustVO("haha", "하바리", "판교"));
		//dao.updateCust("haha", "하바리", "판교");		위에랑 똑같은거
		//System.out.println(dao.getCust("haha"));
		ArrayList<CustVO> returnList;
		returnList = dao.getAllCust();// 원래는 returnList = new ArrayList<CustVO>();
									  // new ArrayList<CustVO> list = new ArrayList(); 이 과정은 메서드의 결과야.
									  // returnList = list;
		for(CustVO v : returnList){
			System.out.println(v);
		}
	}
}



















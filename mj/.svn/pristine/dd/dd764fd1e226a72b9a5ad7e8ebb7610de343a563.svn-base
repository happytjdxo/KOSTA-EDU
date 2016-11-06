package jdbc.mvc.test;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.mvc.dao.MemberDAO;
import jdbc.mvc.exception.DuplicateIDException;
import jdbc.mvc.exception.RecordNotFoundException;
import jdbc.mvc.vo.MemberVO;
import config.OracleInfo;

public class MemberDAOTest {
	
	static{
		try{
			Class.forName(OracleInfo.DRIVER_NAME);
			System.out.println("Connected to Driver.");
		}catch(ClassNotFoundException e){
			System.out.println("Fail to Connect to Driver.");
		}
	}
	public static void main(String[] args) throws SQLException, DuplicateIDException, RecordNotFoundException {

		MemberDAO test = new MemberDAO();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		/*test.registerMember(new MemberVO("111", "박정기", "2928", "서울"));
		test.registerMember(new MemberVO("222", "심은화", "2392", "수원"));
		test.registerMember(new MemberVO("333", "박종완", "2387", "죽전"));
		test.registerMember(new MemberVO("444", "최민재", "2812", "부천부자"));*/
		//test.registerMember(new MemberVO("444", "최민재", "1345", "판교"));
		
		//test.deleteMember("111");
		//test.updateMember(new MemberVO("444", "쵬민잼", "1242", "부천부자"));
		//System.out.println(test.selectByID("444"));
		/*list = test.getAllMember();
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		/*list = test.selectByAddress("죽전");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		//System.out.println(test.getCountByAddress("죽전"));
	}
}

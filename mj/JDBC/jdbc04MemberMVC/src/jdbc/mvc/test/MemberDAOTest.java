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
		/*test.registerMember(new MemberVO("111", "������", "2928", "����"));
		test.registerMember(new MemberVO("222", "����ȭ", "2392", "����"));
		test.registerMember(new MemberVO("333", "������", "2387", "����"));
		test.registerMember(new MemberVO("444", "�ֹ���", "2812", "��õ����"));*/
		//test.registerMember(new MemberVO("444", "�ֹ���", "1345", "�Ǳ�"));
		
		//test.deleteMember("111");
		//test.updateMember(new MemberVO("444", "�ٹ���", "1242", "��õ����"));
		//System.out.println(test.selectByID("444"));
		/*list = test.getAllMember();
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		/*list = test.selectByAddress("����");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		//System.out.println(test.getCountByAddress("����"));
	}
}

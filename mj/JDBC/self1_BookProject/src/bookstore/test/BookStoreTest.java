package bookstore.test;

import java.sql.SQLException;

import bookstore.dao.BookDAO;
import bookstore.exception.DuplicationException;
import bookstore.exception.RecordNotFoundException;
import bookstore.exception.SoldOutException;
import bookstore.vo.BookVO;
import config.OracleInfo;

public class BookStoreTest {

	static{
		try{
			Class.forName(OracleInfo.DRIVER_NAME);
			System.out.println("����̹� �ε�����..");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����..");
		}
	}

	public static void main(String[] args) throws  RecordNotFoundException, SoldOutException, SQLException, DuplicationException {
		BookDAO test = new BookDAO();
		test.registerBook(new BookVO("55-87", "�ڹ��� ����", "���ü�", "��������", 30000, 50));
		System.out.println(test);
	}
}

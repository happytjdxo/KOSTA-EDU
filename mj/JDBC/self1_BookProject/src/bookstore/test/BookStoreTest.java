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
			System.out.println("드라이버 로딩성공..");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패..");
		}
	}

	public static void main(String[] args) throws  RecordNotFoundException, SoldOutException, SQLException, DuplicationException {
		BookDAO test = new BookDAO();
		test.registerBook(new BookVO("55-87", "자바의 정석", "남궁성", "도우출판", 30000, 50));
		System.out.println(test);
	}
}

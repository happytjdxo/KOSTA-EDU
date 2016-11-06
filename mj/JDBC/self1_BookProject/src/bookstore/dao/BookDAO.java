package bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

import bookstore.exception.DuplicationException;
import bookstore.exception.RecordNotFoundException;
import bookstore.exception.SoldOutException;
import bookstore.vo.BookVO;
import config.OracleInfo;

public class BookDAO {
	//1靛扼滚楷搬
	//目池记 积己
	//ps积己
	//ps角青
	public Connection getConn() throws SQLException{
		Connection conn = DriverManager.getConnection(OracleInfo.URL, OracleInfo.USER, OracleInfo.PASS);
		return conn;
	}

	public void closeAll(PreparedStatement ps, Connection conn){
		try{
			ps.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("resource has still opened.");
		}
	}
	public void closeAll(PreparedStatement ps, Connection conn, ResultSet rs){
		try{
			closeAll(ps, conn);
			rs.close();
		}catch(SQLException e){
			System.out.println("resource has still opened.");
		}
	}

	public int idExist(Connection conn, String isbn)throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;


		try{
			String query = "SELECT id FROM member WHERE id=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, isbn);
			rs = ps.executeQuery();

			if(rs.next()) {
				return 1;
			}else if(!rs.next()) {
				return 2;
			} else{
				return 3;
			}


		}finally{
			ps.close();
			rs.close();
		}
	}
	public void registerBook(BookVO vo) throws  RecordNotFoundException, SoldOutException, SQLException, DuplicationException {
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConn();
		try{
			//if(idExist(conn,vo.getIsbn()) == 1) {

				String query = "INSERT INTO book VALUES(?, ?, ?, ?, ?, ?)";
				ps = conn.prepareStatement(query);

				ps.setString(1,vo.getIsbn());
				ps.setString(2,vo.getTitle());
				ps.setString(3,vo.getAuthor());
				ps.setString(4,vo.getPublisher());
				ps.setInt(5,vo.getPrice());
				ps.setInt(6,vo.getStock());

				int row = ps.executeUpdate();
				System.out.println(row + " executed!");
			//} else{
			//	throw new DuplicationException();

			//}
		}finally{
			closeAll(ps, conn);
		}
	}


	public void deletBook(String isbn) throws DuplicateFormatFlagsException,  RecordNotFoundException, SoldOutException, SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConn();
		try{
			if(idExist(conn,isbn) == 2){

				String query = "DELETE FROM book WHERE isn = ?";
				ps = conn.prepareStatement(query);

				ps.setString(1, isbn);

				int row = ps.executeUpdate();
				System.out.println(row + " executed!");
			} else {
				throw new SoldOutException();
			}
		}finally{
			closeAll(ps, conn);
		}
	}

	public BookVO SearchByTitle(String title) {
		return null;
	}

	public ArrayList<BookVO> SearchByPrice(int maxPrice, int minPrice) {
		return null;
	}

	public ArrayList<BookVO> SearchByAuthor(String author) {
		return null;
	}

	public ArrayList<BookVO> getAllBookInfo() {
		return null;
	}

	public void updateBook(String isbn) {

	}

	public void sellBook(String isbn) {

	}
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

public class BoardDao {
	DataSource ds;
	private static BoardDao dao = new BoardDao();
	private BoardDao() {
		ds=DataSourceManager.getInstance().getConnection();
	}
	public static BoardDao getInstance(){
		return dao;
	}
	public Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps, conn);
	}
	
	///////////////////////// 비지니스 로직 /////////////////////////////////////////////////////
	
	public void registerMember(MemberVO mvo) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.INSERT_MEMBER);
			ps.setString(1, mvo.getId());
			ps.setString(2, mvo.getPassword());
			ps.setString(3, mvo.getName());
			ps.setString(4, mvo.getNickname());
			ps.setString(5, mvo.getSsn());
			if(ps.executeUpdate()!=0){
				System.out.println(mvo.getName()+" 님 회원가입 성공");
			}
		}finally{
			closeAll(ps, conn);
		}
	}
	public boolean idExist(String id) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean exist = false;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_CHECK_ID);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				if(rs.getInt(1)==1){
					exist=true;
				}
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return exist;
	}
	public boolean ssnExist(String ssn) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean exist = false;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_CHECK_SSN);
			ps.setString(1, ssn);
			rs=ps.executeQuery();
			if(rs.next()){
				if(rs.getInt(1)==1){
					exist=true;
				}
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return exist;
	}
	public MemberVO login(String id, String password) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO mvo = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.LOGIN_MEMBER);
			ps.setString(1, id);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()){
				mvo = new MemberVO(rs.getString("id"),
									rs.getString("password"),
									rs.getString("name"),
									rs.getString("nickname")); 
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return mvo;
	}
	public String searchID(String name, String ssn) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String id = "";
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_SEARCH_ID);
			ps.setString(1, name);
			ps.setString(2, ssn);
			rs = ps.executeQuery();
			if(rs.next()){
				id = rs.getString("id");
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return id;
	}
	public String searchPass(String id,String name,String ssn) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String password = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_SEARCH_PASSWORD);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, ssn);
			rs = ps.executeQuery();
			if(rs.next()){
				password = rs.getString("password");
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return password;
	}
	public MemberVO modifyMemberInfo(MemberVO mvo) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.UPDATE_MEMBER);
			ps.setString(1, mvo.getPassword());
			ps.setString(2, mvo.getName());
			ps.setString(3, mvo.getNickname());
			ps.setString(4, mvo.getId());
			if(ps.executeUpdate()!=0){
				System.out.println(mvo.getName()+" 님의 정보수정 성공");
			}
		}finally{
			closeAll(ps, conn);
		}
		return mvo;
	}
	public void insertContent(BoardVO bvo) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.INSERT_CONTENT);
			ps.setString(1, bvo.getTitle());
			ps.setString(2, bvo.getWriter());
			ps.setString(3, bvo.getLink());
			ps.setString(4, bvo.getContent());
			ps.setString(5, bvo.getId());
			ps.setString(6, bvo.getCategory());
			if(ps.executeUpdate()!=0){
				System.out.println("게시물 등록 성공");
				ps = conn.prepareStatement(StringQuery.CURRENT_NO);
				rs = ps.executeQuery();
				if(rs.next())
					bvo.setNo(rs.getInt(1));
			}
		}finally{
			closeAll(rs, ps, conn);
		}
	}
	public void updateContent(BoardVO bvo) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			if(bvo.getLink()==null){
				ps = conn.prepareStatement(StringQuery.NO_FILE_UPDATE_CONTENT);
				ps.setString(1, bvo.getTitle());
				ps.setString(2, bvo.getContent());
				ps.setString(3, bvo.getCategory());
				ps.setInt(4, bvo.getNo());
			}else{
			ps = conn.prepareStatement(StringQuery.UPDATE_CONTENT);
			ps.setString(1, bvo.getTitle());
			ps.setString(2, bvo.getLink());
			ps.setString(3, bvo.getContent());
			ps.setString(4, bvo.getCategory());
			ps.setInt(5, bvo.getNo());
			}
			ps.executeUpdate();
		}finally{
			closeAll(ps, conn);
		}
	}
	public void deleteContent(int no) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.DELETE_CONTENT);
			ps.setInt(1, no);
			if(ps.executeUpdate()!=0)
				System.out.println("게시물 삭제 성공");
		}finally{
			closeAll(ps, conn);
		}
	}
	public ArrayList<BoardVO> searchContentByCategory(String category, String title) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardVO> blist = new ArrayList<BoardVO>();
		Date day = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		String today = sdf.format(day);
		System.out.println(today);
		String time_posted = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_CATEGORY_SEARCH_CONTENT);
			ps.setString(1, category);
			ps.setString(2, "%"+title+"%");
			rs = ps.executeQuery();
			while(rs.next()){
				String[] time = rs.getString("time_posted").split("/");
				System.out.println("time:" +time[0]);
				if(today.equals(time[0])){
					time_posted = time[1];
				}else{
					time_posted = time[0];
				}
				
				blist.add(new BoardVO(rs.getInt("no"),
									 rs.getString("title"),
									 rs.getString("writer"),
									 time_posted,
									 rs.getInt("recommand"),
									 rs.getInt("hits"),
									 rs.getString("category")));
			}
		}finally{
			closeAll(ps, conn);
		}
		return blist;
	}
	public ArrayList<BoardVO> ShowContents(String category) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardVO> blist = new ArrayList<BoardVO>();
		Date day = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		String today = sdf.format(day);
		System.out.println(today);
		String time_posted = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_CATEGORY_ALL_CONTENT);
			ps.setString(1, category);
			rs = ps.executeQuery();
			while(rs.next()){
				String[] time = rs.getString("time_posted").split("/");
				System.out.println("time:" +time[0]);
				if(today.equals(time[0])){
					time_posted = time[1];
				}else{
					time_posted = time[0];
				}
				
				blist.add(new BoardVO(rs.getInt("no"),
									 rs.getString("title"),
									 rs.getString("writer"),
									 time_posted,
									 rs.getInt("recommand"),
									 rs.getInt("hits"),
									 rs.getString("category")));
			}
		}finally{
			closeAll(ps, conn);
		}
		return blist;
	}
	public BoardVO ShowAContent(int no) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardVO bvo = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SELECT_CATEGORY_SHOW_CONTENT);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next()){
				bvo=new BoardVO(no,
								rs.getString("title"),
								rs.getString("writer"),
								rs.getString("time_posted"),
								rs.getInt("recommand"),
								rs.getInt("hits"),
								rs.getString("link"),
								rs.getString("content"),
								rs.getString("id"),
								rs.getString("category"));
			}
		}finally{
			closeAll(ps, conn);
		}
		return bvo;
	}
	public void updateHits(int no) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.UPDATE_HITS);
			ps.setInt(1, no);
			if(ps.executeUpdate()!=0)
				System.out.println("조회수 증가");
		}finally{
			closeAll(ps, conn);
		}
		
	}
	public void updateRecommend(int no) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.UPDATE_RECOMMAND);
			ps.setInt(1, no);
			if(ps.executeUpdate()!=0)
				System.out.println("추천수 증가");
		}finally{
			closeAll(ps, conn);
		}
	}
	public ArrayList<BoardVO> showAllContents() throws SQLException{
		ArrayList<BoardVO> clist = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Date day = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		String today = sdf.format(day);
		System.out.println(today);
		String time_posted = null;
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SHOW_ALL_CONTENTS);
			rs = ps.executeQuery();
			while(rs.next()){
				String[] time = rs.getString("time_posted").split("/");
				System.out.println("time:" +time[0]);
				if(today.equals(time[0])){
					time_posted = time[1];
				}else{
					time_posted = time[0];
				}
				
				clist.add(new BoardVO(rs.getInt("no"),
									 rs.getString("title"),
									 rs.getString("writer"),
									 time_posted,
									 rs.getInt("recommand"),
									 rs.getInt("hits"),
									 rs.getString("category")));
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return clist;
	}
	public MemberVO searchMember(String id) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		
		try{
			conn=getConnection();
			ps = conn.prepareStatement(StringQuery.SEARCH_MEMBER);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				vo = new MemberVO(rs.getString("id"),rs.getString("password"));
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return vo;
	}
	
	
	
//	public static void main(String[] arg) throws Exception{
//		BoardDao.getInstance().registerMember(new MemberVO("111", "111", "111", "111", "111"));
//		BoardDao.getInstance().registerMember(new MemberVO("222", "222", "222", "222", "222"));
//		System.out.println(BoardDao.getInstance().idExist("111"));
//		System.out.println(BoardDao.getInstance().ssnExist("111"));
//		System.out.println(BoardDao.getInstance().login("111", "111"));
//		System.out.println(BoardDao.getInstance().searchID("111", "111"));
//		System.out.println(BoardDao.getInstance().searchPass("111", "111", "111"));
//		System.out.println(BoardDao.getInstance().modifyMemberInfo(new MemberVO("111", "111", "333", "222")));
//		BoardDao.getInstance().insertContent(new BoardVO("111", "111", 0, 0, "111", "111", "111", "111")); 
//		BoardDao.getInstance().insertContent(new BoardVO("222", "222", 0, 0, "222", "222", "222", "222")); 
//		BoardDao.getInstance().updateContent(new BoardVO(1, "222", "333", "444", "111"));
//		BoardDao.getInstance().deleteContent(1);
//		ArrayList<BoardVO> list = BoardDao.getInstance().searchContentByCategory("111", "111");
//		for(BoardVO vo : list){
//			System.out.println(vo);
//		}
//		
//	}
}

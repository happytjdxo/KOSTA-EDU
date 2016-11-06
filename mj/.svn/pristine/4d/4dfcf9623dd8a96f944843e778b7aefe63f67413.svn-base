package org.kosta.ohanza.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kosta.ohanza.model.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;

public class TypeBoardDAOImpl implements TypeBoardDAO{
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public BoardDTO getBoard(BoardDTO boardDTO) throws SQLException {
		return sqlSession.selectOne("TypeBoard.type_getBoard", boardDTO);
	}
	@Override
	public void writeBoard(BoardDTO boardDTO) throws SQLException {
		
		sqlSession.insert("TypeBoard.type_writeBoard", boardDTO);
	}
	@Override
	public void updateBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TypeBoard.type_updateBoard",boardDTO);
	}
	@Override
	public void deleteBoard(int no) throws SQLException {
		sqlSession.delete("TypeBoard.type_deleteBoard",no);
	}
	@Override
	public List<BoardDTO> searchBy_Title(String title) throws SQLException {
		return sqlSession.selectList("TypeBoard.type_searchBy_Title", title);
	}
	@Override
	public List<BoardDTO> searchBy_Writer(String nickName) throws SQLException {
		return sqlSession.selectList("TypeBoard.type_searchBy_Writer", nickName);
	} 	
	@Override
	public List<BoardDTO> searchMyText(String ssn) throws SQLException {
		return sqlSession.selectList("TypeBoard.searchMyText", ssn);
	}
	@Override
	public List<BoardDTO> searchBy_Category(String category) throws SQLException {
		return sqlSession.selectList("TypeBoard.searchBy_Category", category);
	}
	@Override
	public List<BoardDTO> bestOfBest() throws SQLException {
		return sqlSession.selectList("TypeBoard.type_bestOfBest");
	}
	@Override
	public void likeBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TypeBoard.type_likeBoard", boardDTO);
	}
	@Override
	public void hateBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TypeBoard.type_hateBoard",boardDTO);
	}
	@Override
	public List<BoardDTO> getBoardList() throws SQLException {
		return sqlSession.selectList("TypeBoard.type_getBoardList");
	}
}

package org.kosta.ohanza.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kosta.ohanza.model.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;

public class Tip_BoardDAOImpl implements Tip_BoardDAO{

	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public BoardDTO getBoard(int no) throws SQLException {
		return sqlSession.selectOne("TipBoard.tip_getBoard", no);
	}

	@Override
	public void writeBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.insert("TipBoard.tip_writeBoard", boardDTO);

	}

	@Override
	public void updateBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TipBoard.tip_updateBoard", boardDTO);

	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		sqlSession.delete("TipBoard.tip_deleteBoard", no);
	}

	@Override
	public List<BoardDTO> searchBy_Title(String title) throws SQLException {
		return sqlSession.selectList("TipBoard.tip_searchBy_Title", title);
		
	}

	@Override
	public List<BoardDTO> searchBy_Writer(String nickName) throws SQLException {
		return sqlSession.selectList("TipBoard.tip_searchBy_Writer", nickName);
	}

	@Override
	public List<BoardDTO> searchMyText(String ssn) throws SQLException {
		return sqlSession.selectList("TipBoard.tip_searchMyText", ssn);
	}

	@Override
	public List<BoardDTO> searchBy_Category(String category)
			throws SQLException {
		return sqlSession.selectList("TipBoard.tip_searchBy_Category", category);
	}

	@Override
	public List<BoardDTO> bestOfBest() throws SQLException {
		return sqlSession.selectList("TipBoard.tip_bestOfBest");
	}

	@Override
	public void likeBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TipBoard.tip_likeBoard", boardDTO);
	}

	@Override
	public void hateBoard(BoardDTO boardDTO) throws SQLException {
		sqlSession.update("TipBoard.tip_hateBoard", boardDTO);
	}

	@Override
	public List<BoardDTO> getBoardList() throws SQLException {
		return sqlSession.selectList("TipBoard.tip_getBoardList");
	}

	@Override
	public void updateCount(String no) throws SQLException {
		sqlSession.update("TipBoard.updateCount", no);
		
	}
}

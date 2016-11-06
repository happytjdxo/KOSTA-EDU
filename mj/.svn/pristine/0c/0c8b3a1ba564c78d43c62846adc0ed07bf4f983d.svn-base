package org.kosta.ohanza.dao;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.model.TodayMenuDTO;
import org.mybatis.spring.SqlSessionTemplate;

public class TodayMenuDAOImpl implements TodayMenuDAO{
	private SqlSessionTemplate sqlSession;
	
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int writeBoard(TodayMenuDTO todayDTO) throws SQLException {
		return sqlSession.insert("TodayMenuBoard.writeBoard", todayDTO);
	}

	@Override
	public void updateBoard(TodayMenuDTO todayDTO) throws SQLException {
		sqlSession.update("TodayMenuBoard.updateBoard", todayDTO);
	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		sqlSession.delete("TodayMenuBoard.deleteBoard", no);
	}

	@Override
	public List<TodayMenuDTO> getBoard(TodayMenuDTO todayDTO)
			throws SQLException {
		return sqlSession.selectList("TodayMenuBoard.getBoard", todayDTO);
	}

}

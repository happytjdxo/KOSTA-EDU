package org.kosta.ohanza.service;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.dao.TodayMenuDAO;
import org.kosta.ohanza.model.TodayMenuDTO;

public class TodayMenuServiceImpl implements TodayMenuService {

	private TodayMenuDAO todayMenuDAO;
	
	public void setTodayMenuDAO(TodayMenuDAO todayMenuDAO) {
		this.todayMenuDAO = todayMenuDAO;
	}

	@Override
	public int writeBoard(TodayMenuDTO todayDTO) throws SQLException {
		return todayMenuDAO.writeBoard(todayDTO);
	}

	@Override
	public void updateBoard(TodayMenuDTO todayDTO) throws SQLException {
		todayMenuDAO.updateBoard(todayDTO);
	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		todayMenuDAO.deleteBoard(no);
	}

	@Override
	public List<TodayMenuDTO> getBoard(TodayMenuDTO todayDTO)
			throws SQLException {
		return todayMenuDAO.getBoard(todayDTO);
	}

}

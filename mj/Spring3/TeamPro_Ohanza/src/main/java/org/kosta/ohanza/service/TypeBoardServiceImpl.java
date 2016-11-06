package org.kosta.ohanza.service;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.dao.BoardDAO;
import org.kosta.ohanza.dao.TypeBoardDAO;
import org.kosta.ohanza.model.BoardDTO;

public class TypeBoardServiceImpl implements TypeBoardService{
	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	@Override
	public BoardDTO getBoard(int no) throws SQLException {
		return boardDAO.getBoard(no);
	}

	@Override
	public void writeBoard(BoardDTO boardDTO) throws SQLException {
		boardDAO.writeBoard(boardDTO);
	}

	@Override
	public void updateBoard(BoardDTO boardDTO) throws SQLException {
		boardDAO.updateBoard(boardDTO);
	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		boardDAO.deleteBoard(no);
	}

	@Override
	public List<BoardDTO> searchBy_Title(String title) throws SQLException {
		return boardDAO.searchBy_Title(title);
	}

	@Override
	public List<BoardDTO> searchBy_Writer(String nickName) throws SQLException {
		return boardDAO.searchBy_Writer(nickName);
	}

	@Override
	public List<BoardDTO> searchMyText(String ssn) throws SQLException {
		return boardDAO.searchMyText(ssn);
	}

	@Override
	public List<BoardDTO> searchBy_Category(String category)
			throws SQLException {
	
		return boardDAO.searchBy_Category(category);
	}

	@Override
	public List<BoardDTO> bestOfBest() throws SQLException {
		return boardDAO.bestOfBest();
	}

	@Override
	public void likeBoard(BoardDTO boardDTO) throws SQLException {
		boardDAO.likeBoard(boardDTO);
	}

	@Override
	public void hateBoard(BoardDTO boardDTO) throws SQLException {
		boardDAO.hateBoard(boardDTO);
		
	}

	@Override
	public List<BoardDTO> getBoardList() throws SQLException {
		return boardDAO.getBoardList();
	}

	@Override
	public void updateCount(String no) throws SQLException {
		boardDAO.updateCount(no);
		
	}
}
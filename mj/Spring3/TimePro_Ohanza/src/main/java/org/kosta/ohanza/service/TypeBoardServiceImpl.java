package org.kosta.ohanza.service;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.dao.TypeBoardDAO;
import org.kosta.ohanza.model.BoardDTO;

public class TypeBoardServiceImpl implements TypeBoardService{
	private TypeBoardDAO typeBoardDAO;

	public void setTypeBoardDAO(TypeBoardDAO typeBoardDAO) {
		this.typeBoardDAO = typeBoardDAO;
	}

	@Override
	public BoardDTO getBoard(BoardDTO boardDTO) throws SQLException {
		return typeBoardDAO.getBoard(boardDTO);
	}

	@Override
	public void writeBoard(BoardDTO boardDTO) throws SQLException {
		typeBoardDAO.writeBoard(boardDTO);
	}

	@Override
	public void updateBoard(BoardDTO boardDTO) throws SQLException {
		typeBoardDAO.updateBoard(boardDTO);
	}

	@Override
	public void deleteBoard(int no) throws SQLException {
		typeBoardDAO.deleteBoard(no);
	}

	@Override
	public List<BoardDTO> searchBy_Title(String title) throws SQLException {
		return typeBoardDAO.searchBy_Title(title);
	}

	@Override
	public List<BoardDTO> searchBy_Writer(String nickName) throws SQLException {
		return typeBoardDAO.searchBy_Writer(nickName);
	}

	@Override
	public List<BoardDTO> searchMyText(String ssn) throws SQLException {
		return typeBoardDAO.searchMyText(ssn);
	}

	@Override
	public List<BoardDTO> searchBy_Category(String category) throws SQLException {
		return typeBoardDAO.searchBy_Category(category);
	}

	@Override
	public List<BoardDTO> bestOfBest() throws SQLException {
		return typeBoardDAO.bestOfBest();
	}

	@Override
	public void likeBoard(BoardDTO boardDTO) throws SQLException {
		typeBoardDAO.likeBoard(boardDTO);
	}

	@Override
	public void hateBoard(BoardDTO boardDTO) throws SQLException {
		typeBoardDAO.hateBoard(boardDTO);
	}

	@Override
	public List<BoardDTO> getBoardList() throws SQLException {
		return typeBoardDAO.getBoardList();
	}
}
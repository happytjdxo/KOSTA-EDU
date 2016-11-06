package org.kosta.ohanza.service;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.model.BoardDTO;

public interface BoardService {
	
	public BoardDTO getBoard(int no)throws SQLException;
	
	public void writeBoard(BoardDTO boardDTO)throws SQLException;
	
	public void updateBoard(BoardDTO boardDTO)throws SQLException;
	
	public void deleteBoard(int no)throws SQLException;
	
	public List<BoardDTO> searchBy_Title(String title)throws SQLException;
	
	public List<BoardDTO> searchBy_Writer(String nickName)throws SQLException;
	
	public List<BoardDTO> searchMyText(String ssn)throws SQLException;
	
	public List<BoardDTO> searchBy_Category(String category)throws SQLException;
	
	public List<BoardDTO> bestOfBest()throws SQLException;
	
	public void likeBoard(BoardDTO boardDTO)throws SQLException;
	
	public void hateBoard(BoardDTO boardDTO)throws SQLException;
	
	public List<BoardDTO> getBoardList()throws SQLException;
	
	public void updateCount(String no) throws SQLException;
}

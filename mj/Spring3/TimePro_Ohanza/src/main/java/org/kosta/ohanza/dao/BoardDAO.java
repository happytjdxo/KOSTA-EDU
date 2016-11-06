package org.kosta.ohanza.dao;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.model.BoardDTO;

public interface BoardDAO {
	public BoardDTO getBoard(BoardDTO boardDTO) throws SQLException; // 글 보기
	public void writeBoard(BoardDTO boardDTO) throws SQLException; // 글 쓰기
	public void updateBoard(BoardDTO boardDTO) throws SQLException; // 글 수정
	public void deleteBoard(int no) throws SQLException; // 글 삭제
	public List<BoardDTO> searchBy_Title(String title) throws SQLException; // 게시글 검색
	public List<BoardDTO> searchBy_Writer(String nickName) throws SQLException; // 작성자 검색
	public List<BoardDTO> searchMyText(String ssn) throws SQLException; // 내가쓴글 검색
	public List<BoardDTO> searchBy_Category(String category) throws SQLException; // 카테고리별 검색
	public List<BoardDTO> bestOfBest() throws SQLException; // 인기글 선정
	public void likeBoard(BoardDTO boardDTO) throws SQLException; // 글 추천
	public void hateBoard(BoardDTO boardDTO) throws SQLException; // 글 반대
	public List<BoardDTO> getBoardList() throws SQLException; // 목록
}

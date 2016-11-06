package org.kosta.ohanza.service;

import java.sql.SQLException;
import java.util.List;

import org.kosta.ohanza.model.TodayMenuDTO;

public interface TodayMenuService {
	public int writeBoard(TodayMenuDTO todayDTO) throws SQLException; // 게시판 글 작성
	public void updateBoard(TodayMenuDTO todayDTO) throws SQLException; // 게시판 글 수정
	public void deleteBoard(int no) throws SQLException; // no(pk)로 글 삭제
	public List<TodayMenuDTO> getBoard(TodayMenuDTO todayDTO) throws SQLException; // 모든 todaymenu 불러오기
}

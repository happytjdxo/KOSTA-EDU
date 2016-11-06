package org.kosta.ohanza.dao;

import java.sql.SQLException;

import org.kosta.ohanza.model.MemberDTO;

public interface MemberDAO {
	
	//회원 가입 관련
	public void registerMember(MemberDTO memberDTO) throws SQLException;
	public Object idCheck(String id) throws SQLException;
			// passwordCheck는 jquery에서.
	public Object nickNameCheck(String nickName) throws SQLException;
	
	//로그인 관련
	public MemberDTO login(MemberDTO memberDTO) throws SQLException;
	public String findId(String ssn) throws SQLException;
	public String findPassword(MemberDTO memberDTO) throws SQLException;
		//logout은, 컨트롤러에서.
	
	//기타 기능
	public void updateMember(MemberDTO memberDTO) throws SQLException;
	public int deleteMember(String ssn) throws SQLException;
}

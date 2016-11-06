package org.kosta.ohanza.service;

import java.sql.SQLException;

import org.kosta.ohanza.dao.MemberDAO;
import org.kosta.ohanza.model.MemberDTO;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) throws SQLException{
		this.memberDAO = memberDAO;
	}

	@Override
	public void registerMember(MemberDTO memberDTO) throws SQLException{
		memberDTO.setGrade("1"); // 기본적으로 grade를 1로 고정. 관리자는 프롬프트창으로 0으로 직접 만들자.
		memberDAO.registerMember(memberDTO);
	}

	@Override
	public boolean idCheck(String id) throws SQLException{
		boolean result = false;
		if(memberDAO.idCheck(id) != null){
			result = true;
		}
		return result;
	}

	@Override
	public boolean nickNameCheck(String nickName) throws SQLException {
		boolean result = false;
		if(memberDAO.nickNameCheck(nickName) != null){
			result = true;
		}
		return result;
	}

	@Override
	public MemberDTO login(MemberDTO memberDTO) throws SQLException{
		return memberDAO.login(memberDTO);
	}

	@Override
	public String findId(String ssn) throws SQLException{
		return memberDAO.findId(ssn);
	}

	@Override
	public String findPassword(MemberDTO memberDTO) throws SQLException{
		return memberDAO.findPassword(memberDTO);
	}

	@Override
	public void updateMember(MemberDTO memberDTO) throws SQLException{
		memberDAO.updateMember(memberDTO);
	}

	@Override
	public int deleteMember(String ssn) throws SQLException{
		return memberDAO.deleteMember(ssn);
	}
}

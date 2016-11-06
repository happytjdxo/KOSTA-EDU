package org.kosta.ohanza.dao;

import java.sql.SQLException;

import org.kosta.ohanza.model.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;

public class MemberDAOImpl implements MemberDAO {
	
	private SqlSessionTemplate sqlSession;
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void registerMember(MemberDTO memberDTO) throws SQLException{
		sqlSession.insert("Member.registerMember", memberDTO);
	}

	@Override
	public Object idCheck(String id) throws SQLException{
		return sqlSession.selectOne("Member.idCheck", id);
	}

	@Override
	public Object nickNameCheck(String nickName) throws SQLException{
		return sqlSession.selectOne("Member.passwordCheck",nickName);
	}

	@Override
	public MemberDTO login(MemberDTO memberDTO) throws SQLException{
		return sqlSession.selectOne("Member.login", memberDTO);
	}

	@Override
	public String findId(String ssn) throws SQLException{
		return sqlSession.selectOne("Member.findId", ssn);
	}

	@Override
	   public String findPassword(MemberDTO memberDTO) throws SQLException{
	      MemberDTO mDTO= sqlSession.selectOne("Member.findPassword", memberDTO);
	      return mDTO.getPassword();
	   }
	@Override
	public void updateMember(MemberDTO memberDTO) throws SQLException{
		sqlSession.update("Member.updateMember",memberDTO);
	}

	@Override
	public int deleteMember(String ssn) throws SQLException{
		return sqlSession.delete("Member.deleteMember", ssn);
	}

}

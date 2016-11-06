package model;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDaoImpl implements MemberDao{
	
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public MemberVO login(MemberVO vo) throws SQLException {
		return sqlSession.selectOne("login", vo);
	}

	@Override
	public void updateMember(MemberVO vo) throws SQLException {
		int row = sqlSession.update("updateMember", vo);
		System.out.println(row + "line succeeded.");
	}

	@Override
	public List<String> getAddressKind() throws SQLException {
		return sqlSession.selectList("getAddressKind");
	}

	@Override
	public List<MemberVO> findByAddress(String address) throws SQLException {
		return sqlSession.selectList("findByAddress", address);
	}

	@Override
	public void registerMember(MemberVO vo) throws SQLException {
		sqlSession.insert("registerMember", vo);
	}

	@Override
	public Object idcheck(String id) throws SQLException {
		Object obj = sqlSession.selectOne("idcheck", id);
		return obj;
	}

	@Override
	public List<MemberVO> getAllMember() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}













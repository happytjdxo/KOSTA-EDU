package jdbc2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.sun.rowset.internal.Row;
/*
 * JdbcTemplate ::
 * Spring jdbc Framework���� ���� �ٽ����� Ŭ����
 * org.springframework.jdbc.core> ���� �����ȴ�.
 * �����ڷ� DataSource�� ���Թް� �ִ�.
 * �������� �����ϴ� ������ ��ü������ ������ �ְ�
 * JdbcTemplate�� �̿��ϸ� jdbc workflow 4�ܰ�� �ٿ��� ������ �۾��� �Ҽ� �ִ�.
 * 
 * ������ ���� ��� :
 * update(spl) : insert, delete, update ���� �������� �����Ѵ�.
 * query(spl), queryForList(sql) : select
 * queryForObject(sql)
 */
/*
 * JdbcTemplate ::
 * Spring jdbc Framework���� ���� �ٽ����� Ŭ����
 * org.springframework.jdbc.core> ���� �����ȴ�.
 * �����ڷ� DataSource�� ���Թް� �ִ�.
 * �������� �����ϴ� ������ ��ü������ ������ �ְ�
 * JdbcTemplate�� �̿��ϸ� jdbc workflow 4�ܰ�� �ٿ��� ������ �۾��� �Ҽ� �ִ�.
 * 
 * ������ ���� ��� :
 * update(spl) : insert, delete, update ���� �������� �����Ѵ�.
 * query(spl), queryForList(sql) : select
 * queryForObject(sql)
 */
/*
 * JdbcTemplate ::
 * Spring jdbc Framework���� ���� �ٽ����� Ŭ����
 * org.springframework.jdbc.core> ���� �����ȴ�.
 * �����ڷ� DataSource�� ���Թް� �ִ�.
 * �������� �����ϴ� ������ ��ü������ ������ �ְ�
 * JdbcTemplate�� �̿��ϸ� jdbc workflow 4�ܰ�� �ٿ��� ������ �۾��� �Ҽ� �ִ�.
 * 
 * ������ ���� ��� :
 * update(spl) : insert, delete, update ���� �������� �����Ѵ�.
 * query(spl), queryForList(sql) : select
 * queryForObject(sql)
 */
/*
 * JdbcTemplate ::
 * Spring jdbc Framework���� ���� �ٽ����� Ŭ����
 * org.springframework.jdbc.core> ���� �����ȴ�.
 * �����ڷ� DataSource�� ���Թް� �ִ�.
 * �������� �����ϴ� ������ ��ü������ ������ �ְ�
 * JdbcTemplate�� �̿��ϸ� jdbc workflow 4�ܰ�� �ٿ��� ������ �۾��� �Ҽ� �ִ�.
 * 
 * ������ ���� ��� :
 * update(spl) : insert, delete, update ���� �������� �����Ѵ�.
 * query(spl), queryForList(sql) : select
 * queryForObject(sql)
 */
public class MemberDaoImpl extends JdbcDaoSupport implements MemberDao{
	
	/*private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	///// �����Ͻ� ���� /////
	@Override
	public void register(MemberVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO member VALUES(");
		sql.append("?, ?, ?, ?)");
		
		Object[ ] param = {vo.getId(), vo.getName(), vo.getPassword(), vo.getAddress() };
		getJdbcTemplate().update(sql.toString(), param);
	}

	@Override
	public List<MemberVO> getList() {
		String sql = "SELECT * FROM member";
		
		RowMapper<MemberVO> mapper = 
				new BeanPropertyRowMapper<MemberVO>(MemberVO.class);
		return getJdbcTemplate().query(sql, mapper);
	}

	@Override
	public MemberVO getSearch(String id) {
		String sql = "SELECT * FROM member WHERE id = ?";
		Object[ ] param = {id};
		
		RowMapper<MemberVO> mapper = 
				new BeanPropertyRowMapper<MemberVO>(MemberVO.class);
		
		return getJdbcTemplate().queryForObject(sql, mapper,param);
	}
}

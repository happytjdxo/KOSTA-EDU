package com.a.c;

import java.io.Reader;

import model.MemberDao;
import model.MemberDaoImpl;
import model.MemberVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;

public class MemberTest {
	public static void main(String[] args) throws Exception{
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		
		MemberVO vo  = new MemberVO("chlfks126", "최란바보", "1234", "안양");
		
		MemberDaoImpl dao = new MemberDaoImpl();
		/*dao.setSqlSession(session);
		
    	dao.registerMember(vo);
    	
		vo.setAddress("강남");
    	dao.updateMember(vo);
    	
       System.out.println(	dao.idcheck(vo.getId()));
       
       System.out.println(dao.findByAddress(vo.getAddress()));
    	
       System.out.println(dao.getAddressKind());
       
       System.out.println(dao.getAllMember());
		
		System.out.println("update :: "+dao.updateMember(vo);("Member.updateMember",vo));
		session.commit();
		
		System.out.println("idcheck ::"+dao.selectOne("Member.idcheck" , vo.getId()));
		session.commit();
		
		System.out.println("login ::"+dao.selectOne("Member.login", vo));
		session.commit();
		
		System.out.println("findByAddress ::"+dao.selectList("Member.findByAddress",vo.getAddress()));
		session.commit();*/
		
		/*System.out.println("getAddressKind ::"+dao.selectList("Member.getAddressKind"));
		session.commit();
		System.out.println(dao.getAddressKind());
		System.out.println("getAllMember ::"+dao.selectList("Member.getAllMember"));
		session.commit();*/
		
		
		
	}

}

package org.kosta.ohanza.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kosta.ohanza.model.BoardDTO;
import org.kosta.ohanza.model.MemberDTO;

public class OhanzaAppTest {
	public static void main(String[] args) throws Exception {
		Reader reader = Resources.getResourceAsReader("conf/SqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		
		/*	List<MemberDTO> list = session.selectList("member.findAll");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		
		/*MemberDTO memberDTO = new MemberDTO("9205061052688", "choikw", "kwkw92", "최관우", "경기도", "과누", "남자", "1등급");
		session.insert("Member.registerMember", memberDTO);
		session.commit();*/
		
		List<BoardDTO> list = session.selectList("Board.findAll");
	
		for(BoardDTO dto : list){
			System.out.println(dto);
		}
	}
}

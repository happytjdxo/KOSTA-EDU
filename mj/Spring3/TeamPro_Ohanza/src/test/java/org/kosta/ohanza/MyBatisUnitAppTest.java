package org.kosta.ohanza;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kosta.ohanza.dao.Tip_BoardDAOImpl;
import org.kosta.ohanza.model.BoardDTO;
import org.kosta.ohanza.model.MemberDTO;
import org.kosta.ohanza.service.Tip_BoardServiceImpl;

public class MyBatisUnitAppTest {

	public static void main(String[] args) throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();

		Tip_BoardDAOImpl dao = new Tip_BoardDAOImpl();
		dao.setSqlSession(session);

		Tip_BoardServiceImpl service = new Tip_BoardServiceImpl();
		service.setBoardDAO(dao);
		
		 /* session.insert("Member.registerMember", new
		  MemberDTO("921123-2207112", "eung", "1234", "김은지", "분당구", "eung",
		  "여", "1")); session.commit();*/
		 

		/*BoardDTO boardDTO = new BoardDTO(0, "두번째글", "test", 0, null, null,
				null, "tip", 3, 3, new MemberDTO("921123-2207112"));*/

		
		// service.writeBoard(boardDTO); session.commit();
		 

		//System.out.println(service.getBoard(boardDTO));

		service.updateBoard(new BoardDTO(5, "첫번째글3", "test3", 1, null, null,
				null, "tip", 1, 1, new MemberDTO("921123-2207112")));
		session.commit();

		/*service.deleteBoard(4);
		session.commit();*/
		
		//System.out.println(service.searchBy_Title("첫번째글"));
		
		//System.out.println(service.searchBy_Writer("eung"));
		
		//System.out.println(service.searchBy_Category("tip"));
		
		//System.out.println(service.searchMyText("921123-2207112"));
		
		//System.out.println(service.bestOfBest());
		
		//service.likeBoard(new BoardDTO(5, "첫번째글2", "test2", 1, null, null,
		//		null, "tip", 1, 1, new MemberDTO("921123-2207112")));
		//session.commit();
		
		System.out.println(service.getBoardList());
	}
}

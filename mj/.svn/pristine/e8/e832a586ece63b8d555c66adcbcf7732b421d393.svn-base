package org.kosta.ohanza;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kosta.ohanza.dao.TypeBoardDAOImpl;
import org.kosta.ohanza.model.BoardDTO;
import org.kosta.ohanza.model.MemberDTO;
import org.kosta.ohanza.service.TypeBoardServiceImpl;

public class Membertest {
	public static void main(String[] args) throws Exception {
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();

		TypeBoardDAOImpl dao = new TypeBoardDAOImpl();
		dao.setSqlSession(session);

		TypeBoardServiceImpl service = new TypeBoardServiceImpl();
		service.setTypeBoardDAO(dao);
		MemberDTO mdto = new MemberDTO();
		mdto.setSsn("921119-2");
		BoardDTO dto = new BoardDTO(4, "test", "It tis test", "11.23", "ㅎㅇ",
				"ㅎㅇㅎㅇ", "~동", 0, 0, 0, mdto);
		 System.out.println(dto);
		//System.out.println();
		// dao.writeBoard(dto);
		// session.commit();

		/*
		 * service.updateBoard(new BoardDTO(4, "첫번째글2", "test2", null, null,
		 * null, "~동", 0, 1,1, new MemberDTO("921119-2"))); session.commit();
		 */
		// service.deleteBoard(4);

		// System.out.println(service.searchBy_Category("~동"));
		// System.out.println(service.searchBy_Title("test"));
		// System.out.println(service.searchBy_Writer("라니짱"));
		// System.out.println(service.searchMyText("921119-2"));
		// service.likeBoard(new BoardDTO(5, "test", "It is test", null, null,
		// null, null, 0, 0, 0, new MemberDTO("921119-2")));
		// service.hateBoard(new BoardDTO(5, "test", "It is test", null, null,
		// null, null, 0, 0, 0, new MemberDTO("921119-2")));
		// System.out.println(service.getBoardList());
		//System.out.println(service.bestOfBest());
		session.commit();
	}
}
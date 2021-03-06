package controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utill.Path;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.BoardDao;
import model.BoardVO;
import model.MemberVO;

public class WriteController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		String uploadPath = Path.FILE_PATH;
	
		
		System.out.println(uploadPath);
	    int size = 10 * 1024 * 1024;
	    String name         = "";
	    String fileName     = "";
	    String origFileName = "";
	    
	    
	        MultipartRequest req = new MultipartRequest(request,
	                uploadPath,size,"utf-8",new DefaultFileRenamePolicy());  //COS라이브러리가 제공하는 업로드 클레스이다.
	               //DefaultFileRenamePolicy()메서드는 파일이름이 중복될경우 test1과 같이 파일 이름을 rename해주는 역할을 한다.
	       
	        
	       Enumeration files = req.getFileNames();  //전송된 파일 타입의 파라미터 이름들을 Enumeration타입으로 반환한다.

	      //  Enumeration은 객체타입을 저장하는 것으로서 형변환이 없이 객체 타입을 자유롭게 저장하고 꺼내기 위해서 사용한다. 
	        
	        String file = (String)files.nextElement();
	        fileName = req.getFilesystemName(file);
	        origFileName = req.getOriginalFileName(file);
	        
	        System.out.println("name : " + name);
	        System.out.println("fileName : " + fileName);
	        System.out.println("origFileName : " + origFileName);
	       
		MemberVO member = (MemberVO)request.getSession().getAttribute("loginMember");
		
		
		
		
		
		
		
		System.out.println(member);
		String title = req.getParameter("title");
		String writer = member.getNickname();
		String link = fileName;
		String content = req.getParameter("content");
		System.out.println("컨텐트"+content);
		String id = member.getId();
		String category = req.getParameter("category");
		BoardVO bvo = new BoardVO(title, writer, link, content, id, category);
		
		BoardDao.getInstance().insertContent(bvo);
		
		String path = "showContent.do?no="+bvo.getNo();
		
		return new ModelAndView(path,true);
		
	}

}

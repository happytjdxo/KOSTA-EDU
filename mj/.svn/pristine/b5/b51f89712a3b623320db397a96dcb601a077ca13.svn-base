package controller;
//Controller를 생성하는 공장
public class HandlerMapping {
	private static HandlerMapping handler = new HandlerMapping();

	private HandlerMapping() {
	}
	public static HandlerMapping getInstance(){
		return handler;
	}
	
	public Controller createController(String command){
		Controller controller = null;
		if(command.equals("register.do")){
			controller = new RegisterController();
			System.out.println("RegisterController 생성됨....");
		}else if(command.equals("login.do")){
			controller = new LoginController();
			System.out.println("LoginController 생성됨....");
		}else if(command.equals("main.do")){
			controller = new MainController();
			System.out.println("MainController 생성됨....");
		}else if(command.equals("showContent.do")){
			controller = new ShowContentController();
			System.out.println("ShowContentController 생성됨....");
		}else if(command.equals("updateMember.do")){
	         controller = new UpdateMemberController();
	         System.out.println("UpdateMemberController 생성됨....");
	    }else if(command.equals("searchId.do")){
	         controller = new SearchIdController();
	         System.out.println("SearchIdController 생성됨....");
	    }else if(command.equals("searchPass.do")){
	          controller = new SearchPassController();
	          System.out.println("SearchPassController 생성됨....");
	    }else if(command.equals("write.do")){
	          controller = new WriteController();
	          System.out.println("WriteController 생성됨....");
	    }else if(command.equals("searchContent.do")){
	          controller = new SearchContentController();
	          System.out.println("SearchContentController 생성됨....");
	    }else if(command.equals("logout.do")){
	          controller = new LogoutController();
	          System.out.println("LogoutController 생성됨....");
	    }else if(command.equals("updateRecommand.do")){
	          controller = new UpdateRecommandController();
	          System.out.println("UpdateRecommandController 생성됨....");
	    }else if(command.equals("deletePass.do")){
	    	controller = new DeletePassController();
	    	System.out.println("DeletePassController 생성됨....");
	    }else if(command.equals("deleteBoard.do")){
	    	controller = new DeleteBoardController();
	    	System.out.println("DeleteBoardController 생성됨....");
	    }else if(command.equals("updateContent.do")){
	          controller = new UpdateContentController();
	          System.out.println("UpdateContentController 생성됨....");
	    }else if(command.equals("pageInfo.do")){
	    	  controller = new PageInfoController();
	    	  System.out.println("PageInfoController 생성됨....");
	    }
		
		
		return controller;
	}
}
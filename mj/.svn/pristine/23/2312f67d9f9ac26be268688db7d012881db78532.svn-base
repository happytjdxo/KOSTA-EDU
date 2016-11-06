package controller;

public class HandlerMapping {
	private static HandlerMapping mapping = new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return mapping;
	}
	public Controller createController(String command){
		
		Controller controller = null;
		
		if(command.equals("idList")){
			controller = new idListController();
		}
		if(command.equals("select")){
			controller = new SelectController();
			
		}
		
		return controller;
	}
}

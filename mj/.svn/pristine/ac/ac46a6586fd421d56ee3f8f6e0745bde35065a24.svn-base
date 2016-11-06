package broker.three.shares;
/*
 * 도시락통
 */
import java.io.Serializable;

public class Command implements Serializable{
	//비지니스 로직과 상수값의 매핑...
	public static final int BUYSHARES =10;//buyShares()
	public static final int SELLSHARES =20;
	public static final int GETALLSTOCK =30;
	public static final int GETSTOCKPRICE =40;
	public static final int GETALLCUSTOMER =50;
	public static final int GETCUSTOMER =60;
	public static final int ADDCUSTOMER =70;//addCustomer(0
	public static final int DELETECUSTOMER =80;
	public static final int UPDATECUSTOMER =90;
	
	private int commandValue;
	private String[ ] args;
	private Result results; //이건 뭘까?
	
	//이번에는 도시락 싸는 기능에 대해서 작성...DataPacking
	
	public Command(int commandValue){
		this.commandValue = commandValue;
		results = new Result();//이 2개는 도시락통이 만들어질때 함께 만들어진다.
	}

	public int getCommandValue() {
		return commandValue;
	}	
	public String[] getArgs() {
		return args;
	}
	public void setArgs(String[] args) {
		this.args = args;
	}
	public Result getResults() {
		return results;
	}
	public void setResults(Result results) {
		this.results = results;
	}
}












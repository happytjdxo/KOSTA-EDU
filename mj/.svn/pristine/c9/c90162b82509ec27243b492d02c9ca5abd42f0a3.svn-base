package broker.twotier.vo;

import java.util.Vector;
/*
 * 고객에 대한 정보를 저장하는 Record Class..
 * 1) 주식을 보유하고 있지 않는 고객
 * 2) 주식을 보유하는 고객
 */
public class CustomerRec {
	// 주식 미보유 고객
	private String name;	//cust_name
	private String address; 
	private String ssn; 
	
	// 주식 보유 고객
	private Vector<SharesRec> portfolio;

	public CustomerRec(String name, String address, String ssn,
			Vector<SharesRec> portfolio) {
		super();
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.portfolio = portfolio;
	}

	public CustomerRec(String name, String address, String ssn) {
		super();
		this.name = name;
		this.address = address;
		this.ssn = ssn;
	}

	public CustomerRec(String ssn) {
		this(ssn,"","");
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Vector<SharesRec> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Vector<SharesRec> portfolio) {
		this.portfolio = portfolio;
	}

	@Override
	public String toString() {
		return "CustomerRec [ssn=" + ssn + ", name=" + name + ", address="
				+ address + ", portfolio=" + portfolio + "]";
	}
	
}

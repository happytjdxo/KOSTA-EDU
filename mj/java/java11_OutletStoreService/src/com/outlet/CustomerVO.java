package com.outlet;

import com.outlet.vo.ProductVO;
/*
 * 고객에 대한 정보를 담고 있는 VO 클래스..
 * Outlet에서 상품을 구매하는 소비자에 대한 정보를 담고 있는 클래스..
 */
public class CustomerVO {
	private String ssn;	//주민번호
	private String name;
	private String addr;
	private int tel;

	//Hasing :: 특정 고객이 여러개의 상품을 구매할 수 있어야 한다,
	ProductVO[] products;

	public CustomerVO(String ssn, String name, String addr, int tel) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	// 상품에 대한 주입의 등록,,
	public void buyProduct(ProductVO[] products){
		this.products = products;
	}
	public ProductVO[] getProduct(){
		return products;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public ProductVO[] getProducts() {
		return products;
	}
	public void setProducts(ProductVO[] products) {
		this.products = products;
	}
	//	나머지 field들은 생성자를 통해서 주입.
	//	addr, tel는 이후에 변경 가능성이 많은 필드이다..수정 기능을 달자.
	public void changeAddr(String addr){	// 결국은 setter
		this.addr = addr;
	}
	public void changeTel(int tel){	// 결국은 setter
		this.tel = tel;
	}
}
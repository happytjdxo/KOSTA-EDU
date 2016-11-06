package market.proj.vo;

import market.proj.service.MyDate;

public class ProductVO {
	private String productName;		//품목이름
	private String productCorp;		//제조사
	private int price;				//가격
	private int stock;				//재고
	private MyDate productDate;		//제조일자
	
	public ProductVO(String productName, String productCorp, int price,
			int stock, MyDate productDate) {
		this.productName = productName;
		this.productCorp = productCorp;
		this.price = price;
		this.stock = stock;
		this.productDate = productDate;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductCorp() {
		return productCorp;
	}
	
	public void setProductCorp(String productCorp) {
		this.productCorp = productCorp;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public MyDate getProductDate() {
		return productDate;
	}
	
	public void setProductDate(MyDate productDate) {
		this.productDate = productDate;
	}

	public String getProductInfo() {
		return "제품정보란)  품목이름 : " + productName + ", 제조사 : "
				+ productCorp + ", 가격 : " + price + ", 재고 : " + stock
				+ ", 제조일자 : " + productDate.getMyDate() ;
	}
}

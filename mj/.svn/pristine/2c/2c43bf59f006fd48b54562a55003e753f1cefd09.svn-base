package market.proj.vo;

public class CustomerVO {
	private String customerName;		//고객이름
	private char customerGender;		//고객성별
	private String customerPhoneNumber;	//고객폰넘버
	private String customerAddress;		//고객주소
	private boolean customerJoin;		//회원가입여부
	private ProductVO[] productList;	//구매한제품목록
	private int currentInt;				//구매목록의 현제 갯수
	
	public CustomerVO(String customerName, char customerGender,
			String customerPhoneNumber, String customerAddress,
			boolean customerJoin) {
		this.customerName = customerName;
		this.customerGender = customerGender;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerAddress = customerAddress;
		this.customerJoin = customerJoin;
		productList = new ProductVO[5];
		currentInt = 0;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public char getCustomerGender() {
		return customerGender;
	}
	
	public void setCustomerGender(char customerGender) {
		this.customerGender = customerGender;
	}
	
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public boolean isCustomerJoin() {
		return customerJoin;
	}
	
	public void setCustomerJoin(boolean customerJoin) {
		this.customerJoin = customerJoin;
	}
	
	public ProductVO[] getProductList(){
		return productList;
	}
	
	public void setProductList(ProductVO pvo){
		if(currentInt > 5){
			System.out.println("더이상 구매 불가.");
			return;
		}
		productList[currentInt] = pvo;
		currentInt++;
	}
	
	public String getProList(){
		String str = "";
		for(int i=0; i<currentInt; i++){
			str = str +",\n "+ productList[i].getProductInfo();
		}
		return str;
	}
	
	public String getCustomerInfo() {
		return "고객 정보란)   이름 : " + customerName + " \t성별 : "
				+ customerGender + "\n" + " \n\t고객 전화 번호 : "
				+ customerPhoneNumber + " \t고객 주소 : " + customerAddress
				+ "\n"+ "\n\t 회원 가입 여부 : " + customerJoin + " \t구매 제품 목록 : " 
				+ getProList() ;
	}
	
}

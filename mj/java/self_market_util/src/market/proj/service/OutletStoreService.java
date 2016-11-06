package market.proj.service;

import market.proj.vo.CustomerVO;
import market.proj.vo.ProductVO;


public class OutletStoreService {

	//구매 매서드 구현..
	//구매가 완료되면 CustomerVO에 ProductVO가 들어가야함...
	public void buyProduct(ProductVO p01, CustomerVO c01) {
		c01.setProductList(p01);
	}
	
}

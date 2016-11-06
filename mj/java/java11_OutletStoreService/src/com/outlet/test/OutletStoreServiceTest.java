package com.outlet.test;

import com.outlet.CustomerVO;
import com.outlet.service.OutletStoreService;
import com.outlet.util.MyDate;
import com.outlet.vo.ProductVO;

public class OutletStoreServiceTest {
	public static void main(String[] args) {
		// 1. 고객 2명 생성
		CustomerVO[] cust = {
				new CustomerVO("111", "이나영", "방배동", 123),
				new CustomerVO("111", "원빈", "방배동", 321),
		};
		// 2. ProductVO 도 2개 생성.
		ProductVO[] pros1 = {
				new ProductVO("진라면", 3000, new MyDate(2015, 5, 16), 111),
				new ProductVO("초코파이", 3000, new MyDate(2015, 4, 16), 111),
				new ProductVO("컵라면", 3000, new MyDate(2015, 6, 16), 111),
				new ProductVO("사이다", 3000, new MyDate(2015, 7, 16), 111),
				new ProductVO("콜라", 3000, new MyDate(2015, 5, 16), 111)
		};
		ProductVO[] pros2 = {
				new ProductVO("진라면", 3000, new MyDate(2015, 5, 16), 111),
				new ProductVO("초코파이", 3000, new MyDate(2015, 5, 16), 111)
		};
		OutletStoreService service = new OutletStoreService();
		// 특정 고객이 상품을 구매함
		cust[0].buyProduct(pros1);
		cust[1].buyProduct(pros2);

		// service 클래스의 기능을 호출
		service.printAllProductMaker(cust[0]);
		service.printAllCustomers(cust);
		service.getAllProduct(cust[0], pros1);

		int max = service.maxPriceProduct(cust[0], pros1);
				System.out.println(cust[0].getName()+ "님이 구입하신 물건중 최고가는");
						System.out.println(max +"원 입니다.");
	}
}
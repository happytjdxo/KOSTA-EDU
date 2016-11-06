package market.proj.test;

import market.proj.service.MyDate;
import market.proj.service.OutletStoreService;
import market.proj.vo.CustomerVO;
import market.proj.vo.ProductVO;

public class OutletStoreServiceTest {
	public static void main(String[] args) {
		
		OutletStoreService store= new OutletStoreService();
		
		CustomerVO c01 = new CustomerVO("최민재", '남', "010-2211-1122", "부천", false);
		CustomerVO c02 = new CustomerVO("박진", '남', "010-4321-1234", "서울", false);
		CustomerVO c03 = new CustomerVO("하승현", '여', "010-1234-1234", "서울", false);
		CustomerVO c04 = new CustomerVO("둘리", '남', "010-1234-5555", "부천", false);
		
		ProductVO p01 = new ProductVO("신라면", "농심", 4000, 50, new MyDate(2015, 7, 14));
		ProductVO p02 = new ProductVO("사이다", "칠성", 1500, 50, new MyDate(2015, 6, 15));
		ProductVO p03 = new ProductVO("스파클링", "해태", 3000, 50, new MyDate(2015, 7, 14));
		ProductVO p04 = new ProductVO("참치캔", "동원", 4500, 50, new MyDate(2015, 6, 15));
		ProductVO p05 = new ProductVO("맥주", "cass", 2000, 50, new MyDate(2015, 7, 14));
		
		//01.구매 매서드 작성..
		store.buyProduct(p01, c01);
		store.buyProduct(p02, c01);
		
		//02.구매한 customer가 정말 구매를 했는지 확인...
		String str = c01.getCustomerInfo();
		System.out.println(str);
		
	}
}

// 손님이 가계에서 제품을 사면 가계에 있는 수량을 빼는 부분을 못함.
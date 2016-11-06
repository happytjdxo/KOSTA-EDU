package set.step3.test;

import java.util.TreeSet;

import set.step3.LottoMachineService;

public class LottoMachineServiceTest {
	public static void main(String[] args) {

		LottoMachineService service = new LottoMachineService();
		TreeSet set = service.createLottoNumber();
		System.out.println("당신이 추첨하신 Lotto Number : " + set);
	}
}

package stack.step4.test;

import java.util.Stack;

import stack.step4.Coin;

public class CoinStackTest {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));	// 100
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));	// 10
		
		/*
		 * coinBox 가 비어있지 않는 동안 Looping을 돌면서 (while)
		 * 맨 위의 동전들을 끄집어 냅니다.
		 * 그리고 끄집어낸 동전들을 확인하기 위해서 출력.
		 */
		
		while(!coinBox.empty()){
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}

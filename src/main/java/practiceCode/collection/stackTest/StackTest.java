package practiceCode.collection.stackTest;

import java.util.Stack;

public class StackTest {

	static class Coin {
		private int value;

		public Coin(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		// 동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		// 동전박스가 비었는지 확인
		while (!coinBox.isEmpty()) {
			// 동전박스에서 맨 위의 동전 꺼내기
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}

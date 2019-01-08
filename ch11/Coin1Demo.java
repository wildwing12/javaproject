package ch11;

public class Coin1Demo {
	public static void main(String[] args) {
		//인터페이스의 상수는 static영역에 있기 때문에 
		//클래스 이름. 상수 이름으로 접근 가능합니다.
		
		System.out.println("Dime은  "+ Coin.DIME+"센트입니다.");
	}
}

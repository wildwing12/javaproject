package ch11;

public interface Coin {//추상메소드, 상수는 인터페이스에서 사용 가능
	//interface의  상수는 자동으로 public static final이 붙는다.
	int PENNY = 1, NICKEL= 5, DIME=10, QUARTER=25;//값이 static영역에 저장되어 있기 때문에 쓸 수 있다.
	
}

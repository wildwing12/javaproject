package ch11;

public interface Controllable {
	//명시적으로 default메소드로의 구현은 jdk8부터 가능
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {
		System.out.println("장비를 초기화 한다");
	}
	//참고 : private 메소드로의 구현은 jdk9부터 가능
	//실무에서는 아직 인터페이스에서 위와 가은 구현메소드를 사용한함.
	
	void turnOn();
	void TurnOff();
}

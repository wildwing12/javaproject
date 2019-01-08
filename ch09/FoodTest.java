package ch09;

class Food {
	public void getFruit() {
		
	}
}
class Apple extends Food {
	public void getFruit() {
		System.out.println("나는 사과를 좋아합니다.");
	}
}
class Banana extends Food {
	public void getFruit() {
		System.out.println("나는 바나나를 좋아합니다.");
	}
}

public class FoodTest {
	public static void main(String[] args) {
		Apple apple=new Apple();
		Banana banana=new Banana();
		
		apple.getFruit();
		banana.getFruit();
		
	}
}

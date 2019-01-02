package ch07;

public class Car {
	String color;//색상,null
	int speed;//속도(멤버 변수는 초기화 안 시켜 줘도 0이라는 값을 가지고 있다.)0,10
	int gear;//기어 1
	
	//public String toString() {//레퍼런스 자료형에서 초기화 시켜주는 기능을 가지고 있다.
	//	return "Car [color="+color+", speed="+speed+", gear="+gear+ "]";
//     }	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear=g;
	}
	void speedUp() {
		speed = speed+10;
	}
	void speedDown() {
		speed=speed-10;
	}
}

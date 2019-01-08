package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj=new SportsCar();
		
		//SportsCar 객체는   Car객체를 상속받았기 때문에   Car 객체의
		//맴버들의(맴버변수, 멤버메소드)을 모두 사용할 수 있다.
		obj.speed=10;//Car의 맴버 변수
		obj.setSpeed(60);//카의 맴버 매소드 setSpeed(60)을 호출 및 초기화
		obj.setTurbo(true);
		
	}
}

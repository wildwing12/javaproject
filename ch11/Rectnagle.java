package ch11;

public class Rectnagle extends Shape {

	@Override
	public void draw() {//추상메소드 구현
		System.out.println("사격형 그리기 시작 x 좌표값 : "+x);
		System.out.println("사격형 그리기 시작 y 좌표값: "+y);

	}//구현 받을 것이 없다고 하더라도 바디를 만들어 주어야 한다.

}

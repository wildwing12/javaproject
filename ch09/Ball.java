package ch09;

public class Ball extends Circle {
	private String color;//빨간색
	
	public Ball(String color) {
		this.color = color;
		
	}
	public void findColor() {
		System.out.println(color+" 공이다.");
		
	}
	public void findVolume() {
		System.out.println("부피는 4/3*(파ㅇ*반지름*반지름)이다.");
	}
}

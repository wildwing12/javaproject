package ch08;

class Circle{
	double radius;
	String color;
	public Circle(double r, String c) {
		radius = r;//생성자에서  this를 쓸때는 멤버 변수와 전역 변수의 식별자가 같을때 사용한다.
		color = c;
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
		
	}
	public Circle(String c) {
		radius =10.0;
		color = c;
	}
	public Circle() {
		radius =10.0;
		color = "빨강";
	}//생성자를 만들었다면 기본생성자는 꼭 있어야 한다.
	public void print() {
		System.out.println("반지름 : "+ radius);
		System.out.println("색   깔  : "+color);
	}
}

public class CycleDemo {
	public static void main(String[] args) {
		Circle c1=new Circle(10.0,"빨강");
		c1.print();
		
		Circle c2= new Circle(5.0);
		c2.print();
		
		Circle c3= new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
		
	}

}

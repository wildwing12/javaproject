package ch10;

class Triangle extends Figure{
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}
class Rectangle extends Figure{
	void draw() {
		System.out.println("사격형 그리기....");
	}
}

class Circle extends Figure{
	void draw() {
		System.out.println("원 그리기");
	}
}
public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c= new Circle();
		c.draw();
		
		//has a관계 부모는 자식을 포함한다.
		Figure f= new Triangle();//좌변(부모)의 자료형과 우변(자식)의 자료형
		//좌변과 우변의 자료형이 틀린데 Figure하나로 모두 다 처리 가능(다형성)
		f.draw();
		f=new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
	}
}

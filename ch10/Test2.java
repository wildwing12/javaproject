package ch10;

class A2{//클레스에 final을 쓰면 상속이 안되!!
	void print() {//메소드에 final을 넣으면 오버라이딩이 안돼!!
		System.out.println("a");
	}
}
class B extends A2{//우선순위가 있음.
	void print() {//오버라이딩,메소드 재 정의
		System.out.println("b");
	}
}

public class Test2 {
	public static void main(String[] args) {
		B b=new B();
		b.print();
	}
}

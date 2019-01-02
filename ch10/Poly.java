package ch10;

class K {
	int a = 10;

	public void print() {
		System.out.println(a);
	}
}

class V extends K {
	int a = 20;

	@Override
	public void print() {
		System.out.println(a);
	}
}

public class Poly {
	public static void main(String[] args) {
		
		V a=new V();
		a.print();
		K b=new K();
		b.print();
		
		K c= new V();//다형성 좌변: 부모자료형, 우변: 자녀 자료형
		c.print();//자녀값이 나온다.
		
//		V d=new K();//오류
//		d.print();
		
		//다형성을 쓸때 실제 참조변수가 가르치는 객체가 사용하고자 하는 객체가 맞는지 검사 할때 쓰는 것은
		//instanceof                                                                                                                                                                                         라는 연산자를 사용
		System.out.println("c instance of v? :"+(c instanceof V));
		
	}
}

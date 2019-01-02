package ch10;

public class Test3 {
	public static void main(String[] args) {
//		int a = 10;
//		double b=20;
//		char c='a';
//		String d="hello";
		
		//Object클래스는 최상위 클래스, 저건 만능키!!!
		//그대로 사용하면 무거워지며 속도 저하.
		//한개의 자료형으로 다향한 형태의 자료형을 처리할수 있는 능력을 가진것을 다형성이라고 한다.(Object=다형성)
		
//		Object a = 10;
//		Object b=20;
//		Object c='a';
//		Object d="hello";
		
		Object a1=10;
		a1=20.5;
		a1='A';
		a1="hello";
//		System.out.println(a1);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		Object a=new Integer(10);
		//다형성의 코드의 예, 실무적으로 좌변(부모객체)과 우변(자식객체)의 자료형이 다른것을 다형성이라고 한다.
		System.out.println(a);//원래는 번지값이 출력되어야 하지만 
		//내부적으로 XXXvalue()를  실행하여 해당값이 출력
		
		
		//a= new Double(20.5);//원래는 new를 통해 써야 하지만
		
		a=20.5;
		System.out.println(a);
		
		//a='A';
		a=new Character('A');
		System.out.println(a);
	}
}

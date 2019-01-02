package ch11;


//추상 클레스(abstract class) - 1개 이상의 추상메소드를 가진 클레스
//추상메소드: 메소드 내용이 완성되지 않은 메소드(바디가 없어)
//추상 클레스는 객체 생성을 할 수 없다.(new를 할 수 없다.)
//하위 클레스에서 상속을 받아 추상 메소드를 오버라이딩해야 사용 가능
public abstract class AbstractClass {//하나라도  abstract메소드가 있으면 반드시 클레스도 abstract를 해야 한다.
	abstract void method1();
	void method2() {
		System.out.println("완성된 method");
	}
	
}

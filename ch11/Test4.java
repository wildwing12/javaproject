package ch11;

public class Test4 extends Test implements A {
	//interface 클레스도 인터페이스화 할 수 없다.(new를 쓰지 못함.)
	public void print() {
		System.out.println("인터페이스와 추상 메소드 구현");//"인터페이스와 초상 메소드 구현
	}
	public static void main(String[] args) {
	Test4 t= new Test4();
	t.print();}
}


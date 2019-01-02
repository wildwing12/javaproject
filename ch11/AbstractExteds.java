package ch11;
//추상 클레스를 상속 받아서 사용할  경우 
//추상 메소드를 구현 (implement  또는 override라고도 함)해야 한다.
//추상 클래스를 쓰는 이유는 표준화 때문에 그래. (유지 보수의 이유때문에 사용하는 이유가 제일 커)
//추산 클레스는 인스턴스를 만들 수 없어
//그래서 자식 클레스를 통해서  new 해서 사용해야해
public class AbstractExteds extends AbstractClass {

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	public static void main(String[] args) {
		 AbstractExteds ex = new  AbstractExteds();
		 ex.method1();
		 ex.method2();
	}

}

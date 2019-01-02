package ch10;

public class StaticVar2 {
	static int total;//클래스 메모리 영역에 생성이 됨.
	String model;// heap이라는 메모리 영역에서 생성됨.(non-static,new)
	public StaticVar2() {//기본 생성자는 만들어 두는 것이 좋다~~~
		
	}
	public StaticVar2(String model) {
		this.model=model;
		total++;//1
	}
	
	
}

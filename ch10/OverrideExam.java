package ch10;
//override는 겹처 쓰다. 영어 공부 하자~~~~
//원래의 class 1당 1개의 file이 정상
//다수의 class를 1개의 file로 처리한다.
//=> public class 이름과 파일명이 같아야 한다.
// main메소드가 있는 퍼브릭 메소드는 1개이여야 한다.
class Test11{
	public void print() {
		System.out.println("test11...");
	}
}
class Test22 extends Test11 {
	@Override //주석 @.... 어노테이션
	public void print() {//호출받은 당사자가 우선권이 있다.
		//오버리아드는 재 정의, 오버 라이딩 되었다 하더라도 해당 객체의 매소드가 우선권이 있다. 
		//오버라이드 되었다 하더라도 호출 받은 당사자가 우선권이 있음
		System.out.println("Test22....");
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		Test22 t= new Test22();
		t.print();
	}
	
}

package ch15;

public class ThrowExam {
	//throw :예외를 직접 발생시키는 방법, 테스트용 외에는 거의 쓸 일이 없다.
	static void test(int n) {
		if(n==0) {
			throw new NullPointerException();
			//throw new  예외처리클래스(); 특정 조건에 인위적으로
			//예외를 발생시킴
			//주의 점은 throw와 throw는 다르다. 이것 주의 할것
			//throw:이건 일부러 예외를 발생 시키는 것이고
			//throws:컴퓨터에게 예외를 위임하는 것이야.
		}
		
	}
	public static void main(String[] args) {
		test(0);
	}
}

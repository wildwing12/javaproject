package ch15;

public class ThrowsExam {

	public static void main(String[] args) throws InterruptedException {
		// 예외 처리 방법
		// try~catch 직접 처리
		// throws 예외처리 클래스에 처리 위임
		// main method 내부의 코드를 실행하다가 예외가 발생하면
		//메소드 이름  throws 예외 처리 클래스1, 예외 처리 클레스 2....{}
		// 직접 처리 하지 않고 throws 뒤에 지정한 예외처리 클래스에 처리를 위임한다.
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);// interrupt(cpu간섭)

		}
	}
}

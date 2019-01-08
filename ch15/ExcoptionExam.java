package ch15;

public class ExcoptionExam {
	public static void main(String[] args) {
		//에러 Error- 컴파일 오류
		//경고 Warning- 에러는 아니지만 잠재적인 문제를 발생시킬 수 있는 코드
		//dPdhl Exception - 실행하면서 오류가 발생하는 경우
		//Ex)다운로드를 시도==> 파일이 없음
		//예외 처리 방법 : try~catch
		int a=10, b=0,c;
		try {
			c=a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();//프로그래머를 위한 디버깅용 메소드
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

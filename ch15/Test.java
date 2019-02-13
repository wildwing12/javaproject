package ch15;

public class Test {
	public static void main(String[] args) {
		try {
			int num= Integer.parseInt("ABC");
			System.out.println(num);
			
		} catch (Exception e) {
			System.out.println("NumberFormatException 예외 발생");
		}
		System.out.println("\"프로그램 종료되었습니다.\"");
	}
}

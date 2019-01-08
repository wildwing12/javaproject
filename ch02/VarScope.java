package ch02;

public class VarScope {
	static int x ; //전역 변수 값을 초기화 안해도 알아서 0 선언
	
	public static void main(String[] args) {
		int y= 0;//지역변수
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
		
	}

}

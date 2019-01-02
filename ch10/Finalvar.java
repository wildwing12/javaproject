package ch10;

public class Finalvar {
	final static int MAX_NUM=500;//상수는 값이 변하지 않음.
	
	public static void main(String[] args) {
		int max =100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
//		MAX_NUM=200;//값을 수정 할 수 없음.상수라서 그랭
		
	}
	
}

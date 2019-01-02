package ch02;

public class Constant {

	public static void main(String[] args) {
		//final을 붙여 변수의 상수처리
		final double KM_PER_MIEL = 1.609344;
		double km;//km의 변수 선언
		double mile = 60.0;
		km = KM_PER_MIEL *mile;//km에 대한 초기화
		
		System.out.println("60마일은 " + km + "킬로미터입니다.");
	}

}

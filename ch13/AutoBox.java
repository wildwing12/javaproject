package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본 자료형
		int num1=10;
		int num2;
		
		//객체 데이터자료형(클래스 데이터 자료형)
		Integer i1;//i1은 객체 참조 변수(객체참조 변수는 주소를 저장), 아직은 선언만 했기 때문에
		//i1의 값은 null상태이다.
		
		Integer i2=new Integer(20);
		i1=num1;//auto boxing(기본 자료형을 객체로 박스 처리)
		num2= i2;//auto unboxing(객체 안에 들어 있는 값을 풀어서 저장)
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
		
	}
}

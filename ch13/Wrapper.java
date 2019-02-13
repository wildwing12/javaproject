package ch13;
//Wrapper 클래스 :기본 자료형을 포장하는 클래스
//기본 자료형에 대한 다양한 method를 지원
public class Wrapper {
	public static void main(String[] args) {
		Integer i1=100;
		Integer i2= new Integer(200);//auto boxing
		int num1=i1.intValue();//auto unboxing(객체로 포장된 value를 꺼내는 방법)
		
		int num2=i2;//intValue()생략
		int sum=num1+num2;
		System.out.println(sum);
		
		System.out.println(Integer.toBinaryString(sum));
		
		System.out.println(Integer.toOctalString(sum));
		
		System.out.println(Integer.toHexString(sum));
		
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		
		System.out.println(Integer.parseInt("100"));//문자열을 정수로 바꾸는 것
		System.out.println(Integer.toString(100));//정수를 문자열로 바꾸는 것
		System.out.println(100+"");//뒤에""문자열을  연결하면 근처 숫자도 문자열이 됨
		
	}
}

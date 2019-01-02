package ch07;

public class MyMathTest {
	public static void main(String[] args) {
		int intsq;
		double indou;
		Math obj = new Math();
		intsq = obj.square(2);
		System.out.println("2의 정수의 제곱은 : "+intsq);
		indou=obj.squre(2.3);
		System.out.printf("2.3의 실수 제곱은 : %.1f",indou);
	}
}

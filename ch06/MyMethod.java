package ch06;

public class MyMethod {
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
		
	}
	static int multi(int a, int b) {
		return a*b;
		
	}
	static int divide(int a, int b) {
		return a/b;
	}
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
			
			}
		}
	
	public static void main(String[] args) {
		int n;
		System.out.println("++++덧셈연산++++");
		n=plus(1,2);
		System.out.println(n);
		System.out.println("----뺄샘연산----");
		n=minus(2,1);
		System.out.println(n);
		System.out.println("****곱셈연산****");
		n=multi(2,1);
		System.out.println(n);
		System.out.println("/////나누기/////");
		n=divide(10,5);
		System.out.println(n);
		System.out.println("+_*%구구단%*_+");
		gugudan(2);
				
		
	}

}

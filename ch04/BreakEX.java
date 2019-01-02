package ch04;

public class BreakEX {
	public static void main(String[] args) {
		int n=1;
		while(n<=10) {
			System.out.println(n+"Hello world");
			n++;
			if(n==8)
				break;//n값이 8일때 빠져나감
		}//end while
		System.out.println("n값이 8이면 while문을 빠져나옴;");
	}//end main

}

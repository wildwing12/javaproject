package ch04;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;//ㅠㅐㄱ토리얼의 값이 매우 커질 수 있어서 
		int n;
		
		System.out.println("정수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			fact = fact*i;
			
		}
		System.out.printf("%d!은 %d입니다.", n, fact);
		
	}


}

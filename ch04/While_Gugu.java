package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		int dan, i;
		i=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오:");
		dan = scan.nextInt();
		
		while(i<=9) {
			
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
			
		
			
		
	}

}

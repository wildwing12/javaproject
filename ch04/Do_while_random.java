package ch04;

import java.util.Scanner;

public class Do_while_random {
	public static void main(String[] args) {
		int input =0;
		int answer =0;
		answer = (int)(Math.random()*10) +1;//1~10사이의 임의의 수를 저장
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("1과 10사이의 정수를 입력하세요.>");
			String tmp = scanner.next();
			input = Integer.parseInt(tmp);
			if (input > answer) {
				System.out.print(" 더 작은 수로 다시 시도해 보세요.");
				
			}else if (input < answer) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			}
		}while (input!=answer);{
		System.out.println("정답입니다.");
		}//end do while
		scanner.close();
	}//end main

}

package ch02;

import java.util.Scanner;

public class Add_input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, sum;//지역 변수 선언
		
		System.out.println("첫번째 숫자를 입력하세요");
		x = input.nextInt();//정수형은 nextInt로 바받는다.
		System.out.println("두번째 숫자를 입력하세요");
		y = input.nextInt();
		
		sum = x + y;//sum변수의 값초기화
		System.out.println(sum);
		
		input.close();
		
		
	}

}

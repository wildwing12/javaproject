package ch02;

import java.util.Scanner;

public class Add_input2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, multi;
		
		System.out.println("첫번째 숫자를 입력하세요");
		x = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		y = input.nextInt();
		multi = x*y;
		
		System.out.println("두수의 곱은 " + multi + "입니다.");
		input.close();
	}

}

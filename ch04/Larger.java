package ch04;

import java.util.Scanner;

//교재 106p
public class Larger {

	public static void main(String[] args) {
		int x, y, max;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		x = input.nextInt();
		
		System.out.println("두번째 정수 : ");
		y = input.nextInt();
		
		if (x > y) 
			max = x;
		else
		    max = y;
		
		System.out.println("큰 수는 " + max);
	}
}

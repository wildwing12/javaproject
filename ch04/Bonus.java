package ch04;

import java.util.Scanner;
//교재107p
public class Bonus {

	public static void main(String[] args) {
		final int TARGETSALES = 1000; //상수
		int mySales;
		int bonus;
		String result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("실적을 입력하시오(단위: 만원) : ");
		mySales = input.nextInt();
		
		if (mySales >= TARGETSALES) {
			result = "실적 달성";
			bonus = (mySales - TARGETSALES) / 10;
		}else {
			result = "실적 달성 못함";
			bonus = 0;
		}
		System.out.println(result + "\n" + "보너스 : "+bonus);
	}
}

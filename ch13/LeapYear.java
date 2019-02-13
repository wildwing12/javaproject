package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year=scan.nextInt();
		GregorianCalendar cal=new GregorianCalendar();
		if((year%4==0&&year%100 !=0)||(year%400==0)) {//윤년계산 메소드:isLeapYear()
			//is로 시작하는 메소드는 대부분  boolean타입니다.
			System.out.println("윤년입니다.");
			
		}else {
			System.out.println("평년입니다.");
		}
				
	}
}

package ch06;

import java.util.Scanner;

public class Holiday2 {
	static int y;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		y = scan.nextInt();
		scan.close();
		
	}
	static int holiday(int year) {
		int day =0;
		if(year<=5) {
			day =5;
		}else if(year<=10){
			day =10;
		}else if (year<=20) {
			day=20;
		}else if(year<=30) {
			day=30;
		}else {
			day =30;
		}
		return day;
		
	}
	static void printTest() {
		
		System.out.println("휴가일수 : "+holiday(y));
		System.out.println("===================");
		
		
	}
	public static void main(String[] args) {
		System.out.println("===================");
		System.out.print("근속 연수를 입력하세요 : ");
		input();
		printTest();
		
	}

}

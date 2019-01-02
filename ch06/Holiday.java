package ch06;

import java.util.Scanner;

public class Holiday {
	static int y;//전역(멤버, 필드,global)변수=>클레스 전체에서 사용할 수 있는 변수
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("근속 연수를 입력하세요");
		y = scan.nextInt();//정수값 입력
		scan.close();//스캐너 사용 메모리 정리
		
		
	}
	static int holiday(int year) {
		int day =0;//지역 변수 해당 메소드 안에서 사용 가능
		if(year <= 5) {//근속 년수 1-5년
			day=10;
					
		}else if(year<=10) {//근속 연수가 6~10년 이하
			day = 15;
			}else {
				day= 20;
			}
		return day;
		
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가 일수 : " +holiday(y));
		
	}

}

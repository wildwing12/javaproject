package ch04;
//난수 발생 시키는 식, 게임에서 많이 쓰임


import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();//난수를 발생시키는 랜덤 함수 생성
		System.out.print("난수의 개수 : ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum =0;//합계로 사용할 변수 선언 및 초기화
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);//0~99사이의 난수 발생
			System.out.println("생성된 난수 : " + number);
			sum += number;//sum= sum+number
		}//end for
		System.out.println("난수 " +count + "개의 합은"+sum);
	}

}

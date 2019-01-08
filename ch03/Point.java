package ch03;

import java.util.Scanner;

//성적 계산 프로그램
//국어, 영어, 수학 점수를 입력 받아, 총점, 평균 출력
public class Point {
	
	public static void main(String[] args) {
		//변수 선언
		String name;
		int kor, eng, mat, tot ;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		mat = scan.nextInt();
		scan.close();
		
		tot=kor + eng + mat;
		avg = tot / 3.0;
		System.out.println("이름\t국어\t영어\t수학\t 총점\t 평균");
		System.out.println(name+"\t"+kor+"/t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		
		
		
		
	}

}

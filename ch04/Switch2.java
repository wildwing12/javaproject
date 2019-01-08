package ch04;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		String grade ="";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		mat = scan.nextInt();
		scan.close();
		
		tot =kor + eng + mat;
		avg = tot/3.0;
		switch((int)(avg/10)) {
		case 10:
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가"; break;
		}
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%4.1f\t%s", 
				kor, eng, mat, tot, avg, grade);
		
				
		
		
	}

}

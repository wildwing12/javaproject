package ch05;

import java.util.Scanner;

public class ArrayHakjum {
	public static void main(String[] args) {
		int total =0;
		int size;
		Scanner scanner= new Scanner(System.in);
		System.out.println("과목 수를 입력하시오 : ");
		size = scanner.nextInt();
		int[] scores = new int[size];
		for(int i=0; i<scores.length; i++) {
			System.out.println("성적을 입력하시오 : ");
			scores[i] = scanner.nextInt();
			
			
			}
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];
			
		}
		System.out.print("합계 성적은 "+total+"입니다.");
		System.out.println("평균 성적은 "+total/scores.length+"입니다.");
	}

}

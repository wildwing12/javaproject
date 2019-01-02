package ch05;

public class ArrayTesxt2 {
	public static void main(String[] args) {
		int sum = 0;// 총점을 저장하기 위한 일반 변수
		float average =0f;//평균을 저장하기 위한 변수 f를 명시적으로 표기
		int[] score = {100, 88,100, 100,90};
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}//end for
		average = sum / (float)score.length;//length는 배열의  size
		System.out.println("총점:"+ sum);
		System.out.println("평균:"+average);
	}

}

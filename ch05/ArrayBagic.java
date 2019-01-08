package ch05;

public class ArrayBagic {
	public static void main(String[] args) {
		int[] score;//배열참조 변수 선언
		score = new int[5];//new를 통해서 메모리에 5개의  int형 배열 생성
		//score는 이제 배열 참조 변수가 됨을써
		//메모리에 생성된 배열에 접근 할 수 있는 메모리 주소값을 가짐
		
		score[0]=100;
		score[1]=90;
		score[2]=80;
		score[3]=70;
		score[4]=60;
		
		for(int i=0; 1<5; i++) {
			System.out.println(score[i]);
		}
		
	}

}

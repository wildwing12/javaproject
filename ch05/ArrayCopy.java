package ch05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] list = {10,20,30,40,50};//list에는 배열의 주소값 저장
		//배열 복사
		int [] numbers = list;//list의 주소값을 numbers에 복사
		
		for(int i=0; i <numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		//배열 복사 2
		int [ ]list_copy =Arrays.copyOf(list, list.length);//list.length : 변수의 길이만큼 이라는 뜻
		for (int value : list_copy){//향상된 for문에서는 ++n, 배열, 객체 타입을 내부적으로 다룸
			System.out.println(value);
		}

	}

}

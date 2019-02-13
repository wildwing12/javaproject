package ch13;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] num= {50,40,90,120,-20};
		System.out.print("배열 데이터  : " );
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		Arrays.sort(num);
		//buble sort(버블정렬)
		System.out.println();
		System.out.println("오름차순 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
			
		}
		System.out.println();
		System.out.println("내림차순  : ");
		for(int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+"\t");
		}
	}
}

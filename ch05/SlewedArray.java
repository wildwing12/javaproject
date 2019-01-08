package ch05;

import javax.swing.plaf.synth.SynthSeparatorUI;

//비정방형 배열(==가변형 배열==레그드 배열) :각 행의 열의 갯수가 다른 배열
//각 행의 열의 갯수가 다른 배열
//int i[][];
//i =new int[3][]<==이런거
public class SlewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];//첫째 행의 정수3개의 열 생성
		intArray[1] = new int[2];//둘째행의 정수 2개의 열 생성 
		intArray[2] = new int[3];//셋째행의 정수3개의 열 생성 
		intArray[3] = new int[2];//넷째행의 정수 2개의 열 생성 
		
		for(int i=0; i<intArray.length; i++) {//행에 대한 반복
			for (int j=0; j<intArray[i].length; j++) {//열에 대한 반복 
				intArray[i][j] = (i+1)*10+j;
			}//end inner for
		}//end outer for
		for(int i =0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}

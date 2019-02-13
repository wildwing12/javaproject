package ch19;

import java.io.IOException;

//스트림(Stream) : 데이터의 논리적인 통로
//1byte단위로 처리됨
//Input Stream(입력 스트림)
//Output Stream(출력 스트림)

public class InputStreamExam {
	public static void main(String[] args) {
		int var=0;
		System.out.println("내용을 입력하세요 : ");
		try {//네트워크나 입출력, DB는 필수적 예외 처리
			var =System.in.read();//키보드로 부터 1byte를 읽음
			//한글(2byte)은 처리가 안됨.=>InputStreamReader을 써야 함.
			while(var !=13) {//13=>엔터키를 입력할때까지 반복
				System.out.println(var+"==>"+(char)var);
				//모든 문자에는 고유한 숫자코드가 있다. int형 var를
				//문자형(char)로 형변환 해서 출력
				var=System.in.read();
			}
		} catch (IOException e) {//입출력 관련 예외처리
			e.printStackTrace();
		}		
		}
}

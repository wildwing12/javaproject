package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExam {
	public static void main(String[] args) {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));//BufferReader은 외부 자원을 끌어 올 수 있어.
		//new BufferedReader(new InputStramReader(System.in));
		System.out.println("입력하세요 : ");
		try {
			String str=reader.readLine();//한 라인을 읽어드림.
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

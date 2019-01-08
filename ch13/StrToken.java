package ch13;

import java.util.StringTokenizer;

//StringTokenizer : 스트링 구분자
//token : 연속된 문자에서 문자를 구별할 수 있는 단위를 토큰 단위

public class StrToken {
	public static void main(String[] args) {
		String str= "kim,20,180,55,서울,학생";//아무기호나 문자로 구분자를 줄 수 있지만
		// 주로 콤바나 슬레쉬  tab으로 데이터 구분한다.
		String[] items=str.split(",");//만약 /를 쓴다면 , 대신에 /를 넣으면 된다.
		for(String s: items) {
			System.out.println(s);
		}
		StringTokenizer st= new StringTokenizer(str, ",");
		int cnt=st.countTokens();
		System.out.println("토큰의 갯수:"+cnt);
		
		while(st.hasMoreElements()) {//다음 요소의 내용이 있으면 
			System.out.println(st.nextToken());
		}
		
	}
}

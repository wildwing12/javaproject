package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String : 불변(immutable)
		//Stringbuilder : 가변(mutable)
		
		//StringBuffer Str1= new Stringbuffer();//초기버전용
		StringBuilder str1=new StringBuilder();
		//StringBuilder는 일반객체이기 때문에 String고하는 달리 new 해서 사용
		
		str1.append("java");//append()문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");//replace(index start, index end-1, "")
		System.out.println(str1);
		
		String str2=str1.substring(3);//인덱스 3부터 끝까지
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=str1.toString();//String
		//StringBuilder를  String으로 바꿀 때는 toString()을 사용
		System.out.println("StringBuilder(str1)->String(str3)에 저장 : "+str3);
		
		//String을 StringBuilder에 저장할때 
		str1 = new StringBuilder(str3);
		System.out.println("String(str3)->StringBuilder(str1)에 저장 : "+str1);
		
	}
}

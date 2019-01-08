package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1+=" programming";//str1=str1+" programming", 문자열 연결
		//이지만 실제로 새로운 무자열을 만들고 str1은 새로운 문자열의 
		//주소값을 가르키게 됨.
		System.out.println(str1);
		
		System.out.println(str1.length());//문자열의 길이
		String str2=str1.concat(" programming");//concat()문자열 연결
		System.out.println(str2);//문자열 연결
		System.out.println(str1);
		
		System.out.println(str1.charAt(2));//n번째 문자
		System.out.println(str2.indexOf("program"));//program의 시작 문자열인
		//p의 문자의 시작 위치
		System.out.println(str2.indexOf("z"));//찾고자 하는 값이 없으면 -1을 리턴
		
		System.out.println(str2.substring(0, 4));//substring(start, end-1)
		System.out.println(str2.substring(5));//5~끝까지 출력(start)
		
		System.out.println(str2.replace("java", "jsp"));//replace(o,n)
		//해당되는 문자를 바꿔주는 기능이 있음
		System.out.println(str2);//String의 불변성을 가지고 있어서;;;
		str2=str2.replace("java","jsp");
		System.out.println(str2);
	}
}

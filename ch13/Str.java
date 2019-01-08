package ch13;

public class Str {
	public static void main(String[] args) {
		String str="Java Programming";
		System.out.println("str의 주소값 : "+System.identityHashCode(str));
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		//원본은 바뀌지 않음(immutable, 불변성)
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println("str의 주소값 : "+System.identityHashCode(str));
		
		str = "";//널(빈)문자('\0') 초기화
		System.out.println("내용 : "+str);
		System.out.println("str의 주소값 : "+System.identityHashCode(str));
		
		str = null; //참조하는 내용이 없음(주소값 초기화)
		System.out.println("내용 : "+str);
		System.out.println("str의 주소값 : "+System.identityHashCode(str));
		
		char ch='\0';//널문자
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		
		ch = ' ';
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		
		
		
		
		
		
		
		
		
		
		
	}

}

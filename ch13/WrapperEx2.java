package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		
		//Character 사용
		System.out.println("//Character 사용");
		char c1='2', c2='J', c3='@';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2)) 
			System.out.println(c2+"는 영문자");
		if(Character.isBmpCodePoint(c3))
			System.out.println(c3+"기타문자");
		System.out.println();
		
		//Integer 사용
		System.out.println("//Integer 사용");
		System.out.println("parseInt()를 사용한 출력 : "+Integer.parseInt("300"));
		System.out.println("toString()을 활용한 출력 :"+Integer.toString(300));
		System.out.println("toBinaryString()을 활용한 출력"+Integer.toBinaryString(300));
		
		Integer a=new Integer(300);
		System.out.println("Integer.doubleValue()를 활용한 출력 : "+a.doubleValue());
		System.out.println();
		
		//Double 사용
		System.out.println("//Double 사용");
		System.out.println("Double.toString을 활용한 출력 : "+Double.toString(300));
		System.out.println("Double.parseDouble()을 활용한 출력 : "+Double.parseDouble("300"));
		System.out.println();
		
		//Boolean
		System.out.println("//Boolean");
		Boolean b=new Boolean(5>3);
		System.out.println("Boolean.toString()을 활용한 출력 : "+b.toString());
		System.out.println("Boolean.parseBoolean()을 활용한 출력 : "+Boolean.parseBoolean("false"));
		
		
	}
}

package ch13;

public class WrapperEx {
	public static void main(String[] args) {
		//Character 사용
		System.out.println(Character.toLowerCase('A'));
		char c1='4',c2='F';
		if(Character.isDigit(c1)) //문자 c1이 숫자이면 true
			//문자 c1이 숫자이면 true
			System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2))//문자 c2가 영문이면 true
			System.out.println(c2+"는 영문자");
		
		//Integer 사용
		System.out.println(Integer.parseInt("200"));//문자열 200을 10진수로 변환
		System.out.println(Integer.toString(200));//정수를 문자졀로 변환
		System.out.println(Integer.toBinaryString(200));//정수를 2진수 문자열로 변환
		
		
		Integer i= new Integer(200);
		System.out.println(i.doubleValue());//정수를 double값으로 변환(unboxing)
		
		//Double 사용
		Double d =new Double(3.14);
		System.out.println(d.toString());//Double을 문자열로 변환
		System.out.println(Double.parseDouble("3.14"));//문자열을 실수로 변환하는 것
		
		//Boolean
		boolean b=(4>3);//b는 true
		System.out.println(Boolean.toString(b));//boolean형을 문자열로 
		System.out.println(Boolean.parseBoolean("false"));//문자열을  boolean형으로 바꿔줌
		
	}
}

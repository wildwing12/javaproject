package ch13;

public class Replace {
	public static void main(String[] args) {
		String a="java program";
		System.out.println(a.replace("a", "A"));
		System.out.println(a);
		//String은 final이기 때문에 초기화된 문자열 내용이 변하지 않는다.

		
		
		a=a.replace("a", "A");
		System.out.println(a);//위의 주소값을 잃어 버리고 a로 대체됨
	}
	
}

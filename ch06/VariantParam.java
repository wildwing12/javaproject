package ch06;
//자료형 ...변수 => 가변사이즈 매개변수, 변수가 배열참조 변수가 됨
//같은 자료형의 매개변수의 갯수에 관계없이 처리
//매개변수들이 배열로 저장
//실제로는 많이 쓰이지는 않음
public class VariantParam {
	
	static void print(String ...n) {//n이 가변형 매개변수(배열처리의 주소값)
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}//end print()
//	static void print(String a) {
//		System.out.println(a);
//	}
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//	static void print(String a, String b, String c, String d, String e) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//	}
	
	
	
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
		print("java","program","jsp","big","data");
	}
}

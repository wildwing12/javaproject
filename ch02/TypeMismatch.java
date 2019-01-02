package ch02;

public class TypeMismatch {

	public static void main(String[] args) {
		byte n;//byte타입 변수에는 -128 ~ 127을 넘는 정수변수를 넣을 수 없다.
		
		n = -128;
		System.out.println(n);
		
	}

}

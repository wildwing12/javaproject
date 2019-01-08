package ch03;

public class Cast {

	public static void main(String[] args) {
		float f = 1.6f;//4바이트 바이트 자리
		System.out.println(f);

		f = 100;//자동 형 변환
		System.out.println(f);
		
		f = 100.5f;
		
		int i = (int)f;//강제 형변환
		
		System.out.println(i);
		
		i=300;
		byte b = (byte)i;
		System.out.println(b);
	}

}

package ch04;
//ASCII 를 활용한 글자 탑 쌓기
public class Char_Tower {
	public static void main(String[] args) {
		int i, j;
		char a = 65;//65는 아스키코드값으로 'A'
		for(i=1; i<5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(a++);
			}//end inner for
			System.out.println();
		}//end out for
		
	}//end main

}

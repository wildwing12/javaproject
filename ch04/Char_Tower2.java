package ch04;


public class Char_Tower2 {
	public static void main(String[] args) {
		int i, j;
		char a = 65;//65는 아스키코드값으로 'A'
		for(i=1; i<7; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(a++);
			}//end inner for
			System.out.println();
		}//end out for
		
	}//end main
}
	

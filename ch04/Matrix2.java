package ch04;

public class Matrix2 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				} else {
					System.out.printf("%5c", ' ');//c는 문자출력, 5칸씩 빈문자열
				}
			}//end inner for
			System.out.println();
		}//end outer for
	}
}
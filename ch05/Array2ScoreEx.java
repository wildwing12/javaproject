package ch05;

public class Array2ScoreEx {

	public static void main(String[] args) {
		int[][] s= {{80,90,100},{70,56,78},{89,78,89}};
		
		int JavaTotal =0;
		int DBTotal =0;
		int JSPTotal =0;
		System.out.println("  번호     Java  DB  JSP  총점        평균");
		System.out.println("===============================");
		for(int i=0; i<s.length; i++) {
			int sum =0;
			float avg =0.0f;
			JavaTotal+=s[i][0];
			DBTotal+=s[i][1];
			JSPTotal+=s[i][2];
			System.out.printf("%3d",i+1);
			for(int j=0; j<s.length; j++) {
				sum+=s[i][j];
				System.out.printf("%5d",s[i][j]);
			}
			avg = sum/(float)s[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("===============================");	
		System.out.printf("총점 : Jaba:%3d DB:%3d JSP:%3d%n",JavaTotal, DBTotal, JSPTotal);
	}

}

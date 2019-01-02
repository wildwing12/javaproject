package ch05;


public class Array2Score {
	public static void main(String[] args) {
		int[][] s= {{80,90,100,0,0},{70,56,78,0,0},{89,78,89,0,0}};
		
		for(int i=0; i<s.length; i++) {
			s[i][3]=s[i][0]+s[i][1]+s[i][2];
			s[i][4]= s[i][3]/3;		
		}
		System.out.println("=====================================");
		System.out.println("Java\tDB\tJSP\t총점\t평균");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i][0]+"\t"+s[i][1]+"\t"+s[i][2]+"\t"+s[i][3]+"\t"+s[i][4]);
			
		}
		System.out.println("=====================================");
	}

}

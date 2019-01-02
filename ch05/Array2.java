package ch05;
//2차원 배열
/*
 *     0열 	1열	2열
 * 0행 10		20	30
 * 1행 40 	50 	60	
 * 2행70		80	90
 * 
 */
public class Array2 {
	public static void main(String[] args) {
		//[](배열첨자)가 1개가 아니라 2개([][])=> 2차원 배열읠 사용하겠다
		int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
		//int [][] num;
		//num=new int[3][3];
		//num[0][0]=10;
		//num[0][1]=20;
		//num[0][2]=30;
		//.............
		//num[2][2]=90;
		
		for(int i=0; i<3; i++) {//행
			for(int j=0; j<3; j++) {//열
				System.out.println(num[i][j]);
			
			}
		}
	}

}

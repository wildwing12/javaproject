package ch04;

public class Star2 {
	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {//i=1< j=4 => 1<4
					System.out.print(" ");
				}else {
					System.out.print("*"); 
				}
			}//end inner for
			System.out.println();
		}//end outer for
	}//end main

}

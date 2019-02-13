
package ch05;

import java.util.Scanner;

public class Array2Mypro {
	public static void main(String[] args) {
		String[][] a= {{"int","정수"},{"char","문자"},{"double","실수"},{"boolean","논리값"}};
				Scanner scan=new Scanner(System.in);
				for(int i=0; i<a.length; i++) {
					System.out.printf("Q>%d %s가 의미하는 것은?",i+1,a[i][0]);
					String aa=scan.next();
					if(aa.equals(a[i][1])) {
						System.out.println("정답입니다.");
					}else {
						System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", a[i][1]);
					}
						
					}
				
	}

}

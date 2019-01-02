package ch04;

public class Do_while_Ex {
	public static void main(String[] args) {
		int n=1;//초기식
		do {
			System.out.println(n+"Hello world");
			n++;//증감식		
				}while(n<=10);//조건식
		System.out.println("while문 빠져나옴");
	}

}

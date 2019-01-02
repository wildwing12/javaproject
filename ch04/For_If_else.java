package ch04;

public class For_If_else {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {//1~10반복
			sum +=i;//sum= sum+i
			System.out.print(i);//더하는 수를 출력
			if(i<=9)//1부터 9까지는  + 출력
				System.out.print("+");
			else {
				System.out.print("=");//'='출력하고
				System.out.print(sum); //덧셈 결과 출력
				
			}//else문
		}//for
	}//main

}

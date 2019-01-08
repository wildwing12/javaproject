package ch04;

public class Dowhile2 {
	public static void main(String[] args) {
		int i=1;//초기식
		int num=10;
		int sum=0;
		do {
			sum = sum + i;
			i++;//증감식
		}while(i<=num);//조건식
		System.out.println("1~" + num + "까지의 합계 : " + sum);
	}

}

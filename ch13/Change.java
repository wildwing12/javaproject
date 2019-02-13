package ch13;

public class Change {
	public static void main(String[] args) {
		int a=10;//콜라컵
		int b=20;//사이다 컵
		int temp;//b의 값을 a에 바로 넣기 전 미리 백업하여 커쳐가는 임시 변수로 씀
		
		temp=a;//temp=10
		a=b;//a=20;
		b=temp;//b=10;
		System.out.println(a);
		System.out.println(b);
		
	}
}

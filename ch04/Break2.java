package ch04;
//while, if, break 문을 써서 1~9까지 반복 수행하되, i=5일때 반복문을 빠져 나감
public class Break2 {
	public static void main(String[] args) {
		int i=1;
		while(i<=9) {
			System.out.println(i++);
			if(i>5) 
				break;
		}
		System.out.println("**반복문 종료**");
	}
	

}

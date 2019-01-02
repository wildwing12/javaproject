package ch04;

public class Odd {
	public static void main(String[] args) {
	int x= 0;
	for(int i = 1; i<=10; i++) {
		if(i%2 ==1) {
			x= x+i;
		}
	}
	System.out.println("1~10사이의 홀수의 합은?" + x);
}

}

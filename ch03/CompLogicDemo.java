package ch03;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y =1;
		System.out.println((x<1) || (y-- < 1)); //t || f = t
		System.out.println("x = " + x + ",y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x < 1)| (y-- < 1));//t | f = t
		System.out.println("x = " + x + ",y = " + y);
	}

}
//비트는 1과 0을 가지고 계산을 한다. 
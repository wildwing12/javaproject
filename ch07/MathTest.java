package ch07;

public class MathTest {
	public static void main(String[]args) {
	
		int sum;
		Math obj= new Math();
		sum =obj.add(2, 3);
		System.out.println("2와 3의 합은 :"+sum);
		sum= obj.add(7, 8);
		System.out.println("7과8의 합은: "+sum);
	}	
}



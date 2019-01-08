package ch06;

public class OverloadDemo {
	public static void main(String[] args) {
		int i1=3, i2=7, i3=10;
		double d1=7.0, d2=3.0;
		
		System.out.printf("max(%d,%d)=%d\n", i1, i2, max(i1,i2));
		System.out.printf("max(%.1f, %.1f)=%.1f\n", d1,d2, max(d1,d2));
		System.out.printf("max(%d, %d, %d)=%d\n", i1,i2,i3, max(i1,i2, i3));
	}

	private static int max(int i1, int i2, int i3) {//i1=3, i2=7 i3=10
		return max(max(i1,i2),i3);//max(i1,i2)=7, i3=10
	}

	private static double max(double d1, double d2) {//d1:7.0 d2:3.0
		double result = d1>d2 ? d1:d2;//result = 7.0
		return result;
	}

	private static int max(int i1, int i2) {
		int result  = i1>i2 ? i1: i2;//f? (t):(f) i2
		return result;//7
	}

}

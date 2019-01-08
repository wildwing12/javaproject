package ch06;

public class Return2 {
	static int sum2(int x) {
		int y=0;
		for(int i=1; i<=x; i++) {
			y=y+i;
		}
		return y;
	}
	public static void main(String[] args) {
		int z=0;
		z=sum2(300);
		System.out.println(z);
		z=sum2(500);
		System.out.println(z);
		
		

	}

}

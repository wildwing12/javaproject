package ch03;

public class LogicalOperator {
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);
		
		f=(double)5 / 4;
		System.out.println(f);
		
		i = (int)1.3 + (int)1.8;//강제 형 변환은 값 손실이 일어 날 수 있다. (소수점이 날아가 버렸다;;;)
		
		System.out.println(i);
	}

}

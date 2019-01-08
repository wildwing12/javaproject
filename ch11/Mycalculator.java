package ch11;

public class Mycalculator implements Calculator {//추상메소드만 완성해주면 된다.

	@Override
	public int plus(int i, int j) {
		return i+j;
	}

	@Override
	public int multiple(int i, int j) {
		
		return i*j;
	}

}

package ch11;

public interface Calculator {
	public int plus(int i, int j);//추상메소드
	public int multiple(int i, int j);//추상메소드
	default int exec(int i, int j) {//jdk1.8부터 가능
		return i + j;
	}
}

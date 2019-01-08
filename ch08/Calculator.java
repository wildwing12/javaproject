package ch08;

public class Calculator {
	private int lift;
	private int right;
	
	public Calculator() {
		System.out.println("기본 생성자 호출...");
	}
	public Calculator(int lift, int right) {
		System.out.println("매개 변수가 있는 생성자 호출...");
		this.lift =lift;
		this.right=right;
	}
	public int getLift() {
		return lift;
	}
	public void setLift(int lift) {
		this.lift = lift;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(lift+right);
		
	}
	public void avg() {
		System.out.println((lift+right)/2);
	}
}

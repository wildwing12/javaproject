package ch10;


class T {
	private int num=10;
	public final void print() {//메소드에  final이 붙을 때는 오버라이딩이 안된다.
		System.out.println(num);
	}
}

public class FinalMethod extends T{
	int num=100;//non static member
	public static void main(String[] args) {
	
		FinalMethod f= new FinalMethod();
		System.out.println(f.num);
		f.print();//final 처리된 메소드라도 외부객체에서는 접근 가능
	}
}

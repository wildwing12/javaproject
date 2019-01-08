package ch10;

public class StaticVar {
	static int a=20;//static member 자동으로 메모리 업로드
	int b=20;//non static member
	
	public static void main(String[] args) {//자동 메모리 업로드
		System.out.println(StaticVar.a);
		
		StaticVar s=new StaticVar();
		System.out.println(s.b);
		System.out.println(s.a);
		//non Static member는  new를 해서 참조변수를 통해 사용하기도 하지만 
		//static맴버도 사용 가능
	}
	
}

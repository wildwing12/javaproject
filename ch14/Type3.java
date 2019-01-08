package ch14;

public class Type3<T> {//자료형이 미정인 상태<문자>
	private T t;
	public void setT(T t) {//메소드도 자료형 미정
		 this.t=t;
		 
		
	}
	public T getT() {//리턴 타입도 자료형 미정
		return t;
		
	}
	public static void main(String[] args) {
		Type3<String> t= new Type3<String>();
		t.setT("100");//<String>으로 선언했기 때문에 t.setT(100);하면 안된다.
		System.out.println(t.getT());
		
		Type3<Integer> t2= new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>();//이게 정상
	//	Type t3=new Type3();//이렇게도 할 수 있다.
		t3.setT(100.5);
		System.out.println(t3.getT());
		
		
	}
}

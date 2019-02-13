package ch14;

public class Type4<T> {
	T t;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		Type4<Integer> t=new Type4<Integer>();
		t.setT(100);
		System.out.println("학번 : "+t.getT());
		Type4<String> t2=new Type4<String>();
		t2.setT("김종학");
		System.out.println("이름 : "+t2.getT());
		t2.setT("경기도 이천");
		System.out.println("주소 : "+t2.getT());
		t2.setT("010-7298-4459");
		System.out.println("h.p : "+t2.getT());
		Type4<Double> t3= new Type4<Double>();
		t3.setT(70.5);
		System.out.println("몸무게 : "+t3.getT());
		
		
	}
}

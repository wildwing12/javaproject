package ch14;

//제네릭 클래스(generic class)에서는 타입을 변수로 표시
//type parameter,타입매개변수라고 하는 데
//개게 생성 시에 프로그래머에 의해서 결정
public class Box2<T> {//<T> 타입매개변수가 된다. 다른 문자를 써도 되나 
	//주로 Type의 약자인  T를 많이 쓴다.
	private T data;//T=>String
	public void set(T data) {
		this.data= data;
		
	}
	public T get() {
		return data;
		
	}
	public static void main(String[] args) {
		Box2<String> b=new Box2<String>();//T=>String
		//타입매개변수에 대입하게될 String 지정
		System.out.println(b);//
		b.set("Hello World");//문자열 저장
		String s=b.get();
		System.out.println(s);
		
		Box2<Integer> c=new Box2<Integer>();//T=>Integer
		//Integer지정
		System.out.println(c);
		c.set(10);
		Integer i= c.get();
		System.out.println(i);
		
	}
	
}

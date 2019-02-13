package ch13;

public class Objcast {
	public static void main(String[] args) {
		int a=10;
		Object obj=20;
		
		a=(Integer)obj;//정상적인 형 변환, 하지만 아래처럼 가능
		//a=(int)obj;//원래는 obj가 객체형이기 때문에 기본자료형(int)로 하면 안된다.
		//하지만 자바 버전이 업 되면서 허용하도록 했음.
		System.out.println(a);
		
		Object[] obj2= {100,100.3,true,"hello",'A'};
		//각 데이터가 Object객체(Integer, Double, Boolean....)가
		//되어버린다. (오토박싱)
		//메모리 낭비가 심하다.
		for(Object o: obj2) {//향상된 for문
			System.out.println(o);//오토언박싱
		}
	}
}

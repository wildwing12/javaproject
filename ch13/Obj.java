package ch13;
//import java.lang.*//기본적으로 포함되어 있는 패키지
//Object class:최상위 클래스(모든 클래스에서 기본적으로 상소거리됨)

public class Obj {//원래 extend Object가 생략되어 있음.
	public static void main(String[] args) {
		Obj e1=new Obj();
		System.out.println(e1.getClass());//클레스의 정보를 가지고 올때 사용
		System.out.println(e1);//객체의 주소값(해쉬코드라고 부름)
		System.out.println(e1.toString());//toString 문자열로 변환
	}
}


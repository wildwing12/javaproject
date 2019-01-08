package ch13;

public class Exam {
	public static void main(String[] args) {
		String a= "Hello";//Heap의 String pool영역에 들어감... 저장
		String b= "Hello";
		System.out.println(a==b);//true(a,b의 주소가 같다.)
		
		String c= new String("Hello");//new 하면 새로운 주소
		String d= new String("Hello");//new 하면 새로운 주소
		//new 하면 새로운  heap영역에 들어간다.
		System.out.println(c==d);
		System.out.println(c.equals(d));
	}
}

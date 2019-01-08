package ch12;

public class StaticOut {
	static int data=30;//Static 맴버
	int data2=50;//non static 맴버
	static class StaticInner{
	 void msg() {
		 System.out.println("data is :"+data);
		 //System.out.println("data is :"+data2);
		 //non static 맴버는 static inner class에서 사용 못함.
	 }
	 public static void main(String[] args) {
		 StaticOut.StaticInner in= new StaticOut.StaticInner();
		 in.msg();
	}
	}
}

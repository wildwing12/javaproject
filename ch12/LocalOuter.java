package ch12;
//local inner class:메소드 안에 생성되는 클레스를 지ㄴ역 내부 클래스라
//local inner class 규칙
//1.local inner class는 외부 메소드로부터 불러올 수 없다.
//2.jdk1.7까지는 마지막이 아닌 지역 변수에 접속 할 수 없다.
//3.jdk1.7부터는 마지막이 아닌 지역 변수에도 접속 할 수 있다.
public class LocalOuter {
	private int data=30;
	void display() {
		int vlaue=50;
		int vlaue2=100;//마지막 맴버
		class LocalInner{
			void Msg() {
				System.out.println(data);
				System.out.println(vlaue);
				System.out.println(vlaue2);
			}
		}
		LocalInner li= new LocalInner();
		li.Msg();
	}
	
	public static void main(String[] args) {
		LocalOuter lo=new LocalOuter();
		lo.display();
	}
	
}

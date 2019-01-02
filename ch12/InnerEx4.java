package ch12;

class Outer{
	class InstanceInner{
		int iv=100;
	}//end inner class 
	static class staticInner{
		int iv=200;//non-static
		static int cv=300;
		
	}//end inner class
	void myMethod() {
		class LocalInner{
			int iv=400;
			void print() {
				System.out.println("li.iv : "+iv);
			}
			
		}//end local inner class
		LocalInner li=new LocalInner();
		li.print();
	}//end myMethod()
	
}//end Outer class
public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc= new Outer();
		Outer.InstanceInner ii=oc.new InstanceInner();
		System.out.println("ii.iv : "+ii.iv);
		System.out.println("outer.static.cv : "+Outer.staticInner.cv);
		
		Outer.staticInner si=new Outer.staticInner();
		System.out.println("si.iv : "+si.iv);
		oc.myMethod();
	}
}

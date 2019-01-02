

package ch08;

public class MyManagerUse {
	public static void main(String[] args) {
		MyManager mgrobj=MyManager.getInstance();
		System.out.println("mgrobj():"+mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore():"+mgrobj.getScore());
		MyManager newMger=MyManager.getInstance();
		System.out.println("newobj.getscore():"+newMger.getScore());
	}
}

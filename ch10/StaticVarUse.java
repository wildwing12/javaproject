
package ch10;

public class StaticVarUse {
	public static void main(String[] args) {
		//System.out.println(StaticVar2.total);
		//객체들은 서로 별게임.
		StaticVar2 car1=new StaticVar2("쏘나타");//객체 생성및 호출
		StaticVar2 car2=new StaticVar2("모닝");
		StaticVar2 car3=new StaticVar2("아반떼");
		
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);//3이 나오는 이유는 total이 static영역에 있기 때문에야~~
	}
}

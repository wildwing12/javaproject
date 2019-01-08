package ch11;

public class ControllabeDomo {
	public static void main(String[] args) {
		Tv tv= new Tv();
		tv.turnOn();
		tv.TurnOff();
		tv.repair();
		
		Controllable.reset();
//		Controllable클레스의  static 메소드인  reset()접근
		//클래스 이름. 메소드 이름
		System.out.println();
		Computer com=new Computer();
		com.turnOn();
		com.TurnOff();
		com.repair();
		Controllable.reset();
		System.out.println();
		
		Notebook note= new Notebook();
		note.turnOn();
		note.TurnOff();
		note.repair();
		Controllable.reset();
	}
}

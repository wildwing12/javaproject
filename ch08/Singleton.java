package ch08;

public class Singleton {
	private Singleton() {
		print();
	}
	
	private static Singleton instance;//싱글톤 처리된 생성자는 
	//private static으로 처리 후 클레스명 , 변수명으로  명시해서 사용instace는 변수 명이지만 이것으로 하자고 사람들끼리 약속되어 있음.
	
	public static Singleton getInstance() {//생성자가  private처리가 되었을때 public staic으로 처리한 메소드로 우회 접속
		if(instance==null) {//처음으로 인스턴스를 만든다면
			instance=new Singleton();//여기서 실제  new를 통해 생성자를 호출
			
		}//end if
		return instance;//참조변수의 주소값을 리턴
	}//end getInstance
	public void print() {
		System.out.println("생성자");
		
	}
}

package ch07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();//Television.java의 객체 생성
		//여기서 변수 tv는 Television의 주소값을 갖음.
		//네이밍 룰을 잘 지켜서 만들어야함. 대소문자 가리는거 잊지 말공!!
		//()는 생성자, 컨스트럭터라고 불리며 마치 메소드의 역할을 함.
		tv.channel =7;//tv.channel=>인스턴스화된  Television객채의 주소값으로 접근.
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다.");
		
	
	}

}

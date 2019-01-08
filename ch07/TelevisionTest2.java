package ch07;

public class TelevisionTest2 {
	//객체를 여러개 생성할 수 있으나 객체참조변수(레퍼런스변수)의 이름은 달라야함.
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel=7;
		myTv.volume = 10;
		myTv.onOff=true;
		
		Television yourTv = new Television();//yourTv=200번
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onOff=true;
		System.out.println("나의 텔레비전의 채널은"+myTv.channel+"이고 볼륨은"+myTv.volume+"입니다.");
		System.out.println("당신의 텔레비전의 채널은"+yourTv.channel+"이고 볼륨은"+yourTv.volume+"입니다.");
	}

}

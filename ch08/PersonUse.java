package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1= new Person();//객체 생성겸 기본 생성자 호출
		p1.showInfo();
		
		Person p2 = new Person("김상범");//객체 String 생성겸 매개변수 1개짜리 생성
		p2.showInfo();
		
		Person p3 = new Person("박찬호",185);
		p3.showInfo();
		
		Person p4 =new Person("박지성", 175,72);
		p4.showInfo();
		}
	
	}


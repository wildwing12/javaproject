package ch07;

class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value+"만원짜리"+model+"스마트폰");
	}
	
}


public class PhoneDemo {//파일을 저장시 public class의 이름으로 저장
	public static void main(String[] args) {
		Phone myPhone = new Phone();//객체 생성
		myPhone.model="갤럭시 s9";
		myPhone.value=100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model="G9";
		yourPhone.value=90;
		yourPhone.print();
				
	}
}

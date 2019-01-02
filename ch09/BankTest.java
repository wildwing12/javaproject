package ch09;

class Bank{//부모 클레스
	double getInerestRate() {
		return 0.0;
		
	}
}
class BadBank extends Bank{//자식 클레스
	double getInterestRate() {
		return 10.0;
	}
}

class NomalBank extends Bank{//자식 클레스
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank{//자식 클레스
	double getInterestRate() {
		return 3.0;
	}
}


public class BankTest {
	public static void main(String[] args) {
		BadBank b1= new BadBank();
		NomalBank b2= new NomalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율: "+b1.getInterestRate());
		System.out.println("NomalBank의 이자율 : "+b2.getInterestRate());
		System.out.println("GoodBank의 이자율 :"+ b3.getInterestRate());
	}
}

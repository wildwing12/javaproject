package ch07;

public class Person {
	private String name;
	private int age;
	private double height;
	
	public String getName() {//getter,  get+변수명
		return name;
	}
	public void setName(String name) {//setter set+변수명
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0||age>150) {
			System.out.println("입력 값이 정확하지 않습니다.");
		}else {
			this.age = age;//지역변수와 맴버 변수의 값이 같을 수 있다. 그래서 멤버 변수 앞에  this를 쓴다.
		}	
//this는 맴버 변수의 값에 초기화 된 지역 변수의 값을 올려주어라.		
	}
	public double getHieght() {
		return height;
	}
	public void setHieght(double height) {
		this.height = height;
	}
	
	public void print() {
		System.out.println("이름:"+name+", 나이:"+age+", 키 :"+height);
	}
	
	
}

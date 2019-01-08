package ch13;

public class StringExam2 {
	public static void main(String[] args) {
		String str1=new String("김종학");
		String str2=new String("김종학");
		String str3=new String("010-7298-4459");
		String str4=new String("010-7298-4459");
		
		System.out.println("===============(==)사용==============");
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 인스턴트를 참조합니다.");
		}else {
			System.out.println("str1과 str2는 다른 인스턴트를 참조합니다.");
		}
		if(str3==str4) {
			System.out.println("str3과 str4는 같은 인스턴트를 참조합니다.");
		}else {
			System.out.println("str3과 str4는 다른 인스턴트를 참조합니다.");
		}
		System.out.println("============equals()사용=============");
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");			
		}else {
			System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
		}
		if(str3.equals(str3)) {
			System.out.println("str3과 str4는 같은 값을 가지고 있습니다.");			
		}else {
			System.out.println("str3과 str4는 다른 값을 가지고 있습니다.");
		}
			
			
			
		
		
	}
}

package ch13;

public class StringExam {
	public static void main(String[] args) {
		String str1=new String("Hello world");//100
		String str2=new String("Hello world");//200
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("==============(==)을 사용=============");
		if(str1==str2) {//주소값을 비교
			System.out.println("str1과 str2는 같은 인스턴트를 참조합니다.");
		}else {
			System.out.println("str1과 str2는 다른 인스턴트를 참조합니다.");
			
		}
		System.out.println("============equals============");
		if(str1.equals(str2)) {//내용을 비교
			System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
		}else {
			System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
		}
			
			
	}
}

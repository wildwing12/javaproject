package ch10;

public class StaticExam {
	public static void main(String[] args) {
		//대표적으로 자주 사용하고 고정된 값등, Math클래스 등 
		//이클립스에서 final처리 된것은 이탤릭체로 되어 있음.
		
		int a=40, b=30, result;
		result=Math.max(a, b);//둘 중 큰 값
		System.out.println(result);
		result=Math.min(a, b);//둘중 작은 값
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r=15.3;
		System.out.println("원의 둘레 : "+2*Math.PI*r);
		System.out.println("원의 넓이 값 : "+Math.PI*r*r);
		
		
		
	}
}

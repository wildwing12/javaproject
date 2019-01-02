package ch03;

import java.util.Scanner;

public class PointTest {
	public static void main(String[] args) {
		String name;
		int Java, DB, HTML, JSP, tot;
		double avg;
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("Java : ");
		Java = in.nextInt();
		System.out.print("DB : ");
		DB = in.nextInt();
		System.out.print("HTML : ");
		HTML = in.nextInt();
		System.out.print("JSP : ");
		JSP = in.nextInt();
		in.close();
		
		tot = Java + DB + HTML + JSP;
		avg = tot / 3.0;
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+tot+"\t"+avg);
		
	}

}

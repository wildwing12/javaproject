package ch06;

public class Point {
	static String[] name = {"홍길동","이몽룡","이순신","차두리","박지성"};
	static int[] kor = {89,98,77,98,80};
	static int[] eng = {78,98,88,90,97};
	static int[] mat = {90,93,98,87,100};
	static int[] tot = new int[5];
	static double[] avg = new double [5];
	
	static void getTot() {
		for(int i=0; i<name.length; i++) {
		 tot[i]=kor[i]+eng[i]+mat[i];
		}
	}
	static void getAvg() {
		for(int i=0; i<name.length; i++) {
			avg[i]=tot[i]/3.0;
		}
	}
	static void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f\n",name[i],kor[i],eng[i],mat[i],tot[i],avg[i]);
		}
	}
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
	
}		
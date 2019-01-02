package ch02;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double width, hight, area;
		
		System.out.println("직사각형의 가로 길이를 입력하세요.");
		width = in.nextDouble();
		System.out.println("직사각형의 세로 길이를 입력하세요.");
		hight = in.nextDouble();
		area= width * hight;
		
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		in.close();
		
				
	
				
	}

}

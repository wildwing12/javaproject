package ch04;

import java.util.Date;

//교재 112p
public class Welcome {
	public static void main(String[] args) {
		Date date = new Date();
		int currentHour = date.getHours();//Date객체내의 시간값을 가져옴

		System.out.println("현재시간은 "+date);
		if (currentHour < 11) {
			System.out.println("Good morning");
		} else if (currentHour < 15){
			System.out.println("Good afternoon");
		} else if (currentHour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}
}

package ch04;

import java.util.Scanner;

//교재p117
public class StringSwitch {

	public static void main(String[] args) {
		String month;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월의 이름을 입력하시오: ");
		month = scan.next();
		
		int monthNumber;
		switch(month) {
		case "january:":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			monthNumber = 0;
			break;
		}//end switch
		System.out.println(monthNumber);
	}
}

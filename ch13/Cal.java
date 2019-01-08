package ch13;

import java.util.Calendar;
import java.util.Date;

public class Cal {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		//월은 0-11(+1을 해야함)
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		//12시간제
		System.out.println(cal.get(Calendar.HOUR));
		//24시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		//오전0, 오후1
		System.out.println(cal.get(Calendar.AM_PM));
		if(cal.get(cal.get(Calendar.AM_PM))==0){
			System.out.println("오전");
		}else {
				System.out.println("오후");
		}
		//1년중 몇번째 날	
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil="";
		switch(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)) {
		case 1: yoil="일"; break;
		case 2: yoil="월"; break;
		case 3: yoil="화"; break;
		case 4: yoil="수"; break;
		case 5: yoil="목"; break;
		case 6: yoil="금"; break;
		case 7: yoil="토"; break;
		
			
		}
		System.out.println("오늘은"+yoil+"요일 입니다.");
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		Date date=cal.getTime();
		System.out.println(date.getYear()+1900);//1900d을 더해야 한다.
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
	}
	
}

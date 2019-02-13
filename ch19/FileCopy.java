package ch19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		//폴더 보기 옵션에서 확장자이름숨기기를 해제해서 개발해야 좋음
		//한글 윈도우의 기본 인코딩 방식(ms949(ANCI,euc-kr)한글을 2바이트로 저장
		//유니스, 리눅스의 기본 인코딩 방식 : utf-8
		//이클립스에서 소스 작성 파일을 utf-8로 지정하면 한글을 3바이트로 저장
		//c루트디렉토리는 쓰면 안된다. 관리자 보호가 되어 있어서 에러가 발생
		
		
		String file1= "c:\\test\\a.txt";//원본파일
		String file2="c:\\test\\b.txt";//복사본
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str=reader.readLine();//한 라인을 읽음
				if(str==null)break;//내용이 없으면 종료
				//파일에 기록할때는 "\r\n"을 다 써주어야 줄바꿈 처리가 됨
				//\r은 carriage return(캐리지 리턴)
				//\n new line(줄바꿈)
				writer.write(str+"\r\n");
			}//end while
			System.out.println("복사가 완료 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader !=null) reader.close();//리소를 개별적으로 닫아주는 것이 좋다.
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
			try {
				if(writer !=null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		
	}
}

package ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//프로그램 <=========원격 컴퓨터의 리소스 InputStream
//프로그램==========>원격컴퓨터의 리소스 outputStrem
//1.원격컴퓨터 접속 HttpUrlconnecttion
//2.스트림 생성
//3.입출력
public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url=null;
		try {
			url=new URL("http://youtube.com");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn !=null) {//접속이 되었으면
				//서버에서 일정 시간 응답이 없으면 연결을 종료시킴
				conn.setConnectTimeout(3000);//타임아웃 시간 설정
				 StringBuilder sb=new StringBuilder();
				 //정상적으로 처리된 경우
				 //http staues code(상태 코드) 
				 if(conn.getResponseCode()==HttpURLConnection.HTTP_OK) {
					 //스트림을 사용해서  html소스 코드를 읽어옴
					 //입력 버퍼 생성
					 BufferedReader br=
							 new BufferedReader
							 (new InputStreamReader(conn.getInputStream(),"utf-8"));
					while(true) {
						String line=br.readLine();//한 라인을 읽음
						if(line==null) break;//더이상 내용이 없으면 종료
						sb.append(line+"\r\n");//줄바꿈 문자 추가
						
					}//end while
					br.close();//버퍼닫기
				 }//end while
				 conn.disconnect();
				 System.out.println(sb);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

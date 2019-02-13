package ch20;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketExam {
	public static void main(String[] args) {
		//서버 소켓: 서버에서 서비스를 위한 목적으로 만드는 소켓(ip,port)
		ServerSocket socket=null;//서비스를 제공을 위한 소켓(Server용)
		//Socket socket=null;//서비스를 사용을 위한 소켓(Client용)
		//포트 번호 :0-65535 내에서 배정이 가능하고 중복이 되면 안된다.
		//1port 1servise(포트가 겹치면 충돌해)
		//well known port number(자주 사용하는 포트 번호)
		//80: 웹 서비스, 21:FTP서비스, 445:파일 공유, 3389:원격접속
		//(대체적으로 이렇게 사용되고 바꿀 수도 있어, 그러나 충돌 가능성이 있기에 이런 번호는 가급적 피해야 한다.)
		for(int i=0; i<65535; i++) {
			try {
				socket=new ServerSocket(i);//서버 소켓 생성
				socket.close();//소켓 서비스 종료
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용 중입니다.");
				//사용중인 포트는 피해서 사용해야 한다.
			}
		}//end for
		System.out.println("포트 검사를 마쳤습니다.");
	}
}

package ch20;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website="http://post.phinf.naver.net/MjAxODA0MjBfMTQx/MDAxNTI0MjAxNzU5OTIw.DJ-DVnLeGz_XASdjjdaV4gcfc4XfKs5FiSAPJsrVzJMg.wCpdm5GnQTyrU4Si3eqH1PhMM9s1ZrgHnsV1bxfNFaAg.JPEG/IMzCajo9AG81_xQKM0BNaJHw3aZ4.jpg";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);
		//바이트 배열
		byte[] buffer=new byte[4096];//버퍼용 바이트 배열
		//파일로 저장 <== 프로그램<==서버 의 이미지 파일
		//try~with문(Java1.7부터 도입)
		//try(리소스 선언부){}catch(Exception e){}
		//finally가 없어도 리소스가 자동 으로 종료됨
		try(InputStream in =url.openStream(); OutputStream out = new FileOutputStream("d:\\test.jpg")) {
			int length=0; //length 읽은 바이트수 리턴
			//읽은 바이트수 = 스트림.read(버퍼)
			while((length=in.read(buffer)) !=-1) {
				System.out.println(length+"바이트 읽음.");
				//출력 스트림.write(버퍼, 시작인덱스, 길이)
				out.write(buffer,  0, length);
			}//end while
			System.out.println("다운로드가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

package ch20;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage2 {
	public static void main(String[] args) throws Exception {
		String website = "http://cafefiles.naver.net/20130608_163/duran011_13706591894056cooE_JPEG/picspeed_-1353794283.jpg";
		System.out.println("다운로드를 시작합니다.");
		InputStream in=null;
		OutputStream out=null;
		URL url = new URL(website);
		byte[] buffer = new byte[5000];
		try {
			in = url.openStream();
			out = new FileOutputStream("d:\\Lion.jpg");
			int length = 0;
			while ((length = in.read(buffer)) != -1) {
				System.out.println(length + "바이트 읽음");
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(in !=null) in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(out !=null) out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

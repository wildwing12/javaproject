package ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		MemberDTO m1 = new MemberDTO("Kim", 30,"010-2030-1111", "87123-11111", "1234");
		MemberDTO m2 = new MemberDTO("park", 28,"010-2030-2222", "89123-11111", "1234");
		MemberDTO m3 = new MemberDTO("hong", 25,"010-2030-3333", "82123-11111", "1234");
		try {
			// 파일 저장을 위한 출력 스트림생성
			fos = new FileOutputStream("d:\\object.dat");
			// 메모리에 있는 객체를 파일로 저장하기 위한 스트림 생성
			oos = new ObjectOutputStream(fos);
			oos.writeObject(m1);// m1객체를 파일에 저장
			oos.writeObject(m2);// m1객체를 파일에 저장
			oos.writeObject(m3);// m1객체를 파일에 저장
			System.out.println("객체를 파일로 저장했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 역직렬화 처리
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("d:\\object.dat");
			ois = new ObjectInputStream(fis);
			MemberDTO dto1 = (MemberDTO) ois.readObject();
			// 다형성
			MemberDTO dto2 = (MemberDTO) ois.readObject();
			MemberDTO dto3 = (MemberDTO) ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

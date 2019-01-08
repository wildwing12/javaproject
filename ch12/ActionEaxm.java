package ch12;

public class ActionEaxm {
	public static void main(String[] args) {
		Action action = new Action() {//생성자 만들고 중가로 끝에;하면 익명 클레스가 만들어진다.
			//이벤트 처리를 위해서 1회성으로 사용한다.
			public void exec() {
				System.out.println("exec");
			}//method
		};//익면 클레스
//		Action action= new MyAction();
//		action.exec();
		
	}
}

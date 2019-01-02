package ch08;

public class MyManager {
	private int score;
	
	private MyManager(int score) {
		this.score=score;
		
	}//싱글톤 처리된 생성자는  private static+클레스명+ 참조변수명;
	private static MyManager mgr;
	public static MyManager getInstance() {
		if(mgr==null) {
			mgr=new MyManager(10); 
		}
		return mgr;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}
}

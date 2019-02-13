package ch18;

public class Missile {
	private int mx;
	private int my;
	protected int getMx() {
		return mx;
	}
	protected void setMx(int mx) {
		this.mx = mx;
	}
	protected int getMy() {
		return my;
	}
	protected void setMy(int my) {
		this.my = my;
	}
	@Override
	public String toString() {
		return "Missile [mx=" + mx + ", my=" + my + "]";
	}
	
}

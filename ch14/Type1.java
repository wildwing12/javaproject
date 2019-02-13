package ch14;

public class Type1 {
	int value;
	
	public int getvalue() {
		return value;
	}
	public void setvalue(int value) {
		this.value=value;
		
	}
	public static void main(String[] args) {
		Type1 t= new Type1();
		t.setvalue(100);
		
		System.out.println(t.getvalue());
	}
}

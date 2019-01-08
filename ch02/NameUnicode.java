package ch02;

public class NameUnicode {
	public static void main(String[] args) {
		char aValue = '\uAE40';
		char bValue ='\uC885';
		char cValue = '\uD559';
		
		System.out.print(aValue);
		System.out.print(bValue);
		System.out.println(cValue);
		
		System.out.println("char형(\'\\uAE40') : " + aValue);
		System.out.println("char형(\'\\uC885') : " + bValue);
		System.out.println("char형(\'\\uD559') : " +cValue);
	}

}

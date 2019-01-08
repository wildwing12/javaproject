package ch05;
//3차운 배열 : 배열명  = new [면][행][열]
public class Array3Dim {
	public static void main(String[] args) {
		String[][][] subject = {{{"JS01","AL02","PY03","DS04"}
		,{"JSP","알고리즘","파이썬", "자료구조"}//과목명
		,{"이길동","김길동","곽길동","홍길동"}},//지도교수
		{{"CS01","SC02","CS03","SC04"},//코드명
		{"생활영어","경제학","생활체육","스포츠"},//과목명
		{"구길동","성길동","최길동","황길동"}}};//지도교수
		System.out.println(subject[0][1][0]);
		for(int i=0; i<subject.length; i++) {//면
			for(int j=0; j<subject[i].length; j++) {//행
				for(int k=0; k<subject[i][j].length; k++) {
					System.out.println("["+i+"]"+"["+k+"] : "+subject[i][j][k]);
				}
			}
		}
		System.out.println("================================================");
	}

}

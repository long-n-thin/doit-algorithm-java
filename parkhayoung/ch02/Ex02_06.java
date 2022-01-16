package ch02;

public class Ex02_06 {
	// Q6. 기수 변환 - 배열에 윗자리를 넣어두는 메서드 작성
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 변환한 수의 자릿수
	    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    do {
	      d[digits++] = dchar.charAt(x % r); // x를 r로 나눈 나머지를 배열 d에 저장 - 연산 순으로 저장
	      x /= r;
	    }while (x!=0);
	    
	    // 배열d를 다시 역순으로 정렬
	    for(int i=0; i<digits/2; i++) {
	    	char temp = d[i];
	    	d[i] = d[digits -1 -i];
	    	d[digits -1 -i] = temp;
	    }
	    return digits;
	}

	public static void main(String[] args) {
		int num = 59;	// 변환하는 정수
		int cd = 2;		// 기수
		char[] cno = new char[32];	// 변환 후 각 자리의 숫자를 넣어두는 문자 배열
		int dno = cardConv(num, cd, cno);	// 변환 후 자릿수
		
		System.out.printf("%d을 %d진수로 변환\n", num, cd);
		for(int i=0; i<dno; i++) {
			System.out.print(cno[i]);
		}
	}

}

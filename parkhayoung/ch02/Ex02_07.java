package ch02;

import java.util.Scanner;

public class Ex02_07 {
	//  Q7. 기수 변환 과정을 자세히 나타내는 프로그램을 작성
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 변환한 수의 자릿수
	    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    do {
	    	if(digits == 0) {
	    		System.out.printf("%d|%6d\n", r, x);
		    	System.out.println(" +------");
	    	}else if (x / r != 0) {
	    		System.out.printf("%d|%6d  ...%d\n", r, x ,x % r);
	            System.out.println(" +------");
	    	}else {
	    		System.out.printf("%8d  ...%d\n", x ,x % r);
	    	}
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
		Scanner sc = new Scanner(System.in);
	    int num;
	    int cd;
	    char[] cno = new char[32];
	    
	    System.out.println("10진수를 기수변환합니다.");
	    System.out.print("변환하는 음이 아닌 정수: ");
	    num = sc.nextInt();
	    System.out.print("어떤 진수로 변환할까요?(2-36): ");
	    cd = sc.nextInt();
	    sc.close();
	    
	    int dno = cardConv(num, cd, cno);
	    
	    for (int i = 0; i < dno; i++) {
	      System.out.print(cno[i]);
	    }
	}

}

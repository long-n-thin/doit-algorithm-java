package ch02;

import java.util.Scanner;

public class Ex02_07 {
	//  Q7. ��� ��ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ�
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // ��ȯ�� ���� �ڸ���
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
		    d[digits++] = dchar.charAt(x % r); // x�� r�� ���� �������� �迭 d�� ���� - ���� ������ ����
		    x /= r;
	    }while (x!=0);
	    
	    // �迭d�� �ٽ� �������� ����
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
	    
	    System.out.println("10������ �����ȯ�մϴ�.");
	    System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
	    num = sc.nextInt();
	    System.out.print("� ������ ��ȯ�ұ��?(2-36): ");
	    cd = sc.nextInt();
	    sc.close();
	    
	    int dno = cardConv(num, cd, cno);
	    
	    for (int i = 0; i < dno; i++) {
	      System.out.print(cno[i]);
	    }
	}

}

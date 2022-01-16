package ch02;

public class Ex02_06 {
	// Q6. ��� ��ȯ - �迭�� ���ڸ��� �־�δ� �޼��� �ۼ�
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // ��ȯ�� ���� �ڸ���
	    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    do {
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
		int num = 59;	// ��ȯ�ϴ� ����
		int cd = 2;		// ���
		char[] cno = new char[32];	// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ���� �迭
		int dno = cardConv(num, cd, cno);	// ��ȯ �� �ڸ���
		
		System.out.printf("%d�� %d������ ��ȯ\n", num, cd);
		for(int i=0; i<dno; i++) {
			System.out.print(cno[i]);
		}
	}

}

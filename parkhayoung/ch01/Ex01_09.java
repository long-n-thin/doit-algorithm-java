package ch01;

public class Ex01_09 {
	
	// Q9. ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ�
	// a, b ���� ���� �� ���ϴ� �޼���
	public static int sumof(int a, int b) {
	    int result = 0;
	    // a�� ũ�� a~b, b�� ũ�� b~a  
	    for (int i = (a < b ? a : b); i <= (a < b ? b : a); i++) {
	      result += i;
	    }
	    return result;
	  }

	public static void main(String[] args) {
		 System.out.println(sumof(1, 10));
	}
}

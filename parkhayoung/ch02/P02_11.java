package ch02;

public class P02_11 {
	// �ǽ����� �Ҽ� �Ǻ��ϱ� �������� 2 - n�� ������ ���� � �Ҽ��ε� ������ �������� ������ �Ҽ�
	public static void main(String[] args) {
		int ptr = 0;      // ã�� �Ҽ��� ����
	    int[] prime = new int[500];  // ã�� �Ҽ��� �����ϴ� �迭

	    prime[ptr++] = 2; // 2�� �Ҽ��̹Ƿ� prime[0]�� ����
	    prime[ptr++] = 3; // 3�� �Ҽ��̹Ƿ� prime[1]�� ����

	    for(int n=5; n<=100; n +=2) { // Ȧ����
	      boolean flag = false;
	      for(int i=1; prime[i] * prime[i] <= n; i++){   // �Ҽ��� �������� n ���� �϶�
	        if(n % prime[i] == 0) { // ������ �������� �Ҽ��� �ƴ�
	          flag = true;
	          break;
	        }
	      }

	      if(!flag)  // ������ ���� ������ �������� ������
	        prime[ptr++] = n;  // �Ҽ��̹Ƿ� �迭�� ����
	    }

	    // ã�� �Ҽ� ���
	    for(int i=0; i<ptr; i++){
	      System.out.println(prime[i]);
	    }
	}

}
package ch01;

import java.util.Scanner;

public class Ex01_07 {

	public static void main(String[] args) {
		// Q7. n�� 7�̸� ��1 + 2 + 3 + 4 + 5 + 6 + 7 = 28���� ����ϴ� ���α׷��� �ۼ�
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("1���� n������ ��");
		System.out.print("n�� ����");
		int n = scan.nextInt();
		scan.close();
		
		int sum = 0;
	    for (int i = 1; i <= n; i++) {
	    	if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
	    	sum += i;
	    }
	    System.out.println(" = " + sum);
	}
}

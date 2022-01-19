package ch03;

import java.util.Scanner;

public class Exercise01 {
	static int SeqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		for(; i<=n; i++) {
			if(a[i] == key)
				break;
		}
		
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = scan.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = scan.nextInt();
		}
		
		System.out.println("�˻��Ұ�:");
		int ky = scan.nextInt();
		
		int idx = SeqSearchSen(x, num, ky);
		
		if (idx == -1) 
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}

}

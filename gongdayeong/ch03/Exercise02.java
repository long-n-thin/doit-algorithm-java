package ch03;

import java.util.Scanner;

public class Exercise02 {

	static int SeqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		System.out.printf("   |");
		for(int j=0; j<n; j++)
			System.out.printf("%3d",j);
		System.out.println();
		
		System.out.println("---+----------------------");
		
//		System.out.print("---+");
//		for (int k = 0; k < 4 * n + 2; k++)
//			System.out.print("-");
//		System.out.println();
		
		while(i < n) {
			System.out.printf("   |");
			for(int j=0;j<=n;j++) {
				if(j == i)
					System.out.printf("%3s","*");
				else
					System.out.printf("%3s","");
			}
			
			System.out.println();
			
			System.out.printf("  "+i+"|");
			for(int k=0; k<n; k++)
				System.out.printf("%3d",a[k]);
			System.out.println();
			
			if(a[i] == key)
				break;
			
			i++;
		}
		
		return i == n ? -1 : i;
		
//		for (int i = 0; i < n; i++) {
//			System.out.print("   |");
//			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
//			System.out.printf("%3d|", i);
//			for (int k = 0; k < n; k++)
//				System.out.printf("%4d", a[k]);
//			System.out.println("\n   |");
//			if (a[i] == key)
//				return i;
//		}
//		return -1;
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

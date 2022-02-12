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
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("요솟수:");
		int num = scan.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]:");
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색할값:");
		int ky = scan.nextInt();
		
		int idx = SeqSearchSen(x, num, ky);
		
		if (idx == -1) 
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}

}

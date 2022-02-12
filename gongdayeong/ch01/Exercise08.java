package ch01;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		
		int n = scan.nextInt();
		
		int sum = 0;
		int j = n;
		
		for(int i = 1; i<=n; i++) {
			// (1+n)+(2+(n-1))+(3+(n-2)) ..
			sum += (i+j);
			
			j--;
		}
		
		// 두 번 더했으므로 나누기 2
		System.out.print((sum/2));
		
		// int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); but 이 연산을 써야한다고 함.. 뭐여?
	}
}

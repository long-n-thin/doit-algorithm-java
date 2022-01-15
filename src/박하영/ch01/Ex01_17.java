package 박하영.ch01;

import java.util.Scanner;

public class Ex01_17 {
	
	// Q17. n단의 숫자 피라미드를 출력하는 메서드 작성
	public static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");	// 공백
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			System.out.print("단수는 ：");
			n = scan.nextInt();
		} while (n <= 0);
		scan.close();
		
		npira(n); 	
	}
}

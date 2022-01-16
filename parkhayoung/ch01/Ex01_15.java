package 박하영.ch01;

import java.util.Scanner;

public class Ex01_15 {
	
	// Q15. 직각 이등변 삼각형을 출력하는 메서드를 작성
	
	// 왼쪽 아래가 직각인 이등변 삼각형
	public static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	public static void triangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	public static void triangleRU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");	// 공백
			}
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print("*");	// *
			}
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	public static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");	// 공백
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");	// *
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이등변 삼각형을 출력합니다.");
		int n;
		do {
			System.out.print("단수는 ：");
			n = scan.nextInt();
		} while (n <= 0);
		scan.close();
		
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n);

		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n); 

		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n); 

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n);
	}
}

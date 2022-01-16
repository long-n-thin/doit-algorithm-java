package ch01;

import java.util.Scanner;

public class Ex01_14 {

	// Q14. 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

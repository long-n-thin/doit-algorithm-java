package 박하영.ch01;

import java.util.Scanner;

public class Ex01_11 {
	
	// Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성 
	// 135를 입력하면 ‘그 수는 3자리입니다’라고 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("=== 양의 정수값 자리수 구하기 ===");
		System.out.print("양의 정수값 : ");
		int n = scan.nextInt();
		scan.close();
		
		int count = 0;
		while(n > 0) {
			n /= 10;
			count++;
		}
		
		System.out.println("그 수는 " + count + "자리 입니다.");
	}
}

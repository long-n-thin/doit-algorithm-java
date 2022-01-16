package ch02;

import java.util.Scanner;

public class Ex02_08 {
	// Q8. 실습 2_13의 dayOfYear 메서드를 while문 사용으로 작성
	static int[][] mdays = {
						      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 윤년 일수
						      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 평년 일수
						  	};
	
	// 서기 year년은 윤년인가? (윤년: 1/ 평년: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	// 경과 일 수 구하기
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0) {	// 인덱스는 m-1
			d += mdays[isLeap(y)][m-1];	// 전달까지의 일 수 합 
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("그 해의 경과 일수를 구합니다.");
		
		System.out.print("년? ");
		int year = sc.nextInt();
		System.out.print("월? ");
		int month = sc.nextInt();
		System.out.print("일? ");
		int day = sc.nextInt();
		sc.close();
		
		System.out.printf("%s일이 경과되었습니다.", dayOfYear(year, month, day));
	}
}

package ch02;

import java.util.Scanner;

public class P02_13 {
	// 실습문제 그 해 경과 일 수 구하기
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
		int days = d;	// 일수
		for (int i = 1; i < m; i++)	// 1월 ~ (m-1)월의 일수를 더함 
			days += mdays[isLeap(y)][i - 1];
		return days;
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
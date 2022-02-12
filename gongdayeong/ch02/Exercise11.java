package ch02;

import java.util.Scanner;

public class Exercise11 {

	static class YMD {
		
		int y;
		int m;
		int d;
		
		static int[][] mdays = {
				{31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
				{31,29,31,30,31,30,31,31,30,31,30,31}, // 윤년
		};
		
		// year 윤년/평년 구분 
		static int isLeap(int year) {
			return (year%4 == 0 && year%100 != 0 || year%400 == 0) ? 1:0; // 1:윤년, 0:평년
		}
		
		public YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		YMD after(int n) { // 반환 자료형 객체 선언 가넝
			YMD temp = new YMD(this.y, this.m, this.d);
			
			if(n < 0) // 예외처리 같은데 왜 다른 함수로 넘기는지?
				return (before(-n));
			
			temp.d += n;
			
			while(temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m-1];
				if(++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			
			return temp;
		}
		
		YMD before(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			
			if(n < 0) // 예외처리 같은데 왜 다른 함수로 넘기는지?
				return (after(-n));
			
			temp.d -= n;
			
			while(temp.d < 0) {
				temp.d += mdays[isLeap(temp.y)][temp.m-1];
				if(--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
			}
			
			return temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = scan.nextInt();
		System.out.print("월：");
		int m = scan.nextInt();
		System.out.print("일：");
		int d = scan.nextInt();
		YMD oYmd = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = scan.nextInt();

		YMD d1 = oYmd.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = oYmd.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}

}

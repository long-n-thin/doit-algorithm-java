package ch02;

import java.util.Scanner;

public class Exercise11 {

	static class YMD {
		
		int y;
		int m;
		int d;
		
		static int[][] mdays = {
				{31,28,31,30,31,30,31,31,30,31,30,31}, // ���
				{31,29,31,30,31,30,31,31,30,31,30,31}, // ����
		};
		
		// year ����/��� ���� 
		static int isLeap(int year) {
			return (year%4 == 0 && year%100 != 0 || year%400 == 0) ? 1:0; // 1:����, 0:���
		}
		
		public YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		YMD after(int n) { // ��ȯ �ڷ��� ��ü ���� ����
			YMD temp = new YMD(this.y, this.m, this.d);
			
			if(n < 0) // ����ó�� ������ �� �ٸ� �Լ��� �ѱ����?
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
			
			if(n < 0) // ����ó�� ������ �� �ٸ� �Լ��� �ѱ����?
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

		System.out.print("��¥�� �Է��ϼ���.\n");
		System.out.print("�⣺");
		int y = scan.nextInt();
		System.out.print("����");
		int m = scan.nextInt();
		System.out.print("�ϣ�");
		int d = scan.nextInt();
		YMD oYmd = new YMD(y, m, d);

		System.out.print("�� �� ��/���� ��¥�� ���ұ��?��");
		int n = scan.nextInt();

		YMD d1 = oYmd.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = oYmd.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
	}

}

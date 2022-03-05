package jichangjin.ch05.exam;

import java.util.Scanner;

class HanoiEx {

	static int cnt;
//	static String[] name = { "A기둥", "B기둥", "C기둥" };
	static StringBuilder sb = new StringBuilder();

	// 원반을 x기둥에서 y기둥으로 옮김
	static void move(int no, int x, int y) {
		cnt++;

		if (no > 1) 
			move(no - 1, x, 6 - x - y);
		
		sb.append(x + " " + y + "\n");

//		System.out.println("원반[" + no + "]를 " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");
//		System.out.println(x + " " + y);

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		move(n, 1, 3); // 1기둥에 쌓인 n개를 3기둥에 옮김
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
}

package ch05;

import java.util.Scanner;

// 05-3 하노이의 탑
// 너무너무 어렵다.. 재귀 자체도 헷갈리는데 하노이의 탑 규칙까지 적용해서 이해하려니 느므나 헷갈렸다

public class Hanoi_Q6 {
	private static void move(int no, int x, int y) {
		// 기둥
		char[] arr = {'A','B','C'};
		
		if(no > 1)
			move(no-1, x, 6-x-y);
		
		System.out.println("원반["+no+"]을 "+arr[x-1]+"기둥에서 "+arr[y-1]+"기둥으로 옮김");
		
		if(no > 1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = stdIn.nextInt();
		
		move(n,1,3);
	}
}

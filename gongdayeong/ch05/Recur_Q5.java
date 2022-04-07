package ch05;

import java.util.Scanner;
import java.util.Stack;
//메소드 recur3의 비재귀적구현

public class Recur_Q5 {
	// 메소드 recur의 비재귀적 구현
	static void recur3(int n) {
		Stack<Integer> nstk = new Stack<Integer>();
		Stack<Integer> sstk = new Stack<Integer>();
		int sw = 0;

		// sw 변수로 재귀반복 완료 단계 구분
		// sw=0 : 어떠한 재귀문도 실행되지 않음
		// sw=1 : 첫번째 재귀문 recur3(n-1) 처리 완료
		// sw=2 : 두번쨰 재귀문 recur3(n-2) 처리 완료 
		while (true) {
			if (n > 0) {
				nstk.push(n);
				sstk.push(sw);

				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0; // n-1 부터 연산하기 위함
				}
				continue;
			}
			
			do {
				n = nstk.pop();
				sw = sstk.pop() + 1;

				if (sw == 2) {
					System.out.println(n);
					if (nstk.isEmpty())
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		recur3(x);
	}

}

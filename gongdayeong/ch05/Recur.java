package ch05;

import java.util.Scanner;

public class Recur {

	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		recur(x);
	} 

}

// 소스 하향식, 상향식 분석
// stack 구조로 변경
// 하다보니까.. 재귀함수가 자기 자신 1,2,3,..n번 모두 호출 한 후 n번째부터 다시 거꾸로 올라오는 과정인듯..?
// 그래서 stack 구조와 동일한 느낌..?

// 재귀함수는 스택에 쌓이는거라 메모리부족 발생할 수 있음
// 이를 방지하기 위해 꼬리 재귀 제거 필요 -> 언어별로 컴파일러에서 꼬리 재귀 최적화를 지원
// 재귀 함수를 사용할땐 꼬리 재귀 최적화를 지원하는 언어에서 사용하는게 좋음
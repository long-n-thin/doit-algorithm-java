package ch05;

import java.util.Scanner;
import java.util.Stack;

// 우왕 풀었다ㅠㅠ
public class Hanoi_Q7 {
	private static void move(int no, int x, int y) {
		Stack<Integer> nstack = new Stack<Integer>();
		Stack<Integer> xstack = new Stack<Integer>();
		Stack<Integer> ystack = new Stack<Integer>();
		
		Stack<Integer> sstack = new Stack<Integer>();
		
		int sw = 0;
		
		while(true) {
			if(no > 1 && sw == 0) {
				nstack.push(no);
				xstack.push(x);
				ystack.push(y);
				sstack.push(sw);
				
				no = no-1;
				y = 6-x-y;
				
				continue;
			}
			
			if(no == 1 && sw == 0) { // no=1 인 경우, 스택에 쌓지않고 바로 출력
				System.out.println("원반["+no+"]을 "+x+"기둥에서 "+y+"기둥으로 옮김");
				sw = 1;
				
				continue;
			} else if(nstack.isEmpty() != true) { // no>1 인 경우, 스택에 쌓인 데이터 pop하여 출력
				no = nstack.pop();
				x = xstack.pop();
				y = ystack.pop();
				sw = sstack.pop()+1;
				
				System.out.println("원반["+no+"]을 "+x+"기둥에서 "+y+"기둥으로 옮김");
			}
			
			if(no > 1 && sw == 1) {
				no = no-1;
				x = 6-x-y;
				
				sw = 0;
				continue;
			}
			
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = stdIn.nextInt();
		
		move(n,1,3);
	}
}

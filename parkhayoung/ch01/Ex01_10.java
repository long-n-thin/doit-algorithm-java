package ch01;

import java.util.Scanner;

public class Ex01_10 {
	
	// Q10. 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성 
	// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력받음
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.print("a 값 : ");
		int a = scan.nextInt();

		int b;
		while(true) {
			System.out.print("b 값 : ");
			b = scan.nextInt();
			if(b > a) break;
			System.out.println(a+"보다 큰 값을 입력");
		}
		scan.close();
		
		System.out.println("b - a = " + (b - a));
	    
	}
}

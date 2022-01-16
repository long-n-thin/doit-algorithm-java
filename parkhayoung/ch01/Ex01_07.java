package ch01;

import java.util.Scanner;

public class Ex01_07 {

	public static void main(String[] args) {
		// Q7. n이 7이면 ‘1 + 2 + 3 + 4 + 5 + 6 + 7 = 28’로 출력하는 프로그램을 작성
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("1부터 n까지의 합");
		System.out.print("n의 값：");
		int n = scan.nextInt();
		scan.close();
		
		int sum = 0;
	    for (int i = 1; i <= n; i++) {
	    	if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
	    	sum += i;
	    }
	    System.out.println(" = " + sum);
	}
}

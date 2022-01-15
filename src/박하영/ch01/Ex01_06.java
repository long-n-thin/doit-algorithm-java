package 박하영.ch01;

import java.util.Scanner;

public class Ex01_06 {

	public static void main(String[] args) {
		// Q6. 실습 1-4에서 while문이 종료될 때 변수 i 값이 n + 1이 됨을 확인한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
	    System.out.print("n의 값: ");
	    int n = scan.nextInt();
	    scan.close();

	    int sum = 0;
	    int i = 1;
	    while (i <= n) {
	      sum += i;
	      i++;
	    }
	    
	    System.out.println("1부터 " + n + "까지의 합 : " + sum);
	    System.out.println("i : " + i);
	}
}

package 박하영.ch01;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		// Q8. 가우스의 덧셈 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("1부터 n까지의 합");
		System.out.print("n의 값：");
		int n = scan.nextInt();
	    scan.close();
	    
	    // 수의 개수가 짝수면 (마지막 숫자 + 1)에 (마지막 숫자 / 2)를 곱하고
	    // 홀수면 가운데 남는 숫자 = (마지막 숫자 + 1)/2f 를 더한다.	    
	    int result = (n + 1) * (n / 2);;
	    if(n % 2 != 0) {
	    	result += (n + 1) / 2;
	    }
	    System.out.println("1부터 " + n + "까지의 합 : " + result);
	}
}

package ch01;

import java.util.Scanner;

public class Exercise09 {
	static int sumof(int a, int b) {
		int min = 0;
		int max = 0;
		int sum = 0;
		
		if(a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("startNum: ");
		int startNum = scan.nextInt();
		
		System.out.print("endNum: ");
		int endNum = scan.nextInt();
		
		System.out.println(sumof(startNum,endNum));
	}
}
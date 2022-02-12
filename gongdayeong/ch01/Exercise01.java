package ch01;

public class Exercise01 {
	static int max4(int a, int b, int c, int d) {
		int maxNum = a;
		
		if(maxNum < b) {
			maxNum = b;
		}
		
		if(maxNum < c) {
			maxNum = c;
		}
		
		if(maxNum < d) {
			maxNum = d;
		}
		
		return maxNum; 
	}
	
	public static void main(String[] args) {
		System.out.println(max4(8,5,7,9));
	}
}

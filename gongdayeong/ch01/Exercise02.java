package ch01;

public class Exercise02 {
	static int min3(int a, int b, int c) {
		int maxNum = a;
		
		if(maxNum > b) {
			maxNum = b;
		}
		
		if(maxNum > c) {
			maxNum = c;
		}
		
		return maxNum; 
	}
	
	public static void main(String[] args) {
		System.out.println(min3(1,1,1));
	}
}

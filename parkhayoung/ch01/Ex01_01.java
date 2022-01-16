package 박하영.ch01;

public class Ex01_01 {
	//Q1. 네 값의 최댓값을 구하는 m4 메서드를 작성한다.
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("5, 8, 7, 3 중 최댓값? : " + max4(5,8,7,3));
	}
}

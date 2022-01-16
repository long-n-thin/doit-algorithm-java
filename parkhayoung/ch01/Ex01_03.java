package ch01;

public class Ex01_03 {
	// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성한다.
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		if(min > d) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("5, 8, 3, 10 중 최솟값? : " + min4(5,8,3,10));
	}
}

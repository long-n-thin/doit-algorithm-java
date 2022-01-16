package 박하영.ch01;

public class Ex01_02 {
	// Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성한다.
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("5, 8, 3 중 최솟값 : " + min3(5,8,3));
	}
}

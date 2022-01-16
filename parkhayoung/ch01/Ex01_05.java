package 박하영.ch01;

public class Ex01_05 {
	// Q5. 중앙값을 구하는 2개의 메서드 중 1번이 더 효율적인 이유는 무엇인가?
	
	// 1번
	static int median1(int a, int b, int c) {
		if (a >= b)
			if (b >= c) return b;
			else if (a <= c) return a;
			else return c;
		else if (a > c) return a;
		else if (b > c) return c;
		else return b;
	}

	// 2번
	static int median2(int a, int b, int c) {
	    if ((b >= a && c <= a) || (b <= a && c >= a))
	        return a;
	    else if ((a > b && c < b) || (a < b && c > b))
	        return b;
	    return c;
	}
	
	public static void main(String[] args) {
		System.out.println("5, 8, 3 의 중앙값 : " + median1(5,8,3));
		System.out.println("5, 8, 3 의 중앙값? : " + median2(5,8,3));
	}
}

/*
 * <answer>
 *  - 2번 메서드 같은 경우 첫번째 if문에서 수행하는 비교(b >= a, c <= a 등)을
 *  - 그 아래, else if문에서 또 다시 수행하게 된다.
 *  - 따라서 1번은 최대 3번의 비교를 하는 반면 2번은 최대 8번의 비교를 하므로
 *  - 1번이 더 효율성이 좋은 알고리즘이다.
 */

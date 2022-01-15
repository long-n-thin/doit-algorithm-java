package ���Ͽ�.ch01;

public class Ex01_05 {
	// Q5. �߾Ӱ��� ���ϴ� 2���� �޼��� �� 1���� �� ȿ������ ������ �����ΰ�?
	
	// 1��
	static int median1(int a, int b, int c) {
		if (a >= b)
			if (b >= c) return b;
			else if (a <= c) return a;
			else return c;
		else if (a > c) return a;
		else if (b > c) return c;
		else return b;
	}

	// 2��
	static int median2(int a, int b, int c) {
	    if ((b >= a && c <= a) || (b <= a && c >= a))
	        return a;
	    else if ((a > b && c < b) || (a < b && c > b))
	        return b;
	    return c;
	}
	
	public static void main(String[] args) {
		System.out.println("5, 8, 3 �� �߾Ӱ� : " + median1(5,8,3));
		System.out.println("5, 8, 3 �� �߾Ӱ�? : " + median2(5,8,3));
	}
}

/*
 * <answer>
 *  - 2�� �޼��� ���� ��� ù��° if������ �����ϴ� ��(b >= a, c <= a ��)��
 *  - �� �Ʒ�, else if������ �� �ٽ� �����ϰ� �ȴ�.
 *  - ���� 1���� �ִ� 3���� �񱳸� �ϴ� �ݸ� 2���� �ִ� 8���� �񱳸� �ϹǷ�
 *  - 1���� �� ȿ������ ���� �˰����̴�.
 */

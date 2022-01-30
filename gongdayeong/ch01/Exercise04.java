package ch01;

public class Exercise04 {
	static int med3(int a, int b, int c) {

		int medNum = a;

		if (medNum >= b) {
			if (medNum > c) {
				if (b > c) {
					medNum = b;
				} else {
					medNum = c;
				}
			}
		} else {
			medNum = b;

			if (medNum >= c) {
				if (a > c) {
					medNum = a;
				} else {
					medNum = c;
				}
			}
		}

		return medNum;

// [Ç®ÀÌ]
//		if (a >= b) {
//			if (b >= c) {
//				return b;
//			} else if (a <= c) {
//				return a;
//			} else {
//				return c;
//			}
//		} else if (b < c) {
//			return b;
//		} else if (a > c) {
//			return a;
//		} else {
//			return c;
//		}
	}

	public static void main(String[] args) {	
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a£¾b£¾c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a£¾b£½c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a£¾c£¾b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a£½c£¾b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c£¾a£¾b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a£½b£¾c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a£½b£½c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c£¾a£½b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b£¾a£¾c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b£¾a£½c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b£¾c£¾a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b£½c£¾a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c£¾b£¾a
	}
}

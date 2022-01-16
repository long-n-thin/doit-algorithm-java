package ch01;

public class Ex01_09 {
	
	// Q9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성
	// a, b 사이 정수 합 구하는 메서드
	public static int sumof(int a, int b) {
	    int result = 0;
	    // a가 크면 a~b, b가 크면 b~a  
	    for (int i = (a < b ? a : b); i <= (a < b ? b : a); i++) {
	      result += i;
	    }
	    return result;
	  }

	public static void main(String[] args) {
		 System.out.println(sumof(1, 10));
	}
}

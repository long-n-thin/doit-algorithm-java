package 박하영.ch01;

public class Ex01_13 {
	
	// Q13. 덧셈을 출력하는 프로그램을 작성 
	public static void main(String[] args) {
		// 위쪽 수 출력
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		// 행 출력
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
}

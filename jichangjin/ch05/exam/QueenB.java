package jichangjin.ch05.exam;

public class QueenB {

	static int[] pos = new int[3]; // 각 열의 퀸의 위치, index : col, value : row
	static boolean[] flag = new boolean[3];
	static int cnt;
	
	// 각 열의 퀸의 위치를 출력합니다.
	static void print() {
		for (int i = 0; i < 3; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}

	// i열에 퀸을 놓습니다.
	static void set(int i) {
		for (int j = 0; j < 3; j++) {
			if(!flag[j]) {
				cnt++;
				pos[i] = j; // 퀸을 j행에 배치합니다.
				if (i == 2) // 모든 열에 배치합니다.
					print();
				else {
					flag[j] = true; // 차일드 노드를 호출하기 전 현재 확정된 퀸의 위치
					set(i + 1); // 다음 열에 퀸을 배치합니다.
					flag[j] = false; // 차일드 노드를 호출한 다음에는 해당 행의 퀸의 위치 초기화
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0); // 0열에 퀸을 배치합니다.
		System.out.println(cnt);
	}
}

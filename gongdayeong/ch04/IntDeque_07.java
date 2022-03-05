package ch04;

public class IntDeque_07 {
	private int max; // 큐의 용량
	private int frontA; // 맨 앞 커서
	private int rearA; // 맨 뒤 커서
	private int frontB; // 맨 앞 커서
	private int rearB; // 맨 뒤 커서
	private int num; // 현재의 데이터 수
	private int[] que; // 큐의 본체

	// 실행할 때 예외：큐가 비어 있음
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// 생성자
	public IntDeque_07(int capacity) {
		num = frontA = rearA  = frontB = rearB = 0;
		max = capacity;
		try {
			que = new int[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // 큐가 가득 참
		que[rearA++] = x;
		num++;
		if (rearA == max)
			rearA = 0;
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 큐가 비어 있음
		int x = que[frontB++];
		num--;
		if (frontB == max)
			frontB = 0;
		return x;
	}

	// 큐에서 데이터를 피크(머리데이터를 살펴봄)
	public int peek() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // 큐가 비어 있음
		return que[front];
	}

	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색성공
				return idx;
		}
		return -1; // 검색실패
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 터(이터를 머리→꼬리의 차례로 나타냄
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}

	public int search(int x) {
		int index = 0;

		for (int i = 0; i <= num; i++) {
			index = (i + front) % max;

			if (que[index] == x)
				return i + 1;
		}

		return 0;
	}
}

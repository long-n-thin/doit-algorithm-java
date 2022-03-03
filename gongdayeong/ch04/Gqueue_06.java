package ch04;

public class Gqueue_06<E> {
	// 실행할 때 예외：큐가 비어 있음
	public class EmptyGQueueException extends RuntimeException {
		public EmptyGQueueException() {
		}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowGQueueException extends RuntimeException {
		public OverflowGQueueException() {
		}
	}

	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;

	// 생성자
	public Gqueue_06(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max]; // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public E enque(E x) throws OverflowGQueueException {
		if (num >= max)
			throw new OverflowGQueueException(); // 큐가 가득 참
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 큐에서 데이터를 디큐
	public E deque() throws EmptyGQueueException {
		if (num <= 0)
			throw new EmptyGQueueException(); // 큐가 비어 있음
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 큐에서 데이터를 피크(머리데이터를 살펴봄)
	public E peek() throws EmptyGQueueException {
		if (num <= 0)
			throw new EmptyGQueueException(); // 큐가 비어 있음
		return que[front];
	}

	// 큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(E x) {
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
}

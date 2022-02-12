package ch04;

public class IntCircularQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] q;

    public static class QueueEmptyException extends RuntimeException {
        public QueueEmptyException() {
            System.out.println("Queue is empty.");
        }
    }

    public static class QueueFullException extends RuntimeException {
        public QueueFullException() {
            System.out.println("Queue is full.");
        }
    }

    public IntCircularQueue(int size) {
        this.max = size;
        this.front = 0;
        this.rear = 0;
        this.num = 0;
        q = new int[size];
    }

    public boolean isEmpty() {
        return num == 0;
    }

    public boolean isFull() {
        return max == num;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new QueueFullException();
        }

        q[rear++ % max] = value;
        num++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }

        int res = q[front];
        q[front++ % max] = 0;
        num--;

        return res;
    }

    public int peek() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }

        return q[front];
    }

    public int capacity() {
        return max;
    }

    public void clear() {
        q = new int[max];
        num = front = rear = 0;
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.print(q[(i + front) % max] + " ");
        }
        System.out.println();
    }

    /**
     * Q5 임의의 데이터 검색
     *
     * @param value 찾을 데이터 값
     * @return 있으면 데이터가 있는 인덱스 반환, 없으면 -1 반환
     */
    public int search(int value) {
        for (int i = 0; i < num; i++) {
            if (value == q[(i + front) % max]) {
                return (i + front) % max;
            }
        }

        return -1;
    }
}

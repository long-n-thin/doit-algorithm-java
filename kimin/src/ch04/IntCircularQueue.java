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
        return q[front];
    }

    public int capacity() {
        return max;
    }

    public void clear() {
        q = new int[max];
        num = 0;
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.print(q[(i + front) % max] + " ");
        }
        System.out.println();
    }
}

package ch04;

public class GQueue<E> {
    private int front;
    private int rear;
    private int max;
    private int num;
    private E[] q;

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

    public GQueue(int size) {
        this.max = size;
        this.num = 0;
        this.front = 0;
        this.rear = 0;
        q = (E[]) new Object[size];
    }

    public boolean isEmpty() {
        return num==0;
    }

    public boolean isFull() {
        return num== max;
    }

    public void enqueue(E value) {
        if (isFull()) {
            throw new QueueFullException();
        }

        q[rear++ % max] = value;
        num++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }

        E res = q[front];

        q[front++ % max] = null;
        num--;

        return res;
    }

    public E peek() {
        if (isFull()) {
            throw new QueueEmptyException();
        }

        return q[front];
    }

    public void clear() {
        q = (E[]) new Object[max];
        num = front = rear = 0;
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.print(q[(i + front) % max] + " ");
        }
        System.out.println();
    }
}

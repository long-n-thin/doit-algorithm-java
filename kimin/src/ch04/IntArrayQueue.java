package ch04;

public class IntArrayQueue {
    private int max;
    private int num;
    private int[] q;

    public static class QueueOverflowException extends RuntimeException {
        public QueueOverflowException() {
            System.out.println("Queue is full.");
        }
    }

    public static class QueueEmptyException extends RuntimeException {
        public QueueEmptyException() {
            System.out.println("Queue is empty.");
        }
    }

    public IntArrayQueue(int size) {
        this.max = size;
        this.num = 0;
        this.q = new int[size];
    }

    public boolean isEmpty() {
        return num == 0;
    }

    public boolean isFull() {
        return num == max;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new QueueOverflowException();
        }

        q[num++] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }

        int front = q[0];

        if (num > 0) {
            for (int i = 0; i < num - 1; i++) {
                q[i] = q[i + 1];
            }
        }
        q[--num] = 0;

        return front;
    }

    public int peek() {
        if (num == 0) {
            throw new QueueEmptyException();
        }

        return q[0];
    }

    public void clear() {
        q = new int[max];
        num = 0;
    }

    public int capacity() {
        return max;
    }

    public StringBuffer dump() {
        StringBuffer str = new StringBuffer();

        str.append("[");
        for (int i = 0; i < num; i++) {
            str.append(q[i]);

            if (i < num - 1) {
                str.append(", ");
            }
        }
        str.append("]");

        return str;
    }
}

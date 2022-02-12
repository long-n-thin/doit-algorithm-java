package _04_stack_and_queue;

public class Queue {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue(5);
        System.out.println(queue.enque("data"));;
        System.out.println(queue.enque("data2"));;
        System.out.println(queue.enque("data3"));;
        System.out.println(queue.enque("data4"));;
        System.out.println(queue.enque("data5"));;
        queue.dump();
        System.out.println(queue.deque());;
        System.out.println(queue.deque());;
        System.out.println(queue.deque());;
        System.out.println(queue.deque());;
        System.out.println(queue.enque("data6"));;
        System.out.println(queue.enque("data7"));;
        queue.dump();
        System.out.println(queue.indexOf("data5"));;
        System.out.println(queue.search("data5"));;
        System.out.println(queue.search("data6"));;
        System.out.println(queue.search("data7"));;

    }

}

class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){};
    }
    public class OverFlowQueueException extends RuntimeException {
        public OverFlowQueueException() {};
    }
    public IntQueue(int capacity) {
        num =  front = rear =0;
        max = capacity;
        try {
            que = new int[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }
    public  int enque(int x) throws OverFlowQueueException {
        if(num >= max) {
            throw new OverFlowQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }
    public int deque() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }
    public int peek() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    public int intOf(int x) {
        for(int i= 0 ;i<num ; i++) {
            int idx = (i+front)%max;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }

    public int capacity() {
        return max;
    }
    public int size() {
        return num;
    }
    public boolean isEmpty() {
        return num<=0;
    }

    public boolean isFull() {
        return num>=max;
    }
    public void dump() {
        if(num <=0)
            System.out.println("queue's size is 0");
        else {
            for(int i=0 ; i<num ; i++) {
                System.out.print(que[(i+front) % max] + " ");

            }
            System.out.println();
        }
    }

}

class EmptyIntQueueException extends RuntimeException {
    public EmptyIntQueueException(){};
}
class OverFlowQueueException extends RuntimeException {
    public OverFlowQueueException() {};
}

/**
 * q5 create generic queue
 * @param <E>
 */
class GenericQueue<E> {
    private int max;
    private int front;
    private int rear;
    private int num;
    private E[] que;

    public GenericQueue(int capacity) {
        num =  front = rear =0;
        max = capacity;
        try {
            que = (E[]) new Object[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }
    public  E enque(E x) throws OverFlowQueueException {
        if(num >= max) {
            throw new OverFlowQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }
    public E deque() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        E x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }
    public E peek() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    public int indexOf(E x) {
        for(int i= 0 ;i<num ; i++) {
            int idx = (i+front)%max;
            if(que[idx] == x)
                return idx;
        }
        return -1;
    }

    /**
     * q5 search queue seq
     * @param x
     * @return
     */
    public int search(E x) {
        for(int i= 0 ;i<num ; i++) {
            int idx = (i+front)%max;
            if(que[idx] == x)
                return i+1;
        }
        return 0;
    }

    public int capacity() {
        return max;
    }
    public int size() {
        return num;
    }
    public boolean isEmpty() {
        return num<=0;
    }

    public boolean isFull() {
        return num>=max;
    }
    public void dump() {
        if(num <=0)
            System.out.println("queue's size is 0");
        else {
            for(int i=0 ; i<num ; i++) {
                System.out.print(que[(i+front) % max] + " ");

            }
            System.out.println();
        }
    }

}
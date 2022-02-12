package ch04;

public class Main {
    public static void main(String[] args) {
//        IntStack stack = new IntStack(4);
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.pop();
//        stack.dump();
//        stack.push(4);
//        stack.push(5);
//        stack.dump();
//        stack.pop();
//        stack.peek();
//        stack.peek();
//        stack.dump();
//        stack.delete();
//        System.out.println(stack.isEmpty());
//        stack.dump();

//        LinkedStack stack = new LinkedStack();
//        System.out.println("1 isEmpty: " + stack.isEmpty());
//        stack.push(1);
//        System.out.println("2 isEmpty: " + stack.isEmpty());
//        stack.push(2);
//        stack.push(3);
//        System.out.println("3 peek: " + stack.peek());
//        System.out.println("4 peek: " + stack.peek());
//        int popped = stack.pop();
//        System.out.println("5 popped: " + popped);
//        System.out.println("6 peek: " + stack.peek());
//        int popped1 = stack.pop();
//        System.out.println("7 popped: " + popped1);
//        stack.pop();
//        int popped2 = stack.pop();
//        System.out.println("8 popped: " + popped2);
//        System.out.println("9 isEmpty: " + stack.isEmpty());
//        System.out.println("10 peek: " + stack.peek());
//        stack.push(4);
//        System.out.println("11 isEmpty: " + stack.isEmpty());
//        System.out.println("12 peek: " + stack.peek());
//        stack.delete();
//        System.out.println("13 isEmpty: " + stack.isEmpty());
//        System.out.println("14 peek: " + stack.peek());

        // TODO: Q4 선형 큐(p.146)
//        IntArrayQueue arrq = new IntArrayQueue(5);
//        System.out.println("capacity: " + arrq.capacity());
//        System.out.println("isEmpty: " + arrq.isEmpty());
//        arrq.enqueue(1);
//        int dq = arrq.dequeue();
//        System.out.println("dequeue: " + dq);
//        arrq.enqueue(2);
//        arrq.enqueue(3);
//        arrq.enqueue(4);
//        System.out.println("isFull: " + arrq.isFull());
//        System.out.println("peek: " + arrq.peek());
//        System.out.println("dump: " + arrq.dump());
//        arrq.clear();
//        System.out.println("dump: " + arrq.dump());
//        arrq.dequeue();

        IntCircularQueue cq = new IntCircularQueue(5);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.dequeue();
        cq.enqueue(3);
        cq.dequeue();
        cq.enqueue(4);
        cq.dequeue();
        cq.enqueue(5);
        System.out.println("peek: " + cq.peek());
        cq.enqueue(6);
        cq.enqueue(7);
        cq.enqueue(8);
        cq.dump();
        // TODO: Q5 임의의 데이터 검색 함수
        int value = 6;
        System.out.println("search for " + value + " index at: " + cq.search(value));
    }
}

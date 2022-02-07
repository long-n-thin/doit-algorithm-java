package ch04;

public class IntStack {
    int[] stack;
    int top;
    int max;

    public IntStack(int size) {
        this.stack = new int[size];    // T = O(1), S = O(n)
        this.top = -1;               // T = O(1)
        this.max = size - 1;

        System.out.println("Stack created with size of " + size);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return max == top;
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflow();
        }

        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackEmpty();
        }

        System.out.println(stack[top]);

        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new StackEmpty();
        }

        System.out.println(stack[top]);

        return stack[top];
    }

    public void dump() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);

            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void delete() {
        top = -1;
    }

    public static class StackOverflow extends RuntimeException {
        public StackOverflow() {
            System.err.println("Stack is full.");
        }
    }

    public static class StackEmpty extends RuntimeException {
        public StackEmpty() {
            System.err.println("Stack is empty.");
        }
    }

}

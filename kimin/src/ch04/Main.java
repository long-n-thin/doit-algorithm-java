package ch04;

public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.dump();
        stack.push(4);
        stack.push(5);
        stack.dump();
        stack.pop();
        stack.peek();
        stack.peek();
        stack.dump();
        stack.delete();
        System.out.println(stack.isEmpty());
        stack.dump();
    }
}

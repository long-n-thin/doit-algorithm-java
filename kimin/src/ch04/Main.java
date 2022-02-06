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

        LinkedStack stack = new LinkedStack();
        System.out.println("1 isEmpty: " + stack.isEmpty());
        stack.push(1);
        System.out.println("2 isEmpty: " + stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println("3 peek: " + stack.peek());
        System.out.println("4 peek: " + stack.peek());
        int popped = stack.pop();
        System.out.println("5 popped: " + popped);
        System.out.println("6 peek: " + stack.peek());
        int popped1 = stack.pop();
        System.out.println("7 popped: " + popped1);
        stack.pop();
        int popped2 = stack.pop();
        System.out.println("8 popped: " + popped2);
        System.out.println("9 isEmpty: " + stack.isEmpty());
        System.out.println("10 peek: " + stack.peek());
        stack.push(4);
        System.out.println("11 isEmpty: " + stack.isEmpty());
        System.out.println("12 peek: " + stack.peek());
        stack.delete();
        System.out.println("13 isEmpty: " + stack.isEmpty());
        System.out.println("14 peek: " + stack.peek());

    }
}

package ch04;

public class LinkedStack {
    LinkedList linkedList;

    public LinkedStack() {
        linkedList = new LinkedList();
    }

    public void push(int value) {
        linkedList.insertSingleLinkedList(value, 0);
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    public int pop() {
         if (isEmpty()) {
             return -1;
         } else {
             int value = linkedList.head.value;
             linkedList.deleteNode(0);

             return value;
         }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    public void delete() {
        linkedList.deleteStack();
    }
}

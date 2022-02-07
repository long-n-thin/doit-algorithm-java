package ch04;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public void  insertSingleLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Stack doesn't exist.");
        } else if (location == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;

            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }

            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;

            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
        }
    }

    public void deleteStack() {
        head = tail = null;
    }
}

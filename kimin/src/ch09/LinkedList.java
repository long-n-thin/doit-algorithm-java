package ch09;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    public LinkedList() {
        head = tail = null;
    }

    public LinkedList(int val) {
        Node node = new Node(val, null);
        head = tail = node;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int val) {
        if (isEmpty()) {    // 빈 리스트면 맨 앞에 추가
            addFirst(val);
        } else {    // 이미 노드가 있으면 마지막에 추가
            addLast(val);
        }
    }

    public void add(int val, int position) {
        if (position == 0) {
            addFirst(val);
        } else if (position >= size) {
            addLast(val);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void addFirst(int val) {
        if (isEmpty()) {
            Node node = new Node(val, null);
            head = tail = node;
        } else {
            head = new Node(val, head);
        }
        size++;
    }

    public void addLast(int val) {
        if (isEmpty()) {
            addFirst(val);
        } else {
            Node last = tail;
            Node node = new Node(val, null);
            last.next = node;
            tail = node;
        }
        size++;
    }

    public boolean remove() {
        return removeFirst();
    }

    public boolean remove(int position) {
        if (isEmpty() || position >= size) return false;
        if (position == 0) return removeFirst();

        Node node = head;
        for (int i = 0; i < position - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;

        return true;
    }

    public boolean removeFirst() {
        if (isEmpty()) return false;

        head = head.next;
        size--;
        return true;
    }

    public boolean removeLast() {
        if (isEmpty()) return false;

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        tail = prev;
        prev.next = null;
        size--;
        return true;
    }

    public int search(int val) {
        if (isEmpty()) return -1;

        Node node = head;
        for (int i = 0; i < size; i++) {
            if (node.val == val) return i;
            node = node.next;
        }

        return -1;
    }

    public int searchAt(int index) {
        if (isEmpty() || index >= size) return -1;

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
        } else {
            Node node = head;
            for (int i = 0; i < size; i++) {
                System.out.print("[" + i + "]" + node.val + "  ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty Linked List";
        }

        StringBuilder sb = new StringBuilder();
        Node node = head;
        while (node != null) {
            sb.append(node.val).append(' ');
            node = node.next;
        }

        return sb.toString();
    }
}

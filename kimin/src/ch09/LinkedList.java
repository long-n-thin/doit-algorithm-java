package ch09;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    public LinkedList() {
        head = tail = null;
    }

    public LinkedList(int val) {
        Node node = new Node(val);
        head = tail = node;
        node.next = node.prev = node;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(int val) {
        addLast(val);
        return true;
    }

    public void add(int val, int index) {
        if (index == 0) {
            addFirst(val);
        } else if (index >= size) {
            addLast(val);
        } else {
            Node temp;
            if (index < size /2) {
                temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
            } else {
                temp = tail;
                for (int i = size; i > index; i--) {
                    temp = temp.prev;
                }
            }
            Node node = new Node(val);
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
            size++;
        }
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            node.prev = tail;
            head = node.next.prev = node;
        }
        size++;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head = node;
        } else {
            Node last = tail;
            last.next = node;
            node.next = head;
            node.prev = last;
        }
        tail = node;
        size++;
    }

    public boolean remove() {
        return removeFirst();
    }

    public boolean remove(int index) {
        if (isEmpty() || index >= size) return false;
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        Node node;
        if (index < size / 2) {
            node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = size; i > index; i--) {
                node = node.prev;
            }
        }
        node.next = node.next.next;
        node.next.prev = node;
        size--;

        return true;
    }

    public boolean removeFirst() {
        if (isEmpty()) return false;
        if (size == 1) {
            clear();
            return true;
        }

        head = head.next;
        head.prev = tail;
        size--;
        return true;
    }

    public boolean removeLast() {
        if (isEmpty()) return false;

        tail = tail.prev;
        tail.next = head;
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

    public int get(int index) {
        if (isEmpty() || index >= size) return -1;

        Node node;
        if (index < size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node.val;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
        } else {
            StringBuilder sb = new StringBuilder();
            Node node = head;
            for (int i = 0; i < size; i++) {
                sb.append("[").append(i).append("]").append(node.val).append(' ');
                node = node.next;
            }
            System.out.println(sb);
        }
    }

    public void traverse(int start, int end) {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
        } else {
            StringBuilder sb = new StringBuilder();
            Node node;
            int idx;
            if (start < size / 2) {
                node = head;
                idx = 0;
                for (int i = 0; i < start; i++) {
                    node = node.next;
                    idx++;
                }
            } else {
                node = tail;
                idx = size - 1;
                for (int i = size - 1; i > start; i--) {
                    node = node.prev;
                    idx--;
                }
            }
            for (int i = 0; i < end - start + 1; i++) {
                sb.append('[').append(idx % size).append(']').append(node.val).append(' ');
                node = node.next;
                idx = ++idx % size;
            }
            System.out.println(sb);
        }
    }

    public void traverseReverse() {
        if (isEmpty()) {
            System.out.println("Empty Linked List");
        } else {
            StringBuilder sb = new StringBuilder();
            Node node = tail;
            for (int i = size - 1; i >= 0; i--) {
                sb.append('[').append(i).append(']').append(node.val).append(' ');
                node = node.prev;
            }
            System.out.println(sb);
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
        for (int i = 0; i < size; i++) {
            sb.append(node.val).append(' ');
            node = node.next;
        }

        return sb.toString();
    }
}

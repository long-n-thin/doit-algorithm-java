package ch09;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(3);
        ll.addFirst(4); // 맨 앞에 노드 삽입
        ll.add(5);
        ll.add(6, 2);   // 2번 인덱스에 노드 삽입
        ll.addLast(7);  // 맨 뒤에 노드 삽입
        ll.traverse();

        ll.clear(); // 모든 노드 삭제
        System.out.println(ll);

        for (int i = 0; i < 5; i++) {
            ll.add((i + 1) * 10);
        }
        ll.traverse();  // 현재 리스트 노드 인덱스와 값 출력
        System.out.println(ll.search(30));  // 값이 있는 경우
        System.out.println(ll.search(60));  // 값이 없는 경우
        System.out.println(ll.searchAt(2));  // 인덱스가 범위 내
        System.out.println(ll.searchAt(5));  // 인덱스가 범위 밖

        ll.remove(2);   // 2번 인덱스 노드 삭제
        ll.traverse();
        ll.remove(0);   // 0번 인덱스(맨 앞) 노드 삭제
        ll.traverse();
        ll.remove(3);   // 인덱스가 크기를 넘어가면 아무것도 안함
        ll.traverse();

        System.out.println(ll); // 현재 리스트 노드 목록 출력
        ll.removeFirst();   // 맨 앞 노드 삭제
        System.out.println(ll);
        ll.removeLast();    // 마지막 노드 삭제
        System.out.println(ll);
    }
}

# 큐

가장 먼저 넣은 데이터를 가장 먼저 나오는 선입선출(First In First Out)인 점이 스택과 다릅니다.
큐란: 스택과 마찬가지로 데이터를 일시적으로 쌓아 두기 위한 자료구조
인큐 enqueue 데이터를 넣은 작업
디큐 dequeue 데이터를 꺼내는 작업
데이터를 꺼내는 쪽을  front
데이터를 넣는 쪽을 rear

배열로 구현한 큐

(디큐 시 배열의 모든 요소를 앞으로 옮겨야 하는 단점이 있다)
시간 복잡도는 O(n)

https://github.com/jchj108/doit-algorithm-java/blob/jichangjin/jichangjin/ch04/exam/IntAryQueue_04_04.java

링 버퍼 : 배열의 처음이 끝과 연결되었다고 보는 자료구조
링 버퍼로 구현한 큐
(시간 복잡도는 O(1) 이지만 크기가 정해져 있다는 단점이 있다)
https://github.com/jchj108/doit-algorithm-java/blob/jichangjin/jichangjin/ch04/exam/IntAryQueue_04_04.java

큐 클래스 IntQueue

1. 큐로 사용할 배열 que
2. 큐의 최대 용량 max
3. 프런트 front
4. 리어 rear
5. 현재 데이터 수 num

인큐 메서드 enque 인큐에 성공하면 인큐한 값을 그래도 반환합니다.
디큐 메서드 deque  큐에서 데이터를 디큐하고 그 값을 반한하는 메서드 입니다.
피크 메서드 peek 
검색 메서드 indexOf
모든 요소를 삭제하는 메서드 clear
최대 용량을 확인하는 메소드 capacity
데이터 수를 확인하는 메소드 size
큐가 비어 있는지 검사하는 메소드 IsEmpty
큐가 가득 찼는지 검사하는 메서드 IsFull
큐안에 모든 데이터를 표시하는 메서드 dump

나머지 연산을 통해 인큐 상한을 두지 않은 링버퍼 큐

https://github.com/jchj108/doit-algorithm-java/blob/jichangjin/jichangjin/ch04/exam/IntQueue_04_05.java

참고 영상

https://youtu.be/BdsyG5yP1cQ?list=LL


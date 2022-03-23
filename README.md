# doit-algorithm-java

[두잇 자료구조와 함께 배우는 알고리즘 입문 - 자바 편] 스터디 내용 정리

- [doit-algorithm-java](#doit-algorithm-java)
  - [스터디 개요](#스터디-개요)
  - [깃헙 PR 참여방법](#깃헙-pr-참여방법)
    - [Repo 구조](#repo-구조)
  - [스터디 진행표](#스터디-진행표)

## 스터디 개요

- 기간: 2022-01-09 ~ 2022-05-08 (16주, 스터디 진행표 참고)
- 시간: 매주 일요일 오전 10시
- 장소: 디스코드에서 온라인 모임
- 방식: 도서 내 원하는 주제에 대해 자율적으로 발표 참여 및 연습문제 풀이 코드 PR 보내기

## 깃헙 PR 참여방법

- 현재 Repo를 fork -> 본인 계정으로 Repo 복사됨
- 로컬에서 본인 Repo를 클론
  - `git clone https://github.com/<본인계정>/doit-algorithm-java.git`
- 새로운 브랜치 생성 후 해당 브랜치에서 작업
  - `git checkout -b <branch name>`
  - 코드는 본인 이름으로 디렉터리 생성해서 챕터별로 작성
  - 내용 정리는 `../archives`에 마크다운으로 작성
    - 파일명 형식은 `chXX_<타이틀>.md`로 작성
    - 이미지는 `../archives/src`에 저장
- 작업한 내용 커밋 후 푸쉬하기
  - `git push -set--upstream origin <branch name>`
- 본인 Repo 들어가서 PR 보내기
- 해당 주차 모임 전 머지 후 코드 리뷰

### Repo 구조

```doc
/
├─ archives
│    ├─ chXX_title.md
│    └─ ...
├─ src
│    ├─ image_title.jpg
│    └─ ...
├─ <본인이름>
│    ├─ chXX
│    └─ ...
(예시)
├─ kimin
│    ├─ ch01
│    │    └─ 이하_자유롭게_작업.java
│    └─ ...
└─ ...
```

## 스터디 진행표

| 주차/일자 |	일시 | 진행	|    | 내용 | 발표자1 | 발표자2|
|:---:|:----:|:---:|:---:|:---|:---:|:---:|
| 1주차	 | 1/16 |	1장 | 기본 알고리즘 |	01-1 알고리즘이란?<br>01-2 반복 | 김인 | |
|       |      | 2장 | 기본 자료구조 | 02-1 배열<br>02-2 클래스 | 조성경 | 김인 |
| 2주차	 | 1/23 | 3장 | 검색        | 03-1 검색 알고리즘<br>03-2 선형 검색<br>03-3 이진 검색 | 조성경 | 김인 |
| 3주차	 | 1/30 |    |            | 설 연휴 휴식 | | |
| 4주차	 | 2/6  |	4장 | 스택과 큐	  | 04-1 스택 | 김인 | |
|       |      |    |            | JVM, MEMORY | 김성택 | |
| 5주차	 | 2/13	| 4장 | 스택과 큐	  | 04-2 큐 | 지창진 | |
| 6주차	 | 2/20 | 5장 | 재귀 알고리즘 | 05-1 재귀의 기본<br>05-2 재귀 알고리즘 분석 | 조성경 | |
|       |      |    |            | [#31 JVM 추가 설명](https://github.com/long-n-thin/doit-algorithm-java/issues/31) | 김성택 | |
| 7주차	 | 2/27 |    | 	          | 연기 | | |
| 8주차	 | 2/27 | 5장 | 재귀 알고리즘 | 05-3 하노이의 탑<br>05-4 8퀸 문제 | 지창진 | |
| 9주차	 | 3/6	| 6장 | 정렬	       | 06-1 정렬<br>06-2 버블 정렬<br>06-3 단순 선택 정렬<br>06-4 단순 삽입 정렬 | 김인 | |
| 10주차 | 3/13 | 6장 | 정렬	       | 06-5 셀 정렬<br>06-6 픽 정렬<br>06-7 병합 정렬<br>06-8 힘 정럴<br>06-9 도수 정럴 | | |
| 11주차 | 3/20	| 7장 | 집합	       | 07-1 집합<br>07-2 배열로 집합 만들기 | 조성경 | |
| 12주차 | 3/27 |	8장 | 문자열 검색   | 08-1 브루트 포스법<br>08-2 KMP법<br>08-3 Boyer-Moore법 | 지창진 | |
| 13주차 | 4/3  | 9장 | 리스트	     | 09-1 선형 리스트<br>09-2 포인터로 연결 리스트 만들기 | 김인 | |
| 14주차 | 4/10 | 9장 | 리스트	     | 09-3 커서로 연결 리스트 만들기<br>09-4 원형 이중 연결 리스트 | 김인 | | 
| 15주차 | 4/17 | 10장 | 트리	     | 10-1 트리<br>10-2 이진트리와 이진검색트리(1/2) | 조성경 | | 
| 16주차 | 4/24 | 10장 | 트리       | 10-2 이진트리와 이진검색트리(2/2) | 조성경 | | 
| 17주차 | 5/1  | 11장 | 해시       | 11-1 해시법 | 지창진 | |

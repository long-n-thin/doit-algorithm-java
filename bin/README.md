# doit-algorithm-java

[두잇 자료구조와 함께 배우는 알고리즘 입문 - 자바 편] 스터디 내용 정리

- [doit-algorithm-java](#doit-algorithm-java)
  - [스터디 개요](#스터디-개요)
  - [깃헙 PR 참여방법](#깃헙-pr-참여방법)
    - [Repo 구조](#repo-구조)

## 스터디 개요

- 기간: 2022-01-09 ~ 2022-04-24 (16주, 스터디 진행표 참고)
- 시간: 매주 일요일 오전 10시
- 장소: 디스코드에서 온라인 모임
- 방식: 원하는 주제에 대해 자율적으로 발표 참여 및 연습문제 풀이 코드 PR 보내기

## 깃헙 PR 참여방법

- 현재 Repo를 fork -> 본인 계정으로 Repo 복사됨
- 로컬에서 본인 Repo를 클론
  - `git clone https://github.com/<본인계정>/doit-algorithm-java.git`
- 새로운 브랜치 생성 후 해당 브랜치에서 작업
  - `git checkout -b  <branch name>`
  - 코드는 `../<본인이름>/chXX` 디렉터리 생성해서 챕터별로 작성
  - 내용 정리는 `../archives`에 마크다운으로 작성
    - 파일명 형식은 `chXX.md`, 챕터와 관련된 추가적인 내용은 `chXX_<관련내용 타이틀>.md`로 작성
    - 이미지는 `../archives/src`에 저장
- 작업한 내용 커밋 후 푸쉬하기
  - `git push -set--upstream origin <branch name>`
- 본인 Repo 들어가서 PR 보내기
- 해당 주차 모임시간에 코드 리뷰 후 머지

### Repo 구조

```doc
/
├─ archives
│    ├─ chXX.md
│    ├─ chXX_additional_related_subject.md
│    ├─ ...
│    └─ ...
├─ src
│    ├─ chXX_img1.png
│    ├─ random_image_title.jpg
│    ├─ ...
│    └─ ...
├─ <본인이름>
│    ├─ chXX
│    ├─ chXX
│    ├─ ...
│    └─ ...
(예시)
├─ kimin
│    ├─ ch01
│    │    └─ 이하_자유롭게_작업.java
│    ├─ ...
│    └─ ch11
├─ ...
└─ ...
```

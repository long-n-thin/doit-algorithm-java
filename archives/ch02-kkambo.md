# 기본 자료구조
### 자료구조
**데이터 단위**와 **데이터 자체** 사이의 **물리적** 또는 **논리 적인 관계**
조금 쉽게 표현하면 **데이터를 어떤 방식으로 표현하거나 저장하는 방법**이다.


#### 만약에 여러분들이 백엔드 프로그래머라면
- DB를 다뤄 검색, 편집, 수정, 추가 등을 어떠한 작업을 해서 프론트로 보냄

#### 프론트엔드 개발자라면
- 백엔드가 던져준 자료형에 맞춰서 효과적으로 화면을 구성하는데 사용

#### 우리는
이 데이터들을 어떻게 정리하냐에 따라 프로그램의 스피드에 영향을 줍니다.

#### 데이터 작업하는 유형
- 검색, 읽기, 삽입, 삭제
- **어떤 데이터구조**는 **정렬에 최적화**, **어떤 데이터 구조** **검색에 최적화**
- **어떤 작업에 어떤 데이터 구조를 언제 어떻게 쓰는지 아는 것이 어플리케이션의 스피드를 좌지우지 합니다.**
- 효과적으로 설계된 자료구조는 프로그램 실행시간을 단축하고 메모리 용량을 최소한으로 사용하며 연산을 수행하도록 해준다.


## 02-1 배열
### 배열의 선언
~~~java
int [] a; //a는 자료형이 int 형인 배열
a = new int[5];//a는 길이가 5인 배열을 참조합니다.

int[] a = new int[5]
~~~
> **int [] arr : 자료형이 int 형인 배열**

- **모든 배열의 요소**가 **동일한 유형** 이라는 사실
- **모든 요소**가 **메모리에서 동일한 크기**를 의미
- 컴퓨터가 index 값을 알면 메모리에서 값을 읽는 것은 간단합니다. 	
  ** (index * elementSize) + startOfArray**

### 단점. 그리고 장점
- 배열의 크기를 배열을 생성할 때 지정하는 것이 불편
- 배열의 크기를 변경할 수 없는 것은 불편
- 배열에서 설정된 엘리먼트의 개수(값이 존재하는)를 알아낼 수 없는 것도 불편
- 정확한 크기를 알기 때문에 메모리 누수가 없다.
- 속도가 빠르다

### NEW 연산자
>int [] arr = **new** int[**5**]; //**a**는 **길이가 5인 배열을 참조**

- **new**는 **클래스 타입의 인스턴스(객체)를 생성**해주는 역할
- new 연산자를 통해 **메모리(Heap 영역)에 데이터를 저장할 공간을 할당**받고
- **공간의 참조값(reference value /해시코드)을 객체에게 반환**한다.

<img src="https://images.velog.io/images/kkambodev/post/5e98533a-2282-491e-aae6-693c44297e07/image.png">

**source**
![](https://images.velog.io/images/kkambodev/post/25455b43-3220-4afb-844d-462c76bea836/image.png)

### 배열의 길이
~~~java
public class CloneArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};       
        System.out.println("a.length = " + a.length);

    }
}
~~~
**a.length** : a배열의 길이를 구한다. (요솟수)
#### length, length(), size의 차이
immuntable Object vs Muntable Object
- immutable Object: 생성후 변경 불가능한 객체

    - String, Boolean, Integer, Float, Long , Array
- **배열은 length**, **문자열은 length()**로 사용한다.
- mutable Object => **size**

    - Collection Framework Type (ex : ArrayList?)

### 배열의 복제
~~~java
public class CloneArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("== a ==");
        for( int i : a){
            System.out.println(i);
        }


        System.out.println("== b ==");
        for( int i : b){
            System.out.println(i);
        }

        System.out.println("a.length = " + a.length);

    }
}
~~~
**a.clone** : 배열을 복제하고 복제한 배열에 대한 참조를 생성한다.
![](https://images.velog.io/images/kkambodev/post/4e6e1e51-0d1a-4bda-854d-b6c224e5df64/image.png)



### 배열의 최대값 구하기
~~~java
public class MaxOfArrayRand {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 다음과 같습니다.");

        for(int i = 0; i< num ; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("최대 값은 " + maxOf(height) + "입니다.");

    }
  
    static int maxOf(int[] a) {

        int max = a[0];

        for(int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
}
~~~

### 들어가기전에...

#### rand(난수)
**source **
> **Random rand = new Random();** : rand 사용하기 위한 변수 선언

- 컴퓨터는 난수 생성이 불가해서 난수 표를 가지고 난수 생성
- seed 값이 동일하면 동일한 순서대로 난수 발생

    - 개인적인 경험 : 음악프로그램 랜덤 재생 / 이전곡 선택 후 다음곡이 동일하다.
    - 동일한 seed를 주지 않기 위해 현재 시간(ms)을 기준으로 seed값을 잡는다.

>**rand.nextInt(90);** : 1~89 까지의 랜덤 생성

#### call by reference, call by value
java의 경우 함수에 전달되는 인자의 데이터 타입에 따라
- **call by value**
  원시 자료형(primitive type) : call-by-value(int, short, long, float, double, char, boolean)
~~~java
int b = 1;
bprint(b);
System.out.println("메인 함수에서의 b = " + b);

private static void bprint(int b) {
        b = 2;
        System.out.println("bprint 메소드 안의 b = " + b);
    }
~~~
- **call by reference**    
  참조 자료형(reference type) : call-by-reference(Array, Class Instance)
~~~java
//함수 호출
System.out.println("최대 값은 " + maxOf(height) + "입니다.");

//메소드
 static int maxOf(int[] a) {

        int max = a[0];

        for(int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
~~~

### 최대값 구하기
~~~java
max = height[0];
if(a[1] > max) max = a[1];
if(a[2] > max) max = a[2];
if(a[3] > max) max = a[3];
if(a[4] > max) max = a[4];
if(a[5] > max) max = a[5];
if(a[6] > max) max = a[6];
.
.
.
~~~

##### for문으로 변경
~~~ java
max = a[0];
for(i = 1; i < n; i++)
	if(a[i] > max) max = a[i];
~~~
- lenear search


### 배열 역순으로 정렬하기
~~~java
public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i = 0; i < a.length/2 ; i++){
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            x[i] = rand.nextInt(num);
            System.out.print("x[" + i + "] = " + x[i] + " ");
        }
        System.out.println();

        reverse(x);

        for(int i = 0; i < num; i++){
            System.out.print("x[" + (num-i-1) + "] = " + x[num-i-1] + " ");
        }
    }
}
~~~
##### 랜덤으로 초기화
~~~java
  	Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];//

        for(int i = 0; i < num; i++){
            x[i] = rand.nextInt(num);
            System.out.print("x[" + i + "] = " + x[i] + " ");
        }
        System.out.println();
~~~
##### 교환
~~~java
static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
~~~
##### SWAP
- x값을 t에 보관
- y값을 x에 대입
- x값을 y에 대입
~~~java
static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
~~~

##### reverse

~~~java
static void reverse(int[] a){
        for(int i = 0; i < a.length/2 ; i++){
            swap(a, i, a.length - i - 1);
        }
    }
~~~

### 두 배열의 비교
- 여기서의 비교는 **모든 요소의 값이 같은가** 입니다.
- 조건

    - 두 배열의 길이를 비교 한다.
    - 처음부터 스캔하며 a[i] 와 b[i]의 값을 비교한다. 값이 다르면 false
    - 반복문이 끝까지 실행되면 true를 반환 한다.

### 기수변환
- 10진수
- 2진수
- 8진수
- 16진수
    - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
    - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15
#### 2진수 보는 법
![](https://images.velog.io/images/kkambodev/post/cda123a4-aafb-4f9d-a551-3f5625f23d3f/image.png)
#### 2진수 구하는 방법
![](https://images.velog.io/images/kkambodev/post/154c5a64-c564-4d95-a85f-518f55526a49/image.png)
- 조건
    - 요구조건 1 : 사용자가 종료하지 않으면 반복한다.
    - 요구조건 2 : 양의 10진수 정수를 변환한다.
    - 요구조건 3 :  2~36진수 변환을 지원한다.

### 소수의 나열
**정의 : 2부터 ~ (n-1) 까지의 어떤 정수로도 나누어 떨어지지 않는 정수**
나눠보기
2
3 : 2
4 : 2 3 4
5 : 2 3 4 5
6 : 2 3 4 5 6
...
~~~java
for(int n = 2; n<= 1000 ; n++) {
            int i;
            
            for(i = 2; i < n; i++){
                counter++;
                if(n %i == 0)
                    break;
            }

            if(n==i)
                System.out.println(n);
        }
~~~
#### 알고리즘 개선
숫자가 2로 나누어 떨어지지 않는다면 당연히 4나 6으로도 나누어 떨어지지 않는다.
11은 2로 나누어 떨어지지 않는다.
11은 4로 나누어 떨어지지 않는다.
11은 6으로도 나누어 떨어지지 않는다.

반대로
12는 2로 나누어 떨어진다
12는 4로도 나누어 떨어진다
12는 6으로도 나누어 떨어진다

**재 정의 : 2부터 (n-1)까지 어떤 소수로도 나누어 떨어지지 않는 정수**
- 조건
- 먼저 2는 소수로 저장한다. **prime[0] = 2**
- 지금까지 구한 소수를 **배열로 저장**한다.
- 짝수는 2로 나누어 덜어지기 때문에 홀수만 비교 한다.

**재 정의 : n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는 정수**

### 다차원 배열
> int[ ][ ] x = new int[2][4];
가로와 세로로 **"행"**과 **"열"**이 늘어선 표 형태의 이미지
~~~java
int [ ][ ] x;
x = new int[2][];
x[0] = new int[4];
x[1] = new int[4];
~~~

#### 한 해의 경과 일 수를 계산하는 프로그램

#### 다차원 배열의 복제
다차원 배열의 복제(clone)는 최상위의 1레벨만 수행합니다.
a[0]과 a[1]은 공유됩니다.




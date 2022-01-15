package chap02;

public interface Bar extends Foo{

    //해당 interface에서는 printNameUpperCase를 제공하고 싶지 않다.
    //추상 메소드로 선언하면 된다.
    //당연히 안하면 기본구현체로 제공이 된다.

    void printNameUpperCase();

    static int sum(int i, int j){
        return i + j;
    }
}

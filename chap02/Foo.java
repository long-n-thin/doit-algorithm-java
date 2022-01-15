package chap02;


import java.util.Locale;

public interface Foo {

    void printName();

    default void printNameUpperCase() {
        System.out.println();
    }

}

package kkambo.chap02;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("*");
        sb.append("*");
        System.out.println("sb = " + sb);
        System.out.println("sb.toString() = " + sb.toString());

    }
}

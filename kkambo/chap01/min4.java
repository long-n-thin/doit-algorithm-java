package kkambo.chap01;

public class min4 {

    public static void main(String[] args) {
        System.out.println("min3(3, 2, 1, 4) = " + min4(3, 2, 1, 4));
        System.out.println("min3(3, 2, 2 ,0) = " + min4(3, 2, 2, 0));
        System.out.println("min3(3, 1, 2, -2) = " + min4(3, 1, 2, -2));
        System.out.println("min3(3, 2, 3, 5) = " + min4(3, 2, 3, 5));
    }

    static int min4(int a, int b, int c, int d){

        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;

    }
}

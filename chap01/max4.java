package chap01;

public class max4 {
    public static void main(String[] args) {
        System.out.println("max4(3, 2, 1, 4) = " + max4(3, 2, 1, 4));
        System.out.println("max4(3, 6, 2, 4) = " + max4(3, 6, 2,4));
        System.out.println("max4(3, 1, 6, 4) = " + max4(3, 1, 6,4));
        System.out.println("max4(6, 2, 3, 5) = " + max4(6, 2, 3,5));
        System.out.println("max4(2, 1, 3, 6) = " + max4(2, 1, 3,6));

    }

    static int max4(int a, int b, int c, int d){
        int max = 0;

        if ( a > max )  max = a;
        if ( b > max )  max = b;
        if ( c > max )  max = c;
        if ( d > max )  max = d;

        return max;
    }
}

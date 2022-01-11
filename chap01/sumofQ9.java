package chap01;

public class sumofQ9 {
    public static void main(String[] args) {
        System.out.println(sumof(1,10));
    }

    static int sumof(int a, int b)
    {
        if(b - a < 0)
            return 0;
        else
            return a+sumof(a+1, b);
    }

}

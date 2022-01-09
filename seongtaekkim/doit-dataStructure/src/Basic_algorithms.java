public class Basic_algorithms {


    public Basic_algorithms() {
        System.out.println(ex7(10));
        System.out.println(sumof(-1,10));
    }


    /**
     * excercise 7
     * sum : 1+2+3+4+ ...
     * @param n
     * @return
     */
    public int ex7(int n) {
        int sum = 0;
        for(int i =0 ; i<n ; i++) {
            sum += i;
        }
        return n*(n+1)/2;
    }


    /**
     * excercise 8
     * sum : 1+2+3+4+ ...
     * result = n * (1 + n / 2
     * @param n
     * @return
     */
    public int ex8(int n) {
        return n*(n+1)/2;
    }

    /**
     * exercise 9
     * sum : 1+2+3 ...
     * result = n * (a + l) / 2
     * @param a
     * @param b
     * @return
     */
    public int sumof(int a, int b) {
        int n = a;
        int max = a;
        if(b > a) {
            n = b - a + 1;
            max = b;
        } else {
            n = a - b + 1;
        }
        return n*(a+max)/2;
    }

}

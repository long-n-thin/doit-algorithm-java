package _01_basic_algorithms;

public class Basic_algorithms {


    public Basic_algorithms() {
/*        System.out.println(max4(4,2,1,6));

        System.out.println(median(3,1,7));
        System.out.println(med3(3,1,7));
        System.out.println(ex6(10));
        System.out.println(ex7(10));
        System.out.println(sumof(-1,10));


        ex10(3,3);
        ex10(2,6);*/
      //  System.out.println(ex11(334234));;
    //    System.out.println(ex11(5));
        ex1213("*");
        ex1213("+");


    }

    /**
     * excercise 1
     * find max num
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        if(max < d) {
            max = d;
        }
        return max;
    }

    /**
     * excercise 2
     * find min num
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int min3(int a, int b, int c) {
        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }
        return min;
    }

    /**
     * excercise 3
     * find min num
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public int min4(int a, int b, int c, int d) {
        int min = a;
        if(min > b) {
            min = b;
        }
        if(min > c) {
            min = c;
        }
        if(min > d) {
            min = d;
        }
        return min;
    }

    /**
     * exercise 4
     * find median value
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int median(int a, int b, int c) {
        if(a>=b) {
            if(b >= c)
                return b;
            else if (c >= a)
                return a;
            else
                return c;
        } else if(a > c) {
            return a;
        } else if (b >c ) {
            return c;
        } else {
            return b;
        }

    }


    /**
     * excercise 5
     * explain it is less efficient than exercise 4
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int med3(int a, int b, int c) {
        if((b>=a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if((a>b && c<b) || (a<b && c>b)) {
            return b;
        }
        return c;
    }

    /**
     * exercise 6
     * find argument+1 value
     * @param n
     * @return
     */
    public int ex6(int n) {
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum += i;
            i++;
        }
        return i;
    }

    /**
     * excercise 7
     * sum : 1+2+3+4+ ...
     * @param n
     *
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


    /**
     * excercise 10
     *
     * @param a
     * @param b
     */
    public void ex10(int a, int b) {
        if(b <= a) {
            System.out.println("Enger a value greater then a");
        } else {
            System.out.println("b-a is " + (b-a));
        }
    }

    /**
     * excercise 11
     *
     * @param n
     * @return
     */
    public String ex11(int n) {
        if(n <= 0) {
            return "Enter a positive integer";
        }

        String str = Integer.toString(n);
        char[] digits = str.toCharArray();
        return "That number is " + digits.length ;
    }

    /**
     * excercise 12, 13
     * 9*9 gogodan print, sum print
     */
    public void ex1213(String operation) {

        System.out.print("  |");
        for(int dan=1 ; dan<=9 ; dan++) {
            System.out.printf("%3d",dan);
        }
        System.out.println();
        for(int dan=1 ; dan<=30 ; dan++) {
            if(dan == 3) {
                System.out.print("+");
            } else{
                System.out.print("-");
            }
        }
        System.out.println();
        for(int row=1 ; row<=9 ; row++) {
            System.out.print(row + " |");
            for(int col=1; col<=9 ; col++){
                if("+".equals(operation))
                    System.out.printf("%3d",row + col);
                else if("*".equals(operation)) {
                    System.out.printf("%3d",row * col);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * exercise 14
     * 입력한 수의 개수만큼 * 문자로 정사각형을 만들어라
     *
     * @param n
     */
    public void ex14(int n) {

        for(int i=0 ;i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
































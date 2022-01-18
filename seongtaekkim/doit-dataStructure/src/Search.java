import java.util.Scanner;

public class Search {
    public Search() {

        /**
         * 03-1 search algorithms
         */

        /** 
         * 03-2 linear search
         */
        q1();

        /**
         * 03-3 binary search
         */
    }

    /**
     * q1
     * sentinel search
     */
    private void q1() {
        new SeqSearchSen();
    }
}

class SeqSearchSen {

    public SeqSearchSen() {
        Scanner stdIn =new Scanner(System.in);
        System.out.print("num of array : ");
        int num = stdIn.nextInt();
        int[] x = new int[num+1];

        for(int i=0 ; i<num ; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("search value : ");
        int key = stdIn.nextInt();

        int idx = seqSearchSen(x, num, key);

        if(idx == -1) {
            System.out.println("no value");

        } else {
            System.out.println("that value's index is : " + idx);
        }
    }

    static int seqSearchSen(int[] a, int n, int key) {
        int i=0;
        a[n] = key;

        while(true) {
            if(a[i] == key)
                break;
            i++;
        }
        for( i=0; i<a.length ; i++) {
            if(a[i] == key) {
                break;
            }
        }
        return i==n ? -1 : i;
    }

}
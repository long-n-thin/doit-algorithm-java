import java.util.Scanner;

public class Search {
    public Search() {

        /**
         * 03-1 search algorithms
         */

        /**
         * 03-2 linear search
         */
        //q1();

        /**
         * 03-3 binary search
         */
/*        int[] a = new int[]{1,3,7,6,3,7,1,4,7};
        int n = a.length;
        int key = 7;
        int[] idx =  null;
        System.out.println(searchIdx(a,n,key,idx));
        System.out.println(idx[2]);*/


        q5();
    }

    /**
     * q1
     * sentinel search
     */
    private void q1() {
        new SeqSearchSen();
    }

    /**
     * q3 linear search
     * find all equal numbers
     */
    private int searchIdx(int[] a, int n, int key, int[] idx) {

        int i=0;
        int j=0;
        int[] tmpArr = new int[n];
        while(true) {
            if(a[i] == key) {
                tmpArr[j++] = i;
            }
            i++;
            if(n == i)
                break;
        }


        if(j==0) {
            return j;
        } else{
            idx = new int[j];
            for(int k=0; i<j; i++) {
                idx[k] = tmpArr[k];
            }
            return j;
        }

    }


    /**
     * q3 find smallest index in binary search
     */
    private void q5() {
        new BinSearch();
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


/**
 * binary search class
 */
class BinSearch {

    public BinSearch() {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("array size is : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("input number by desc");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        for(int i=1; i<num ; i++) {
            do {
                System.out.print("x[" +i +"] : ");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("search value : ");
        int ky = stdIn.nextInt();

        int idx = binSearchX(x,num,ky);
        if(idx == -1){
            System.out.println("not value");
        } else {
            System.out.println(ky + " has x[" + idx +"]");
        }
    }

    static int binSearch(int[] a, int n, int key) {
        int pl =0;
        int pr = n -1;

        do{
            int pc = (pl + pr) /2;
            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc+1;
            else
                pr = pc-1;
        } while(pl <= pr);

        return -1;
    }

    private int binSearchX(int[] a, int n, int key) {
        int pl =0;
        int pr = n -1;

        do{
            int pc = (pl + pr) /2;
            if(a[pc] == key) {

                while(pc > 0) {
                    if(a[pc-1] == key) {
                        pc--;
                    } else {
                        break;
                    }
                }
                return pc;

            } else if(a[pc] < key)
                pl = pc+1;
            else
                pr = pc-1;
        } while(pl <= pr);

        return -1;
    }

}
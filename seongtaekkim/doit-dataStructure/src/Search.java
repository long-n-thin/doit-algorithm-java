import java.util.Arrays;
import java.util.Comparator;
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
/*      int[] a = new int[]{1,3,7,6,3,7,1,4,7};
        int n = a.length;
        int key = 7;
        int[] idx =  null;
        System.out.println(searchIdx(a,n,key,idx));
        System.out.println(idx[2]);*/


        //q5();

       // q6();

        //new IdTester();

        //new GenericClassTester();

        q7();
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
     * q5 find smallest index in binary search
     */
    private void q5() {
        new BinSearch();
    }


    /**
     * q6 print insertion point when the search fails
     */
    private void q6() {
        new BinarySearchTester();
    }

    /**
     * q7 find vision data with function : Array.binarySearch
     */
    private void q7() {
        new PhysExamSearch();
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



class BinarySearchTester {
    public BinarySearchTester() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("length : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("input asc");
        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for(int i=1 ; i<num ; i++){
            do {
                System.out.print("x["+i+"] :");
                x[i] = stdIn.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("number of search : ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x,ky);

        if(idx < 0) {
            System.out.println("insertion point is " + idx);
        } else {
            System.out.println(ky + " is x[" + idx + "]" );
        }
    }
}


class Id {
    private static int counter = 0;
    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}
class IdTester {
    public IdTester() {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a's id : " + a.getId());
        System.out.println("b's id : " + b.getId());

        System.out.println("number of ids granted : " +Id.getCounter());
    }
}


class StringBinarySearch {
    public StringBinarySearch() {
        Scanner stdIn = new Scanner(System.in);

        String[] x = {
                "abstract", "assert", "boolean", "braek", "byte"
        };

        System.out.print("input keyword : ");
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x,ky);

        if(idx < 0) {
            System.out.println("not keyword");
        } else {
            System.out.println("keyword in x[" + idx + "]");
        }

    }
}

/**
 * q7 find vision data
 * vision data sort : Descending
 */
class PhysExamSearch {

    public PhysExamSearch() {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("kim1", 162, 1.0),
                new PhyscData("kim2", 165, 0.8),
                new PhyscData("kim3", 170, 0.6),
                new PhyscData("kim4", 175, 0.4),
                new PhyscData("kim5", 180, 0.2)
        };

        System.out.print("input height : ");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("",height, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0) {
            System.out.println("not value");
        } else {
            System.out.println("value in x[" + idx + "]");
            System.out.println("data : " + x[idx]);
        }

        System.out.print("input vision : ");
        double vision = stdIn.nextDouble();
        idx = Arrays.binarySearch(x, new PhyscData("",0, vision), PhyscData.VISION_ORDER);

        if(idx < 0) {
            System.out.println("not value");
        } else {
            System.out.println("value in x[" + idx + "]");
            System.out.println("data : " + x[idx]);
        }
    }

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height='" + height + '\'' +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            /**
             *
             * @param d1 : mid index's object
             * @param d2 : find index's object
             * @return
             */
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                /**
                 * Since it's in ascending order, if d1(mid) is greater than d2(key), decrement the index(mid).
                 */
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            /**
             *
             * @param d1 : mid index's object
             * @param d2 : find index's object
             * @return
             */
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                System.out.println(d1.vision + " " + d2.vision);
                /**
                 * Since it's in descending order, if d2(key) is greater than d1(mid), increment the index(mid).
                 */
                return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
            }
        }
    }

}


/**
 * generic example
 * @param <T>
 */
class GenericClassTester<T> {
    public GenericClassTester() {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());

    }
    static class GenericClass<T> {
        private T xyz;
        public GenericClass(T xyz) {
            this.xyz = xyz;
        }
        T getXyz() {
            return xyz;
        }
    }
}


























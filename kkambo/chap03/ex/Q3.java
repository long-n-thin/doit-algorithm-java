package kkambo.chap03.ex;

public class Q3 {

    static int searchIdx(int[] a, int key, int[] idx){
        int idx_key=0;

        for(int i = 0; i < a.length ; i++){
            if( a[i] == key){
                idx[idx_key] = i;
                idx_key++;
            }
        }
        return idx_key;

    }

    public static void main(String[] args) {
        int [] a = {1, 9, 2, 9, 4, 6, 7, 9};
        int [] idx = new int[8];
        int key = 9;

        int result = searchIdx(a, key, idx);

        System.out.println("9와 동일한 개수는 " + result  + "입니다.");

        for(int i = 0; i < result ; i++){
            System.out.printf("a[%d] ", idx[i]);
        }
    }
}

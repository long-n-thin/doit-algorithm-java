package kkambo.chap02;

public class CloneArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("== a ==");
        for( int i : a){
            System.out.println(i);
        }


        System.out.println("== b ==");
        for( int i : b){
            System.out.println(i);
        }
    }
}

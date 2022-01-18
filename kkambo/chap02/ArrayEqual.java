package kkambo.chap02;

import java.util.Scanner;

public class ArrayEqual {

    static boolean equals(int[] a, int[] b){

        if (a.length != b.length)
            return false;

        for(int i = 0; i < a.length ; i++)
            if(a[i] != b[i])
                return false;

        return true;
    }

    static void copy(int[] a, int[] b){
        for(int i = 0 ; i < b.length ; i++){
            a[i] = b[i];
        }
    }

    static void rcopy(int[] a, int[] b){
        for(int i = 0; i< a.length ; i++){
            a[i] = b[a.length-1-i];
        }
    }

    static void printArray(int[] a){

        for(int i = 0; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 a의 요솟수 : ");
        int na = scanner.nextInt();

        int[] a = new int[na];

        for(int i = 0; i < na; i++){
            System.out.print("a[" + i +"] = ");
            a[i] = scanner.nextInt();
        }

        System.out.println("배열 b의 요솟수 : ");
        int nb = scanner.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i < nb; i++){
            System.out.print("b[" + i +"] = ");
            b[i] = scanner.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지않습니다."));
        printArray(a);
        printArray(b);



        rcopy(a, b);
        printArray(a);
        printArray(b);

        copy(a,b);
        printArray(a);
        printArray(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

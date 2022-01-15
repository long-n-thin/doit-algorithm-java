package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("키 값은 다음과 같습니다.");

        for(int i = 0; i< num ; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("최대 값은 " + maxOf(height) + "입니다.");

    }

    //아 객체 없이 사용이 가능하구나!
    //유틸리티 함수(라이브러리 함수)에 주로 사용하는구나

    //call by reference, call by value
    //java의 경우 함수에 전달되는 인자의 데이터 타입에 따라서 call by value, call by reference가 나뉨
    // 원시 자료형(primitive type) : call-by-value(int, short, long, float, double, char, boolean)
    // 참조 자료형(reference type) : call-by-reference(Array, Class Instance)


    static int maxOf(int[] a) {

        int max = a[0];

        for(int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
}

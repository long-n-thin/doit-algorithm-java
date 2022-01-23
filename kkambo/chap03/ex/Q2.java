package kkambo.chap03.ex;

import org.w3c.dom.ls.LSOutput;

/**
 * 오른쪽처럼 선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하세요.
 * 이때 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고, 현재 검색하고 있는 요소 위에 별표 기호 *를 출력하세요.
 */
public class Q2 {

    public static void main(String[] args) {
        
        int [] x = {6, 4, 3, 2, 1, 9, 8};
        int key = 3;

        System.out.println( key + "의 값은 x["+ linearSearch(x, key) + "]에 있습니다." );
        
    }

    private static int linearSearch(int[] x, int key) {

        System.out.println("   | 0   1   2   3   4   5   6   ");
        System.out.println("---+----------------------------");


        for(int i = 0; i < x.length ; i++){
            System.out.print("  |");
            for(int j = i +1 ; j > 0 ; j --){
                System.out.print("   ");
            }
            System.out.println("*");

            System.out.print(i + " | ");

            for(int j = 0; j< x.length ; j++){
                System.out.printf("%3d", x[j]);
            }
            System.out.println();

            if(x[i] == key)
                return i;
        }
        return -1;
    }
}

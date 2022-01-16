package kkambo.chap02.ex;

import  java.util.Scanner;


public class exQ6 {

    public static void main(String[] args) {


        int no; //변환할 값
        int cd; //진법
        int dno;//변환 후 자릿수
        int retry; //one more?
        char[] cno = new char[32];

        //요구조건 1 : 사용자가 종료하지 않으면 반복한다.
        //요구조건 2 : 양의 10진수 정수를 변환한다.
        //요구조건 3 :  2~36진수 변환을 지원한다.

        Scanner stdIn = new Scanner(System.in);

        System.out.println("10진수를 기수변환합니다.");
        do{
            //요구조건 2 양의 10진수 여부 체크
            do{
                System.out.print("음이 아닌 정수를 입력하세요.");
                no = stdIn.nextInt();
            }while ( no < 0);

            do{
                System.out.print("어떤 진수를 변환할까요? (2 ~ 36) ");
                cd = stdIn.nextInt();
            }while ( cd < 2 || cd > 36);


            dno = cardConv(no, cd, cno);



            System.out.print(cd + "진수로는");
            for(int i = 0 ; i < dno ; i++){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");


            System.out.print("one more? (1. 예 / 0. 아니요 : ");
            retry = stdIn.nextInt();

        }while (retry == 1);
    }

    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        int result = 0;
        int num = x;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            x /= r;
            digits++;
        }while(x != 0);

        do{
            d[--digits] = dchar.charAt(num % r);
            num /= r;
            result++;
        }while(num != 0);

        return result;
    }
}

package kkambo.chap02;

import java.util.Scanner;

public class exQ7 {

        public static void main(String[] args) {

            int no; //변환할 값
            int cd; //진법
            int dno;//변환 후 자릿수
            int retry; //one more?
            char[] cno = new char[32];

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

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는");
            for(int i = dno -1; i >= 0 ; i--){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");




                System.out.print("one more? (1. 예 / 0. 아니요 : ");
                retry = stdIn.nextInt();

            }while (retry == 1);
        }

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        System.out.println(r + "|\t"+x);
        System.out.println("+ -----");
        do{

            d[digits++] = dchar.charAt(x % r); //x를r로 나눈 나머지를 저장
            x /= r;

            if(x !=0) {
                System.out.println(r + "|\t" + x + " --- " + d[digits - 1]);
                System.out.println("+ -----");
            }else{
                System.out.println("\t" + x + " --- " + d[digits - 1]);
            }
        } while (x !=0);


        return digits;
    }


    }
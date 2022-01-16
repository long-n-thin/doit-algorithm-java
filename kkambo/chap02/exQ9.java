package kkambo.chap02;

import java.util.Scanner;

public class exQ9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//윤년

    };

    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) ? 1: 0;
    }

    static int leftDayOfYear(int y, int m, int d){
        int days = mdays[isLeap(y)][m-1] - d;

        System.out.println("days = " + days);

        while(m < 12) {
            days += mdays[isLeap(y)][m++];
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("년 : ");
        int year = stdIn.nextInt();
        System.out.print("월 : ");
        int month = stdIn.nextInt();
        System.out.print("일 : ");
        int day = stdIn.nextInt();

        System.out.printf("그 해 %d 일째입니다.", leftDayOfYear(year, month, day));
    }

}

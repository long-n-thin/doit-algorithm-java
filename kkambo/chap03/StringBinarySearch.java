package kkambo.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        String[] x = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else"
                ,"enum", "extends", "final", "finally", "float", "for", "goto"};

        System.out.print("원하는 키값을 입력하세요 : ");
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0)
            System.out.println("찾는 값이 없습니다.");
        else{
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
        }


        }
    }


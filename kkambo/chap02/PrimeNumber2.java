package kkambo.chap02;

public class PrimeNumber2 {
    public static void main(String[] args) {

        int counter = 0; //나눗셈의 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for( int n = 3; n <= 7; n += 2){ //대상은 홀수만

            int i;
            System.out.print("n = " + n+" ");
            System.out.print("ptr = " + ptr +" ");

            for(i = 1 ; i < ptr; i++) { //이미 찾은 소수로 나누어봄
                System.out.print("prime["+i+"] = " + prime[i]+ " ");
                counter++;
                if (n % prime[i] == 0) // 나누어 떨어진다 = 나머지가 0이다
                    break;
            }

            System.out.println();

            if(ptr == i)
                prime[ptr++] = n;
        }

        for ( int i = 0; i < ptr ; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 실행한 횟수 : " + counter);
    }
}

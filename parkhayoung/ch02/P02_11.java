package ch02;

public class P02_11 {
	// 실습문제 소수 판별하기 개선사항 2 - n의 제곱근 이하 어떤 소수로도 나누어 떨어지지 않으면 소수
	public static void main(String[] args) {
		int ptr = 0;      // 찾은 소수의 개수
	    int[] prime = new int[500];  // 찾은 소수를 저장하는 배열

	    prime[ptr++] = 2; // 2는 소수이므로 prime[0]에 저장
	    prime[ptr++] = 3; // 3은 소수이므로 prime[1]에 저장

	    for(int n=5; n<=100; n +=2) { // 홀수만
	      boolean flag = false;
	      for(int i=1; prime[i] * prime[i] <= n; i++){   // 소수의 제곱근이 n 이하 일때
	        if(n % prime[i] == 0) { // 나누어 떨어지면 소수가 아님
	          flag = true;
	          break;
	        }
	      }

	      if(!flag)  // 마지막 까지 나누어 떨어지지 않으면
	        prime[ptr++] = n;  // 소수이므로 배열에 저장
	    }

	    // 찾은 소수 출력
	    for(int i=0; i<ptr; i++){
	      System.out.println(prime[i]);
	    }
	}

}
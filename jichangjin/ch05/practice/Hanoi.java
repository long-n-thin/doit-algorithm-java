package jichangjin.ch05.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Hanoi {
	static int cnt;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
//		bw.write((int) (Math.pow(2, N) - 1) + "\n");
 
		Hanoi(N, 1, 2, 3);
		
		System.out.println(cnt);
		
//		bw.flush();
//		bw.close();
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) throws IOException {
		cnt++;
		// 이동할 원반의 수가 1개라면? (종료조건)
		if (N == 1) {
			System.out.println(start + " " + to);
			return;
		}
 
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		Hanoi(N - 1, start, to, mid);
    
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
//		bw.write(start + " " + to + "\n");
		System.out.println(start + " " + to);
    
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		Hanoi(N - 1, mid, start, to);
	}
}
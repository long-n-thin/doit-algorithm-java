package jichangjin.ch04.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue_1966 {
	
	static int T, N, M;
	
	static class Doc {
		int num, pri;

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getPri() {
			return pri;
		}

		public void setPri(int pri) {
			this.pri = pri;
		}
		public Doc(int num, int pri) {
			this.num = num;
			this.pri = pri;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		Queue q = new LinkedList();
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 문서의 개수 (1~N);
			M = Integer.parseInt(st.nextToken()); // 구해야 하는 문서의 큐 인덱스
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				q.add(new Doc(j, Integer.parseInt(st.nextToken())));
			}
		}
	}
}

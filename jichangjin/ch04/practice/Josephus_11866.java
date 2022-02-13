package jichangjin.ch04.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus_11866 {

	static int N, K;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i < N + 1; i++) {
			q.add(i);
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		while(!q.isEmpty()) {
			for(int i = 0; i < K - 1; i++) { // k가 3이라면 k - 1 번 큐의 맨 앞 원소를 맨 뒤로 보낸다. 
				int val = q.poll();
				q.offer(val);
			}
			if(q.size()!= 1) {
				sb.append(q.poll()+", ");
			} else {
				sb.append(q.poll()+">");
			}
		}
		System.out.println(sb.toString());
	}
}

package jichangjin.ch04.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_2164 {

	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i < N+1; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.remove();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}

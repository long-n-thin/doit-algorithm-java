package jichangjin.ch03.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumCard2_10816 {

	static int N, M;
	static int[] card;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		card = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);

		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			bw.write((upperBound(key) - lowerBound(key) + " "));
		}
		bw.flush();
		bw.close();
	}

	private static int lowerBound(int key) {
		
		int lo = 0;
		int hi = card.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key <= card[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	private static int upperBound(int key) {
		int lo = 0;
		int hi = card.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key < card[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}

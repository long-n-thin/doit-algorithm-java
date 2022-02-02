package jichangjin.ch03.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumCard2_10816 {

	static int N, M;
	static int[] card;
	static int[] num;
	static int[] result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		card = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		M = Integer.parseInt(br.readLine());
		num = new int[M];
		st = new StringTokenizer(br.readLine());
		result = new int[M]; // 결과를 담을 배열
		
		Arrays.sort(card);
		
		for(int i = 0; i < M; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < M; i++) {
			result[i] = binarySearch(num[i]);
			System.out.print(result[i] + " ");
		}
	}

	private static int binarySearch(int num) {
		
		int pl = 0;
		int pr = card.length-1;
		int pc = 0;
		
		while(pl < pr) {
			pc = (pl + pr) / 2;
			if(card[pc] == num) {
				int lower = pc;
				int upper = pc;
				while(lower > 0) {
					if(card[lower - 1] == num) {
						lower--;
					} else {
						break;
					}
				}
				while(upper < card.length - 1) {
					if(card[upper + 1] == num) {
						upper++;
					} else {
						break;
					}
				}
				return upper - lower + 1;
			} else if (card[pc] > num) {
				pr = pc - 1;
			} else {
				pl = pc + 1;
			}
		} 
		return 0;
	}
}

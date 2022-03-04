package ch05;

import java.util.Stack;

public class EightQueen_Q9 {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];

	static int[] pos = new int[8];
	
	static Stack<Integer> stack_j = new Stack<Integer>();
	static Stack<Integer> stack_i = new Stack<Integer>();

	static void print() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (pos[i] == j) {
					System.out.printf("%2s", "¡á");
				} else {
					System.out.printf("%2s", "¡à");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	// i¿­ Äý ¹èÄ¡
	static void set(int i) {
		int procFlag = 0;
		int j = 0;
		
		while(true) {
			procFlag = 0;
			
			for (; j < 8; j++) {
				if (flag_a[j] == false && flag_b[i + j] == false && flag_c[i - j + 7] == false) {
					pos[i] = j;
					if (i == 7) {
						print();
					} else {
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;

						stack_i.push(i);
						stack_j.push(j);
						
						i = i+1;
						j = 0;
						
						procFlag = 1;
						break;
					}
				}
			}
			
			if(procFlag == 0) {
				if (i == 0)
					return;
				
				i = stack_i.pop();
				j = stack_j.pop();
				
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				
				j = j+1;
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}

}

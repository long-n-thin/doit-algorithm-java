package jichangjin.ch05.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeColorPaper {
	
	public static int white = 0;
	public static int blue = 0;
	static int[][] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		partition(0,0,N);

	}

	
	private static void partition(int row, int col, int size) {
		
		if(colorCheck(row,col,size)) { // 전부 같은 색이라면
			if(arr[row][col] == 0) { // 하얀색이라면
				white++;
			} else { // 파란색이라면
				blue++;
			}
			return;
		}
		// 같은 색이 아니라면 재귀호출
		
		int newSize = size / 2;
		partition(row,col, newSize); // 2사분면
		partition(row, col+newSize, newSize);//1사분면
		partition(row+newSize, col,newSize);//3사분면
		partition(row+newSize,col+newSize,newSize);//4사분면
	}


	private static boolean colorCheck(int row, int col, int size) {
		
		int color = arr[row][col];
		
		for(int i = row; i < row+size; i++) {
			for(int j = col; j < col+size; j++) {
				if(arr[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}

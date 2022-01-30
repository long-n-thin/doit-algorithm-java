package ch02;

import java.util.Scanner;

public class Exercise10 {

	static final int VMAX = 21;

	static class PhyscData {
		private String name = "";
		private int height = 0;
		private double vision = 0.0;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	static double aveHeight(PhyscData[] dat) {
		int sum = 0;

		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}

		return sum / dat.length;
	}

	static void distVision(PhyscData[] dat, String[] dist) { // 배열변수 dist가 배열변수 vdist 참조
		/*
		 * for(int i=0; i<dat.length; i++) { dist[(int)(dat[i].vision*10)]++; }
		 * 
		 * for(int i=0; i<VMAX; i++) { System.out.println((double)i/10 + " ~ : " +
		 * dist[i] + "명"); }
		 */

		int i = 0;

		for (i = 0; i < VMAX; i++) {
			dist[i] = "";
		}

		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)] += "*";
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PhyscData[] x = { new PhyscData("박현규", 162, 0.3), new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0), new PhyscData("이수진", 171, 0.4), new PhyscData("홍연의", 168, 1.5),
				new PhyscData("김영진", 174, 1.2), new PhyscData("박영규", 169, 0.8), new PhyscData("정철진", 169, 0.8), };

		String[] vdist = new String[VMAX];

		System.out.println("평균 키: " + aveHeight(x));

		distVision(x, vdist);

		System.out.println("시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %s\n", i / 10.0, vdist[i]);
		}
	}

}

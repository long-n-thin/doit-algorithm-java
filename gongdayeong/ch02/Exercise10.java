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

	static void distVision(PhyscData[] dat, String[] dist) { // �迭���� dist�� �迭���� vdist ����
		/*
		 * for(int i=0; i<dat.length; i++) { dist[(int)(dat[i].vision*10)]++; }
		 * 
		 * for(int i=0; i<VMAX; i++) { System.out.println((double)i/10 + " ~ : " +
		 * dist[i] + "��"); }
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

		PhyscData[] x = { new PhyscData("������", 162, 0.3), new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0), new PhyscData("�̼���", 171, 0.4), new PhyscData("ȫ����", 168, 1.5),
				new PhyscData("�迵��", 174, 1.2), new PhyscData("�ڿ���", 169, 0.8), new PhyscData("��ö��", 169, 0.8), };

		String[] vdist = new String[VMAX];

		System.out.println("��� Ű: " + aveHeight(x));

		distVision(x, vdist);

		System.out.println("�÷� ����");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %s\n", i / 10.0, vdist[i]);
		}
	}

}

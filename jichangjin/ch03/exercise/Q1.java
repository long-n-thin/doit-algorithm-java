package jichangjin.ch03.exercise;
import java.util.Scanner;
// ���� �˻�(���ʹ�)

class Q1 {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int seqSearchSen(int[] a, int n, int key) {

		a[n] = key;					// ���ʸ� �߰�

		for(int i = 0; i < a.length-1; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];				// ��ڼ� num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		System.out.print("�˻��� ����");			// Ű���� �Է�
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky);		// �迭x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
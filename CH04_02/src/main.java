
public class main {
	public static void main(String args[]) {
		double sum[] = new double[4];
		double vote = 0;
		int[][] pervoteobtain = { { 1, 2, 3 }, { 6, 7, 8 }, { 9, 10, 11 }, { 12, 13, 14 } };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] += pervoteobtain[i][j];
			}
			System.out.println("��" + (i + 1) + "����P�o����" + sum[i]);
		}

		for (int i = 0; i < 4; i++) {
			vote += sum[i];
		}
		double temp = 0;
		for (int i = 0; i < 4; i++) {
			temp = sum[i] / vote;
			System.out.println("��" + (i + 1) + "����P�o���v" + temp);
		}
	}
}

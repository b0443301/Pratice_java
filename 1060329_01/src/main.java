
public class main {
	public static void main(String args[]) {
		int i = 1;
		while (i <= 3) {// i����̥~�����j��1,2,3,4,5,6,7,8,9
			int j = 1;// �M��
			while (j <= 9) {// j����̭�1~9
				System.out.print((i * 3) - 2 + "*" + j + "=" + ((i * 3 - 2) * j) + "\t");// �������Y
				System.out.print((i * 3) - 1 + "*" + j + "=" + ((i * 3 - 1) * j) + "\t");
				System.out.print((i * 3) + "*" + j + "=" + (i * 3 * j) + "\n");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
}

//
//public class main {
//	public static void main(String arg[]) {
//		char array1[] = { 'a', 'b', 'c' };
//		char array2[] = { 'x', 'y', 'z' };
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				// �{�����i�H�@�氵�ܦh��,��if�P�_&&��,�n���}�P�_
//				if (array1[i] == 'a' && array2[j] == 'x') {
//					continue;
//				}
//				if (array1[i] == 'c' && array2[j] == 'x') {
//					continue;
//				}
//				if (array1[i] == 'c' && array2[j] == 'z') {
//					continue;
//				}
//				System.out.print(array1[i]);
//				// System.out.print("\n");
//				System.out.print("\t");
//				// print�~�i�H�Lchar,println�]�i�H�Lchar������ۥ[+,
//				// �@���ۥ[�N�|��
//				// ��°�char����,���i�H�ۥ[,���M�|�ܦ�ascii�X�ۥ[
//				System.out.print(array2[j]);
//				System.out.print("\n");
//			}
//		}
//
//	}
//}
public class main {
	public static void main(String args[]) {
		for (int i = 'x'; i <= 'z'; i++) {
			for (int j = 'x'; j <= 'z'; j++) {
				if (i != j) {
					for (int k = 'x'; k <= 'z'; k++) {
						if (i != k && j != k) {
							if (i != 'x' && k != 'x' && k != 'z') {
								System.out.println("a�����O"+(char) i);
								System.out.println("b�����O"+(char) j);
								System.out.println("c�����O"+(char) k);
							}
						}
					}
				}
			}
		}
	}
}
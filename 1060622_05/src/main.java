
//
//public class main {
//	public static void main(String arg[]) {
//		char array1[] = { 'a', 'b', 'c' };
//		char array2[] = { 'x', 'y', 'z' };
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				// 程式不可以一行做很多事,用if判斷&&時,要分開判斷
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
//				// print才可以印char,println也可以印char但不能相加+,
//				// 一但相加就會變
//				// 單純做char的話,不可以相加,不然會變成ascii碼相加
//				System.out.print(array2[j]);
//				System.out.print("\n");
//			}
//		}
//
//	}
//}
/* i代表a的對手,j代表b的對手,k代表c的對手*/
public class main {
	public static void main(String args[]) {
		for (int i = 'x'; i <= 'z'; i++) {
			for (int j = 'x'; j <= 'z'; j++) {
				if (i != j) {
					for (int k = 'x'; k <= 'z'; k++) {
						if (i != k && j != k) {
							if (i != 'x' && k != 'x' && k != 'z') {
								System.out.println("a的對手是" + (char) i);
								System.out.println("b的對手是" + (char) j);
								System.out.println("c的對手是" + (char) k);
							}
						}
					}
				}
			}
		}
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String args[]) {
		int[] test = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			test[i] = scanner.nextInt();

		}//��w�Ƨ�
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (test[i] < test[j]) {
					int temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		for (int i =0; i < 10; i++) {
			System.out.println(test[i]);
		}
		scanner.close();
	}
}
//�D��Ƨ�
//for (int i = 0; i < 10; i++) {
//	for (int j = i; j < 10; j++) {
//		if (test[i] < test[j]) {
//			int temp = test[i];
//			test[i] = test[j];
//			test[j] = temp;
//		}
//	}
//}

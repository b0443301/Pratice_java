import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input[] = new int[5];
//		int max = 0;
//		int min = 0;
		int max = Integer.MIN_VALUE;//�ڬOint�̤p��,�S���H��ڧ�p,�p�G��̤j����ۤv�̤ܳp,��X�Ӧp�G�O�̤j�ȴN���|���H��ڤj
		int min = Integer.MAX_VALUE;//�ڬOint�̤j��,�S���H��ڧ�j,�p�G��̤p����ۤv�̤ܳj

		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
			if (input[i] > max)
				max = input[i];
			if (input[i] < min)
				min = input[i];
		}
		System.out.println("�̤j�� " + max);
		System.out.println("�̤p�� " + min);
		scanner.close();
	}
}
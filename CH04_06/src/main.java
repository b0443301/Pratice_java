import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		// for (int i = 2; i < input; i++) {
		for (int i = 1; i < input; i++) {
			if (i == 1)
				continue;

			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 0) {
				System.out.println("��J���ȼƽd��" + i);
			}

		}
		scanner.close();
	}
}

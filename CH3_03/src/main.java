//import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		// Scanner scanner = new Scanner(System.in);
		// int input = scanner.nextInt();
		// Boolean isPrime = false;

		for (int i = 1; i < 1000; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (i == 1) {
				continue;
			} else if (count == 0) {
				System.out.println("���" + i);
			} else if (count >= 1) {
				continue;
			}
		}
	}
}

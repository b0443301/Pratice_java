import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String input = "";
		String str1 = "";
		String ans = "";
		int count = 0;
		System.out.println("�п�J�@�ӲŸ�");
		input = scanner.nextLine();

		System.out.println("�п�J�n���ƪ�����");
		// count = scanner.nextInt();
		count = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < count; i++) {
			str1 += input;
		}
		System.out.println("���G" + str1);

		System.out.println("�аݭn���n�~��(Y/N)");
		while (true) {
			// scanner.nextLine();
			ans = scanner.nextLine();
			if (ans.equals("Y")) {
				System.out.println("�п�J�@�ӲŸ�");
				input = scanner.nextLine();

				System.out.println("�п�J�n���ƪ�����");
				// count = scanner.nextInt();
				count = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < count; i++) {
					str1 += input;
				}
				System.out.println("���G" + str1);
				continue;
			} else {
				break;
			}
		}
		scanner.close();
	}
}
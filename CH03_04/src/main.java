import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String input = "";
		String str1 = "";
		String ans = "";
		int count = 0;
		System.out.println("請輸入一個符號");
		input = scanner.nextLine();

		System.out.println("請輸入要重複的次數");
		// count = scanner.nextInt();
		count = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < count; i++) {
			str1 += input;
		}
		System.out.println("結果" + str1);

		System.out.println("請問要不要繼續(Y/N)");
		while (true) {
			// scanner.nextLine();
			ans = scanner.nextLine();
			if (ans.equals("Y")) {
				System.out.println("請輸入一個符號");
				input = scanner.nextLine();

				System.out.println("請輸入要重複的次數");
				// count = scanner.nextInt();
				count = Integer.parseInt(scanner.nextLine());
				for (int i = 0; i < count; i++) {
					str1 += input;
				}
				System.out.println("結果" + str1);
				continue;
			} else {
				break;
			}
		}
		scanner.close();
	}
}

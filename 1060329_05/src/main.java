import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] array = { "123" };
		for (int i = 0; i < input.length(); i++) {

			System.out.print("*");
		}
		for (int i = 1; i < input.length(); i++) {
			System.out.println();

			if (input == String.valueOf(array[i])) {
				System.out.println("輸入正確");
				System.out.println(input);
			} else {
				System.out.println("輸入錯誤");
				System.out.println("再一次");
				continue;
			}
		}
		scanner.close();
	}
}

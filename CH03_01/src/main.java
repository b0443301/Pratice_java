import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		String operation = scanner.nextLine();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (operation.equals(" +")) {
			System.out.println(num1 + num2);
		} else if (operation.equals(" -")) {
			System.out.println(num1 - num2);
		} else if (operation.equals(" *")) {
			System.out.println(num1 * num2);
		} else if (operation.equals(" /")) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("��J���~");
		}
		scanner.close();
	}
}

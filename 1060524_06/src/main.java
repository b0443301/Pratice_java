import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] dateArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("�п�J�~��");
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					year = 366;
				} else if (year % 400 != 0) {
					year = 365;
				}
			} else if (year % 100 != 0) {
				year = 366;
			}
		} else if (year % 4 != 0) {
			year = 365;
		}
		// } else if (year % 100 != 0) {
		// year = 366;
		// } else if (year % 400 != 0) {
		// year = 365;

		System.out.println("�п�J���");
		int month = scanner.nextInt();
		System.out.println("�п�J���");
		int date = scanner.nextInt();
		for (int i = 0; i < month - 1; i++) {
			date += dateArray[i];
		}
		if (year == 365) {
			System.out.println("���~����" + date + "��");
		} else if (year == 366) {
			if (month >= 3) {
				System.out.println("���~����" + (date + 1) + "��");
			} else {
				System.out.println("���~����" + date + "��");
			}
		}
	}
}
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		String[] name = { "�i�Y", "���Y", "�L�Y", "���Y", " ���Y", "���Y" };
		int[] score = { 56, 57, 58, 59, 60, 61 };
		Scanner scanner = new Scanner(System.in);

		int temp = scanner.nextInt();
		for (int i = 0; i < 6; i++) {
			if (score[i] == temp) {
				System.out.println(name[i]);
			}
		}
		scanner.close();
	}
}

import java.util.Scanner;

public class main {
	public static class Student {
		String id = "";
		String Sname = "";
		int ChineseScore = 0;
		int EnglishScore = 0;
		int BccScore = 0;

		int GetAvg() {
			int Avg = (ChineseScore + EnglishScore + BccScore) / 3;
			return Avg;
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// int Numpeole = scanner.nextInt();
		System.out.println("�п�J�n���ʹX�Ӿǥ͸��");
		int Numpeole = Integer.parseInt(scanner.nextLine());
		Student[] student = new Student[Numpeole];

		for (int i = 0; i < Numpeole; i++) {
			student[i] = new Student();
			System.out.println("�п�J�ǥ;Ǹ�");
			// scanner.nextLine();
			student[i].id = scanner.nextLine();
			System.out.println("�п�J�ǥͩm�W");
			student[i].Sname = scanner.nextLine();
			System.out.println("�п�J�ǥͰ�妨�Z");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("�ЦA��J�@��");
					continue;
				} else {
					student[i].ChineseScore = temp;
					break;
				}
			}
			System.out.println("�п�J�ǥͭ^�妨�Z");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("�ЦA��J�@��");
					continue;
				} else {
					student[i].EnglishScore = temp;
					break;
				}
			}
			System.out.println("�п�J�ǥͭp�����Z");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("�ЦA��J�@��");
					continue;
				} else {
					student[i].BccScore = temp;
					break;
				}
				
			}
		}
		System.out.println("�п�J�j�M�ǥͩm�W");
		String searchName = scanner.nextLine();
		scanner.close();
		Boolean isFind = false;
		for (int i = 0; i < Numpeole; i++) {
			if (searchName.equals(student[i].Sname)) {
				System.out.println("��" + i + "�ǥͩm�W");
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("�S���ǥ͸��");
		}
	}
}
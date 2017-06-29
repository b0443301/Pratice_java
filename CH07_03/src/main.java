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
		System.out.println("請輸入要產生幾個學生資料");
		int Numpeole = Integer.parseInt(scanner.nextLine());
		Student[] student = new Student[Numpeole];

		for (int i = 0; i < Numpeole; i++) {
			student[i] = new Student();
			System.out.println("請輸入學生學號");
			// scanner.nextLine();
			student[i].id = scanner.nextLine();
			System.out.println("請輸入學生姓名");
			student[i].Sname = scanner.nextLine();
			System.out.println("請輸入學生國文成績");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("請再輸入一次");
					continue;
				} else {
					student[i].ChineseScore = temp;
					break;
				}
			}
			System.out.println("請輸入學生英文成績");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("請再輸入一次");
					continue;
				} else {
					student[i].EnglishScore = temp;
					break;
				}
			}
			System.out.println("請輸入學生計概成績");
			while (true) {
				int temp = Integer.parseInt(scanner.nextLine());
				if (temp > 100 || temp < 0) {
					System.out.println("請再輸入一次");
					continue;
				} else {
					student[i].BccScore = temp;
					break;
				}
				
			}
		}
		System.out.println("請輸入搜尋學生姓名");
		String searchName = scanner.nextLine();
		scanner.close();
		Boolean isFind = false;
		for (int i = 0; i < Numpeole; i++) {
			if (searchName.equals(student[i].Sname)) {
				System.out.println("第" + i + "學生姓名");
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("沒找到學生資料");
		}
	}
}

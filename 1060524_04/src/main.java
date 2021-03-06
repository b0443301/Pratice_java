import java.util.Scanner;

public class main {
	// 小小資料庫,Score的成績不只有學生也有老師或者教務處等所以需要多個Inner class區隔
	static class SemesterScore {
		String name = "";
		String id = "";
		int middleScore = 0;
		int midtermScore = 0;
		int ususalScore = 0;
		int semester = 0;
	}

	// inner class 跟class隔開是因為減少main function再被new一次,
	//減少空間浪費,以及把每個class的功能分開,EX:main負責計算
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		SemesterScore semesterScore[] = new SemesterScore[3];
		for (int i = 0; i < 3; i++) {
			semesterScore[i] = new SemesterScore();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("請輸入3筆學生學號");
			semesterScore[i].id = scanner.nextLine();
			System.out.println("請輸入3筆學生期中成績");
			semesterScore[i].middleScore = Integer.parseInt(scanner.nextLine());
			System.out.println("請輸入3筆學生期末成績");
			semesterScore[i].midtermScore = Integer.parseInt(scanner.nextLine());
			System.out.println("請輸入3筆學生姓名");
			semesterScore[i].name = scanner.nextLine();
			System.out.println("請輸入3筆學生平時成績");
			semesterScore[i].ususalScore = Integer.parseInt(scanner.nextLine());
			semesterScore[i].semester = (int) ((semesterScore[i].middleScore * 0.3)
					+ (semesterScore[i].midtermScore * 0.3) + (semesterScore[i].ususalScore * 0.3));
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("學生學期成績" + semesterScore[i].semester);
		}
		scanner.close();
	}
}
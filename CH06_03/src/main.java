
import java.util.Scanner;

public class main {

	static class Employee {
		int Salary = 0;
		String Ename = "";
		int MinSalary = 20000;
		int MaxSalary = 40000;

		void PrintData() {
			System.out.println(Salary);
			System.out.println(Ename);
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入員工人數");
		int count = scanner.nextInt();
		Employee[] employee = new Employee[count];
		for (int i = 0; i < count; i++) {
			employee[i] = new Employee();
			System.out.println("請輸入員工薪水");
			employee[i].Salary = scanner.nextInt();
			scanner.nextLine();
			System.out.println("請輸入員工姓名");
			employee[i].Ename = scanner.nextLine();
			
		}
		for (int i = 0; i < count; i++) {
			// employee[i].PrintData();呼叫函式PrintData()印出PrintData()裡面所做的事
			System.out.println("員工薪水");
			System.out.println(employee[i].Salary);
			System.out.println("員工姓名");
			System.out.println(employee[i].Ename);
		}

		while (true) {
			System.out.println("請輸入要找的員工姓名");
			String searchName = scanner.nextLine();
			scanner.close();
			Boolean isFind = false;
			// int index = -1;index不可能-1,因為初值是0
			for (int i = 0; i < count; i++) {
				// employee[i] = new Employee();//每new一次就被清空初始化
				if (searchName.equals(employee[i].Ename)) {
					System.out.println("第" + (i + 1) + "員工姓名");
					isFind = true;
					// index = i;要if條件是微true才會進來此條件index是i紀錄下來給下面使用2
					// break;//跳出迴圈
				}
			}
			if (!isFind) {
				System.out.println("沒找到員工資料");
			}
			System.out.println("是否再次搜尋(Y/N)");
			String ans = scanner.nextLine();
			if (ans.equals("Y") || ans.equals("y")) {
				continue;
			} else {
				break;
			}
			
		}
		// if (index == -1) {萬一沒找到index==-1
		// System.out.println("沒找到員工資料");
		// } else {不然就是第i位員工
		// System.out.println("第" + index + "員工姓名");
		// }
	}
}

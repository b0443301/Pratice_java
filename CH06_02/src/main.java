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
		// Scanner[] scan = new Scanner[10];
		// for(int i=0; i<10;i++){
		// scan[i] = new Scanner(System.in);
		// }
		Scanner scanner = new Scanner(System.in);
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
			System.out.println("員工薪水");
			System.out.println(employee[i].Salary);
			System.out.println("員工姓名");
			System.out.println(employee[i].Ename);
		}
		scanner.close();
	}
}

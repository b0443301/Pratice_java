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
			System.out.println("�п�J���u�~��");
			employee[i].Salary = scanner.nextInt();
			scanner.nextLine();
			System.out.println("�п�J���u�m�W");
			employee[i].Ename = scanner.nextLine();
		}
		for (int i = 0; i < count; i++) {
			System.out.println("���u�~��");
			System.out.println(employee[i].Salary);
			System.out.println("���u�m�W");
			System.out.println(employee[i].Ename);
		}
		scanner.close();
	}
}

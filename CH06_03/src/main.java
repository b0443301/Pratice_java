
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
		System.out.println("�п�J���u�H��");
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
			// employee[i].PrintData();�I�s�禡PrintData()�L�XPrintData()�̭��Ұ�����
			System.out.println("���u�~��");
			System.out.println(employee[i].Salary);
			System.out.println("���u�m�W");
			System.out.println(employee[i].Ename);
		}

		while (true) {
			System.out.println("�п�J�n�䪺���u�m�W");
			String searchName = scanner.nextLine();
			scanner.close();
			Boolean isFind = false;
			// int index = -1;index���i��-1,�]����ȬO0
			for (int i = 0; i < count; i++) {
				// employee[i] = new Employee();//�Cnew�@���N�Q�M�Ū�l��
				if (searchName.equals(employee[i].Ename)) {
					System.out.println("��" + (i + 1) + "���u�m�W");
					isFind = true;
					// index = i;�nif����O�Ltrue�~�|�i�Ӧ�����index�Oi�����U�ӵ��U���ϥ�2
					// break;//���X�j��
				}
			}
			if (!isFind) {
				System.out.println("�S�����u���");
			}
			System.out.println("�O�_�A���j�M(Y/N)");
			String ans = scanner.nextLine();
			if (ans.equals("Y") || ans.equals("y")) {
				continue;
			} else {
				break;
			}
			
		}
		// if (index == -1) {�U�@�S���index==-1
		// System.out.println("�S�����u���");
		// } else {���M�N�O��i����u
		// System.out.println("��" + index + "���u�m�W");
		// }
	}
}
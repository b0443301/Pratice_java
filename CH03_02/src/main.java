import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		switch (input) {
		case 03:
			System.out.println("聯合信用卡");
			break;
		case 35:
			System.out.println("JCB信用卡");
			break;
		case 45:
			System.out.println("VISA信用卡");
			break;
		case 54:
			System.out.println("MASTER的信用卡");
			break;
		default:
			System.out.println("非商業用的信用卡");
		}
		scanner.close();
	}
}

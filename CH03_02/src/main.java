import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		switch (input) {
		case 03:
			System.out.println("�p�X�H�Υd");
			break;
		case 35:
			System.out.println("JCB�H�Υd");
			break;
		case 45:
			System.out.println("VISA�H�Υd");
			break;
		case 54:
			System.out.println("MASTER���H�Υd");
			break;
		default:
			System.out.println("�D�ӷ~�Ϊ��H�Υd");
		}
		scanner.close();
	}
}
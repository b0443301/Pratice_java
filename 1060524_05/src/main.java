import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�A�n���P���Ĥ@�Ӧr");
		String input = scanner.nextLine();
		if (input.equals("M") || input.equals("m")) {
			System.out.println("Monday");
		} else if (input.equals("T") || input.equals("t")) {
			System.out.println("�ЦA����J�A�n���P���ĤG�Ӧr");
			String inputSecond = scanner.nextLine();
			// input = scanner.nextLine();�ݬݰϬqinput���S���A�Q�ϥ�,�S���������ӥΦ��O�u��else
			// if�i�H��,if����]��if�C�ӳ��|�i�h�Ϭq�̰��P�_
			if (inputSecond.equals("u")) {
				System.out.println("Tuseday");
			} else if (inputSecond.equals("h")) {
				System.out.println("Thursday");
			}
		} else if (input.equals("W") || input.equals("w")) {
			System.out.println("Wedesday");
		} else if (input.equals("F") || input.equals("f")) {
			System.out.println("Friday");
		} else if (input.equals("S") || input.equals("s")) {
			System.out.println("�ЦA����J�A�n���P���ĤG�Ӧr");
			String inputSecond = scanner.nextLine();
			if (inputSecond.equals("u")) {
				System.out.println("Sunday");
			} else if (inputSecond.equals("a")) {
				// String inputThird = scanner.nextLine();�]�bif�̭�
				// System.out.println("�ЦA����J�A�n���P���ĤT�Ӧr");
				System.out.println("Saturday");
			}
		}
		scanner.close();
	}
}
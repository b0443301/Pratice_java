import java.util.Scanner;

public class main {
	// �p�p��Ʈw,Score�����Z���u���ǥͤ]���Ѯv�Ϊ̱аȳB���ҥH�ݭn�h��Inner class�Ϲj
	static class SemesterScore {
		String name = "";
		String id = "";
		int middleScore = 0;
		int midtermScore = 0;
		int ususalScore = 0;
		int semester = 0;
	}

	// inner class ��class�j�}�O�]�����main
	// function�A�Qnew�@��,��֪Ŷ����O,�H�Χ�C��class���\����},EX:main�t�d�p��
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		SemesterScore semesterScore[] = new SemesterScore[3];
		for (int i = 0; i < 3; i++) {
			semesterScore[i] = new SemesterScore();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("�п�J3���ǥ;Ǹ�");
			semesterScore[i].id = scanner.nextLine();
			System.out.println("�п�J3���ǥʹ������Z");
			semesterScore[i].middleScore = Integer.parseInt(scanner.nextLine());
			System.out.println("�п�J3���ǥʹ������Z");
			semesterScore[i].midtermScore = Integer.parseInt(scanner.nextLine());
			System.out.println("�п�J3���ǥͩm�W");
			semesterScore[i].name = scanner.nextLine();
			System.out.println("�п�J3���ǥͥ��ɦ��Z");
			semesterScore[i].ususalScore = Integer.parseInt(scanner.nextLine());
			semesterScore[i].semester = (int) ((semesterScore[i].middleScore * 0.3)
					+ (semesterScore[i].midtermScore * 0.3) + (semesterScore[i].ususalScore * 0.3));
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("�ǥ;Ǵ����Z" + semesterScore[i].semester);
		}
	}
}
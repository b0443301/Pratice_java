import java.util.Arrays;
import java.util.Scanner;

public class main {
	static void Array1(int array[], int data) {
		for (int i = 0; i < array.length; i++) {
			if (data != array[i]) {
				// System.out.println("�䤣��");
				continue;
			} else if (data == array[i]) {
				System.out.println("��" + i + "��m");
			}
		}
		
	}

	public static void main(String args[]) {
		int array1[] = { 0, 11, 22, 33, 44, 55, 66 };
		Scanner scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		Array1(array1, data);
		scanner.close();
	}

}

import java.util.Scanner;

public class main {
	static void change() {
		// static int change() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�z�u���J100�ȶr�B��J500�ȶr�B��J1000�ȶr");

		int input = scanner.nextInt();
		System.out.println("�z�Q�������B");
		int inputChange = scanner.nextInt();
		System.out.println("�z�Q�����Ӽ�");
		int inputcount = scanner.nextInt();
		input -= inputChange * inputcount;// ��J���B��n�������B��Ӽ�

		// �B��q50�}�l�����l��
		int number = input / 50;
		int ans = input % 50;
		if (inputChange == 50) {
			number += inputcount;
		}
		System.out.println(number + "�Ӥ��Q��");
		number = ans / 10;
		ans = input % 10;
		if (inputChange == 10) {
			number += inputcount;
		}
		System.out.println(number + "�ӤQ��");
		number = ans / 5;
		ans = input % 5;
		if (inputChange == 5) {
			number += inputcount;
		}
		System.out.println(number + "�Ӥ���");
		number = ans / 1;
		ans = input % 1;
		if (inputChange == 1) {
			number += inputcount;
		}
		System.out.println(number + "�ӳ���");

		// return 100;
		scanner.close();
		// System.out.println(inputcount + "��" + input + "��");
	}

	public static void main(String args[]) {
		change();
		// int ret = change();
		// System.out.println(ret);
	}
}

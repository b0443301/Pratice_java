import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double money = 0;
		while (scanner.hasNext()) {
			int input = scanner.nextInt();
			if (input <= 800) {
				money = input * 0.5;// �q�ܶO
				System.out.println(money);
			} else if (input > 800 && input < 1500) {
				money = input * 0.5 * 0.95;// �q�ܶO��95��
				System.out.println(money);
			} else if (money >= 1500) {
				money = input * 0.5 * 0.8;// �q�ܶO��8��
				System.out.println(money);
			}
		}
		scanner.close();
	}
}
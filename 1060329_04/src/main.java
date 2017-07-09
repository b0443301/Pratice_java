import java.util.Scanner;

public class main {
	static void change() {
		// static int change() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("您只能輸入100紙鈔、輸入500紙鈔、輸入1000紙鈔");

		int input = scanner.nextInt();
		System.out.println("您想換的面額");
		int inputChange = scanner.nextInt();
		System.out.println("您想換的個數");
		int inputcount = scanner.nextInt();
		input -= inputChange * inputcount;// 輸入金額減要換的面額跟個數

		// 運算從50開始除取餘數
		int number = input / 50;
		int ans = input % 50;
		if (inputChange == 50) {
			number += inputcount;
		}
		System.out.println(number + "個五十元");
		number = ans / 10;
		ans = input % 10;
		if (inputChange == 10) {
			number += inputcount;
		}
		System.out.println(number + "個十元");
		number = ans / 5;
		ans = input % 5;
		if (inputChange == 5) {
			number += inputcount;
		}
		System.out.println(number + "個五元");
		number = ans / 1;
		ans = input % 1;
		if (inputChange == 1) {
			number += inputcount;
		}
		System.out.println(number + "個壹元");

		// return 100;
		scanner.close();
		// System.out.println(inputcount + "個" + input + "元");
	}

	public static void main(String args[]) {
		change();
		// int ret = change();
		// System.out.println(ret);
	}
}

//輾轉相除法(寫)
public class main {
	public static int GreComDiv(int num1, int num2) {
		int temp = 0;
		// if (num1 > num2) {
		// int swap = 0;
		// swap = num1;
		// num1 = num2;
		// num2 = swap;
		// }
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				temp = i;
			}
		}
		return temp;
	}

	public static void main(String args[]) {
		int num1 = 10000;
		int num2 = 10;
		int c1 = GreComDiv(num1, num2);
		System.out.println("num1和num2公因式  " + c1);
	}
}

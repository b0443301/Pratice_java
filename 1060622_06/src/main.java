import java.util.ArrayList;
import java.util.Scanner;

public class main {
	ArrayList<String> route = new ArrayList<String>();

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�L�ơG");
		int n = scanner.nextInt();

		main hanoi = new main();
		//'A', 'B', 'C'�a�J���L�l(�Ѽ�)
		for (String move : hanoi.move(n, 'A', 'B', 'C'))
			System.out.println(move);

		scanner.close();
	}

	// from, buffer,to�W�l
	public ArrayList<String> move(int n, char from, char buffer, char to) {
		if (n == 1) {
			route.add(from + " -> " + to);
		} else {

			move(n - 1, from, to, buffer);
			// System.out.print(from + " -> " + buffer);
			move(1, from, buffer, to);
			// System.out.print(from + " -> " + to);
			move(n - 1, buffer, from, to);
			// System.out.print(buffer + " -> " + to);
		}
		return route;
	}
}

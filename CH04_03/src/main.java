import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input[] = new int[5];
//		int max = 0;
//		int min = 0;
		int max = Integer.MIN_VALUE;//и琌int程,⊿Τゑи,狦т程р跑程,тㄓ狦琌程碞ぃ穦Τゑи
		int min = Integer.MAX_VALUE;//и琌int程,⊿Τゑи,狦т程р跑程

		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
			if (input[i] > max)
				max = input[i];
			if (input[i] < min)
				min = input[i];
		}
		System.out.println("程 " + max);
		System.out.println("程 " + min);
		scanner.close();
	}
}


public class main {
	public static void main(String args[]) {
		int input = 1;
		int sum = 0;
		while (input <= 20) {
			if (input % 2 == 0) {
				System.out.println("场案计" + input);
				sum += (int) Math.pow(input, 2);
				}
			input++;//whileΩ计琌糶柑
		}
		System.out.println("场キよ羆㎝" + sum);
	}
}

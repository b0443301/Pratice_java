import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String chinese = "零壹貳参肆伍陸柒捌玖拾";

		System.out.println("請輸入數字");
		String input = scanner.nextLine();

		String ans = new String();
		for (int i = input.length() - 1; i >= 0; i--) {
			// 取對應中文字的索引(數字-'0')(大寫-'A'||小寫-'a')
			String temp = String.valueOf(chinese.charAt(input.charAt(i) - '0'));
			if (!temp.equals("零")) {
				if (i == input.length() - 1) {
					temp += "元";
				} else if (i == input.length() - 2) {
					temp += "拾";
				} else if (i == input.length() - 3) {
					temp += "佰";
				} else if (i == input.length() - 4) {
					temp += "仟";
				} else if (i == input.length() - 5) {
					temp += "萬";
				} else if (i == input.length() - 6) {
					temp += "拾";
				} else if (i == input.length() - 7) {
					temp += "佰";
				}
				ans = temp + ans;//temp代表中間結果相加存下來
			} else if (temp.equals("零")) {
				if (i == input.length() - 1) {
					temp += "元";
					ans = temp + ans;// ans = ans +temp是不一樣的結果;
				} else if (i == input.length() - 5) {
					ans = "萬" + ans;
				} else if (ans.charAt(0) != '零') {// ans.charAt(0)目前讀到的最前面的一位是不是零
					ans = temp + ans;
				}
			}
		}
		System.out.println(ans + "整");
		scanner.close();
	}
}

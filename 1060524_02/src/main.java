import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numbAddrArray[] = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29,
				32, 30, 31, 33 };
		String address[] = { "臺北市", "臺中市", "基隆市", "臺南市", "高雄市", "新北市", "宜蘭縣", "桃園市", "嘉義市", "新竹縣", "苗栗縣", "臺中縣", "南投縣",
				"彰化縣", "新竹市", "雲林縣", "嘉義縣", "臺南縣", "高雄縣", "屏東縣", "花蓮縣", "臺東縣", "金門縣", "澎湖縣", "陽明山管理局", "連江縣" };

		System.out.println("請輸入身分證字號");
		String id = scanner.nextLine();// 用字串讀入
		char inputArray[] = id.toCharArray();

		if ((inputArray[0] >= 'A' && inputArray[0] <= 'Z') && (inputArray[1] == '1' || inputArray[1] == '2')
				&& inputArray.length == 10) {
			int temp = numbAddrArray[inputArray[0] - 'A'];

			int tenDigits = temp / 10;
			int digits = temp % 10;
			int sum = tenDigits + digits * 9;

			int temp2 = 0;
			for (int i = 8, j = 1; i >= 1 && j <= 8; i--, j++) {
				temp2 += (inputArray[j] - '0') * i;
			}
			temp2 += inputArray[9] - '0';

			if ((temp2 + sum) % 10 == 0) {
				System.out.println("true!!");
				System.out.println(address[inputArray[0] - 'A']);
				if (inputArray[1] == '1') {
					System.out.println("男性");
				} else if (inputArray[1] == '2') {
					System.out.println("女性");
				}
			} else {
				System.out.println("false!!");
			}
		} else {
			System.out.println("false!!");
		}
	}
}

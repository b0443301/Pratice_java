public class main {
	static void Prime() {
		Boolean isPrime = false;
		// 1不是質數
		System.out.println(2 + "是質數");
		// 從3開始判斷
		for (int i = 3; i < 100; i++) {
			// 因數從2到要判斷的值本身
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					//紀錄下來,能被整除就不是質數
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		Prime();
	}
}

public class main {
	public static void main(String args[]) {
		double ans = count(1, 0.1, 10, 0);
		System.out.println("答案:" + ans + 1);// 零階層為1
	}

	// 計算次方,不用Math.pow(a,b)
	static double power(double sum, double x, int count) {
		if (count > 0) {
			sum = x * sum;
			// System.out.println(sum + "\t" + x + "\t" + count);
			count--;
			sum = power(sum, x, count);
		}
		return sum;
	}

	// 相除帶入參數跟上面帶入參數位置相同
	static int divide(int sum, int count) {
		//從要做的數字開始減EX:9!--->1!
		if (count > 0) {
			sum = count * sum;
			// System.out.println(sum + "\t" + count);
			count--;
			//呼叫自己(相當於for)
			sum = divide(sum, count);
		}
		return sum;
	}

	static double count(int sum, double x, int count, double ans) {
		if (count > 0) {
			ans += power(sum, x, count) / divide(sum, count);
			// System.out.println(ans + "\t" + count + "\t" + sum);
			count--;
			ans = count(sum, x, count, ans);
		}
		return ans;
	}
}

// public class main {
// public static void main(String args[]) {
// //add(0, 1);
// }

// static void add(int num, int count) {
// if (num < 10000) {
// System.out.println(num + "\t" + count);
// num = num + count;
// count++;
// add(num, count);
// }
// }
// }


public class main {
	public static void main(String args[]) {
		//第一位數字1~3
		for (int i = 1; i <= 3; i++) {
			//第二位數字1~3
			for (int j = 1; j <= 3; j++) {
				//第一位數字==第二位數字
				if (i == j)
					//繼續做離自己做進迴圈的事EX:繼續判斷如果第一位數字==第二位數字if (i == j)
					continue;
				//第三位數字
				for (int k = 1; k <= 3; k++) {
					//第三位數字==第一位數字或第三位數字==第二位數字
					if ((k == i) || (k == j))
						continue;
					System.out.println(i * 100 + j * 10 + k);
				}
			}
		}
	}
}

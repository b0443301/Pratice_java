
public class main {
	public static void main(String args[]) {
		int i = 1;
		while (i <= 3) {// i控制最外面的迴圈1,2,3,4,5,6,7,8,9
			int j = 1;// 清空
			while (j <= 9) {// j控制裡面1~9
				System.out.print((i * 3) - 2 + "*" + j + "=" + ((i * 3 - 2) * j) + "\t");// 推導關係1*1=1
				System.out.print((i * 3) - 1 + "*" + j + "=" + ((i * 3 - 1) * j) + "\t");// 推導關係2*1=2
				System.out.print((i * 3) + "*" + j + "=" + (i * 3 * j) + "\n");// 推導關係3*1=3
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
}
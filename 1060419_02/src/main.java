import java.util.Scanner;

//字串轉字元陣列(輸入輸出都是字串,中間運算字元陣列)
public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入要排的英文字母");
		String input = scanner.nextLine();// 用字串讀入
		char inputArray[] = input.toCharArray();// 字串轉成字元陣列
		// char inputArray[] = new
		// char[input.length()];//我們要對inputArray作事情,先new出來再對
		// for (int i = 0; i < inputArray.length; i++)
		// {//用for迴圈一個一個用字元型態放到inputArray.length上
		// inputArray[i] = input.charAt(i);//把input取字元位置一個一個對應到inputArray[i]
		// }
		// 作交換時,不要認為for迴圈可以邊輸入邊輸出,迴圈輸出要用另外的for輸出
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < i; j++) {
				if (inputArray[i] < inputArray[j]) {
					// System.out.println("查看裡面交換訊息");
					// System.out.println(inputArray[i] + "\t" + inputArray[j]);
					char temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					// System.out.println("最後交換的結果");
					// System.out.println(inputArray[i] + "\t" + inputArray[j]);
				}
			}
		}

		input = String.valueOf(inputArray);// 字元陣列轉回字串的方式
		System.out.println(input);
		// for(int i = 0; i < inputArray.length; i++){// 字元陣列轉回字串的方式
		// System.out.print(inputArray[i]);
		// }
		scanner.close();
	}
}

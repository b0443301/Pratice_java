import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String args[]) {
		try {
			String file3 = "C:\\Users\\user\\Desktop\\file3.txt";
			FileWriter fw = new FileWriter(file3);
			

			for (int j = 0; j < 10; j++) {
				int[] random = new int[6];
				for (int i = 0; i < 6; i++) {
					random[i] = (int) (Math.random() * 49 + 1);
				}
				for (int i = 0; i < 6; i++) {
					fw.write(String.valueOf(random[i]) + "\t");
				}
				// fw.write("\n");// Linux 換行符
				fw.write("\r\n");// Windows 換行符
				fw.flush();
			}
			System.out.println("輸出成功");
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IO錯誤");
		}
	}
}

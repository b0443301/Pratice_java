import java.io.DataOutputStream;
import java.io.FileOutputStream;
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
				// fw.write("\n");// Linux �����
				fw.write("\r\n");// Windows �����
				fw.flush();
			}
			System.out.println("��X���\");
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IO���~");
		}
	}
}
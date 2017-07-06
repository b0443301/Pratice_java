import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {
	/*
	 * 20170706 BY MSJ 主要類別 進入點 負責運算
	 */
	public static void main(String args[]) {
		try {
			String OLD = "C:\\Users\\user\\Desktop\\OLD.txt";
			String NEWS = "C:\\Users\\user\\Desktop\\NEWS.txt";
			// FileReader fr = new FileReader(OLD);

			// 讀入一個檔案裡整個字串(將整個檔案讀入)從檔案路徑OLD讀入全部的字(先用Bytes陣列存)
			byte fileBytes[] = Files.readAllBytes(Paths.get(OLD));
			// 再轉萬國碼(中文英文數字)讓我們讀
			String text = new String(fileBytes, StandardCharsets.UTF_8);
			// 37個字包含\r\n
			System.out.println("檔案裡有" + text.length() + "字");
			text = text.replaceAll("48", "72");
			// 存檔(寫入另一個檔案)
			FileWriter fw = new FileWriter(NEWS);
			fw.write(text);
			System.out.println(text);
			// // file1.length()
			// int c, number = 0;
			// while ((c = in0.read()) != -1) {// 把他new出一個副本對它做是

			// out.write(72);
			// out.write(c);
			// }

			// in0.close();
			//
			// // sis.close();
			// out.close();
			fw.flush();// 切記寫檔一定要fw.flush()!!!!!!!(很重要)
			fw.close();// 切記寫檔一定要fw.close()!!!!!!!(很重要)
			System.out.println("檔案合併完成");
		} catch (Exception ex) {
			System.out.println("檔案合併沒成功");
		}
	}
}

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {
	/*
	 * 20170706 BY MSJ �D�n���O �i�J�I �t�d�B��
	 */
	public static void main(String args[]) {
		try {
			String OLD = "C:\\Users\\user\\Desktop\\OLD.txt";
			String NEWS = "C:\\Users\\user\\Desktop\\NEWS.txt";
			// FileReader fr = new FileReader(OLD);

			// Ū�J�@���ɮ׸̾�Ӧr��(�N����ɮ�Ū�J)�q�ɮ׸��|OLDŪ�J�������r(����Bytes�}�C�s)
			byte fileBytes[] = Files.readAllBytes(Paths.get(OLD));
			// �A��U��X(����^��Ʀr)���ڭ�Ū
			String text = new String(fileBytes, StandardCharsets.UTF_8);
			// 37�Ӧr�]�t\r\n
			System.out.println("�ɮ׸̦�" + text.length() + "�r");
			text = text.replaceAll("48", "72");
			// �s��(�g�J�t�@���ɮ�)
			FileWriter fw = new FileWriter(NEWS);
			fw.write(text);
			System.out.println(text);
			// // file1.length()
			// int c, number = 0;
			// while ((c = in0.read()) != -1) {// ��Lnew�X�@�Ӱƥ��復���O

			// out.write(72);
			// out.write(c);
			// }

			// in0.close();
			//
			// // sis.close();
			// out.close();
			fw.flush();// ���O�g�ɤ@�w�nfw.flush()!!!!!!!(�ܭ��n)
			fw.close();// ���O�g�ɤ@�w�nfw.close()!!!!!!!(�ܭ��n)
			System.out.println("�ɮצX�֧���");
		} catch (Exception ex) {
			System.out.println("�ɮצX�֨S���\");
		}
	}
}
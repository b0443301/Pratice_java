import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class combineFiles {
	public static void main(String args[]) {
		try {
			String file1 = "C:\\Users\\user\\Desktop\\file1.txt";
			String file2 = "C:\\Users\\user\\Desktop\\file2.txt";
			String file3 = "C:\\Users\\user\\Desktop\\file3.txt";

			InputStream in0 = new FileInputStream(file1);
			InputStream in1 = new FileInputStream(file2);

			//SequenceInputStream sis = new SequenceInputStream(in0, in1);
			FileOutputStream out = new FileOutputStream(file3);
			
			//file1.length()
			int c;
			while ((c = in0.read()) != -1) {//��Lnew�X�@�Ӱƥ��復���O
				out.write(c);
			}
			while ((c = in1.read()) != -1) {
				out.write(c);
			}
			
			in0.close();
			in1.close();
			//sis.close();
			out.close();
			System.out.println("�ɮצX�֧���");
		} catch (Exception ex) {
			System.out.println("�ɮצX�֨S���\");
		}
	}
}

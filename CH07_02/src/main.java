import java.util.Scanner;

public class main {
	public class Student {
		String id = "";
		String Sname = "";
		int ChineseScore = 0;
		// for(int )
		int EnglishScore = 0;
		int BccScore = 0;

		int GetAvg() {
			int Avg = (ChineseScore + EnglishScore + BccScore) / 3;
			return Avg;
		}

	}

	public static void main(String args[]) {

		System.out.println("本題就這樣");

	}
}

public class main {
	static int FahToCels(int input) {
		int celsius = (input - 32) * 5 / 9;
		return celsius;
	}

	static int CelsToFah(int input) {
		// �ؤ�=���*9/5+32
		int fah = input * 9 / 5 + 32;
		return fah;
	}

	static int CelsToKay(int input) {
		int kay = input + 273;
		return kay;
	}

	static int KayToCels(int input) {
		int celsius = input - 273;
		return celsius;
	}

	static int FahToKay(int input) {
		int kay = (input - 32) * 5 / 9 + 273;
		return kay;
	}

	static int KayToFah(int input) {
		int fah = (input - 273) * 9 / 5 + 32;
		return fah;
	}

	public static void main(String args[]) {
		int input = -40;
		System.out.println("�ؤ������  " + FahToCels(input));
		System.out.println("�����ؤ�  " + CelsToFah(input));
		System.out.println("�ͤ������  " + KayToCels(input));
		System.out.println("�����ͤ� " + CelsToKay(input));
		System.out.println("�ؤ���ͤ� " + FahToKay(input));
		System.out.println("�ͤ���ؤ� " + KayToFah(input));
	}
}

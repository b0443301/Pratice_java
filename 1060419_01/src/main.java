public class main {
	// input參數帶入華氏
	static int FahToCels(int input) {
		int celsius = (input - 32) * 5 / 9;
		return celsius;
	}

	// input參數帶入攝氏
	static int CelsToFah(int input) {
		// 華氏=攝氏*9/5+32
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
		// 彈性寫法(比較好)把input拉出來,好處只要改一個值全部都改
		int input = -40;
		System.out.println("華氏轉攝氏  " + FahToCels(input));
		System.out.println("攝氏轉華氏  " + CelsToFah(input));
		System.out.println("凱氏轉攝氏  " + KayToCels(input));
		System.out.println("攝氏轉凱氏 " + CelsToKay(input));
		System.out.println("華氏轉凱氏 " + FahToKay(input));
		System.out.println("凱氏轉華氏 " + KayToFah(input));
	}
}

import java.util.Scanner;

class Carry {
	public enum Data {
		Binary(2), Octal(8), Hex(16);

		private int value;

		private Data(int value) {// 建構子與類別名要一樣,不會回傳類別
			this.value = value;
		}

		public int getValue() {// class才要寫java的enum功能不像enum
			return this.value;
		}
	}

	public static void main(String[] args) {
		System.out.println("二進位的常數值" + Carry.Data.Binary.value);
		System.out.println("八進位的常數值" + Carry.Data.Octal.value);
		System.out.println("十六進位的常數值" + Carry.Data.Hex.value);
	}
}
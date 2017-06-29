import java.util.Scanner;

class Carry {
	public enum Data {
		Binary(2), Octal(8), Hex(16);

		private int value;

		private Data(int value) {// �غc�l�P���O�W�n�@��,���|�^�����O
			this.value = value;
		}

		public int getValue() {// class�~�n�gjava��enum�\�ण��enum
			return this.value;
		}
	}

	public static void main(String[] args) {
		System.out.println("�G�i�쪺�`�ƭ�" + Carry.Data.Binary.value);
		System.out.println("�K�i�쪺�`�ƭ�" + Carry.Data.Octal.value);
		System.out.println("�Q���i�쪺�`�ƭ�" + Carry.Data.Hex.value);
	}
}
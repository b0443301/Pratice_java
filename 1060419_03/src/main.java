public class main {
	static void Prime() {
		Boolean isPrime = false;
		// 1���O���
		System.out.println(2 + "�O���");
		// �q3�}�l�P�_
		for (int i = 3; i < 100; i++) {
			// �]�Ʊq2��n�P�_���ȥ���
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					//�����U��,��Q�㰣�N���O���
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		Prime();
	}
}

import java.util.Scanner;

//�r����r���}�C(��J��X���O�r��,�����B��r���}�C)
public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�п�J�n�ƪ��^��r��");
		String input = scanner.nextLine();// �Φr��Ū�J
		char inputArray[] = input.toCharArray();// �r���ন�r���}�C
		// char inputArray[] = new
		// char[input.length()];//�ڭ̭n��inputArray�@�Ʊ�,��new�X�ӦA��
		// for (int i = 0; i < inputArray.length; i++)
		// {//��for�j��@�Ӥ@�ӥΦr�����A���inputArray.length�W
		// inputArray[i] = input.charAt(i);//��input���r����m�@�Ӥ@�ӹ�����inputArray[i]
		// }
		// �@�洫��,���n�{��for�j��i�H���J���X,�j���X�n�Υt�~��for��X
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < i; j++) {
				if (inputArray[i] < inputArray[j]) {
					// System.out.println("�d�ݸ̭��洫�T��");
					// System.out.println(inputArray[i] + "\t" + inputArray[j]);
					char temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					// System.out.println("�̫�洫�����G");
					// System.out.println(inputArray[i] + "\t" + inputArray[j]);
				}
			}
		}

		input = String.valueOf(inputArray);// �r���}�C��^�r�ꪺ�覡
		System.out.println(input);
		// for(int i = 0; i < inputArray.length; i++){// �r���}�C��^�r�ꪺ�覡
		// System.out.print(inputArray[i]);
		// }
		scanner.close();
	}
}
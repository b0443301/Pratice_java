
public class main {

	public static void main(String args[]) {
		try {
			int ans = 1 / 0;
			// if(ans!=num1+num2){
			// throw new ArithmeticException();
			// }
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println("�ҥ~�B�z");
		}
		try {
			int[] array = {31, 12, 45, 78, 56, 78 };
			array[100] = 23;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("�}�C���޿��~");
		}
		try{
			int[] i=new int[-3];
		}catch(NegativeArraySizeException e){
			e.printStackTrace();
			System.out.println("�}�C���ޤ����t��");
		}
	}
}

public class main {
	static class Product {
		String id = "";
		String PName = "";
		int Price = 0;

		// void SetData(String a, String b, int c) throws ProductException {
		// if (c < 0) {
		// throw new ProductException();
		// }
		//
		// id = a;
		// PName = b;
		// Price = c;
		// }
		void SetData(String id, String PName, int Price) throws ProductException {
			if (Price < 0) {
				throw new ProductException();// �ߥX�ҥ~
			}

			this.id = id;// �ۤv��id=�O�H�~���a�Ӫ�id
			this.PName = PName;// �ۤv��PName=�O�H�~���a�Ӫ�PName
			this.Price = Price;// �ۤv��Price=�O�H�~���a�Ӫ�Price
		}
	}

	static class ProductException extends Exception {
		// �w�],�S���n�мg,�N�����g�غc�l,�ۤv�w�qProductException,
		// ProductException�~�өҦ�Exception�\��
	}

	public static void main(String args[]) {
		Product product = new Product();
		try {
			product.SetData("123", "123", -1);
		} catch (ProductException e) {
			e.printStackTrace();
			System.out.println("�ߥX���~!");
		}
	}
}
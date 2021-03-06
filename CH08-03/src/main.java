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
				throw new ProductException();// 拋出例外
			}

			this.id = id;// 自己的id=別人外面帶來的id
			this.PName = PName;// 自己的PName=別人外面帶來的PName
			this.Price = Price;// 自己的Price=別人外面帶來的Price
		}
	}

	static class ProductException extends Exception {
		// 預設,沒有要覆寫,就不必寫建構子,自己定義ProductException,
		// ProductException繼承所有Exception功能
	}

	public static void main(String args[]) {
		Product product = new Product();
		try {
			product.SetData("123", "123", -1);
		} catch (ProductException e) {
			e.printStackTrace();
			System.out.println("拋出錯誤!");
		}
	}
}
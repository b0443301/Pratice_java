
public class main {
	static class Product {
		String id = "";
		String PName = "";
		int Price = 0;

		void SetData(String id, String PName, int Price) throws ProductException {
			if (Price < 0) {
				throw new ProductException();
			}

			this.id = id;
			this.PName = PName;
			this.Price = Price;
		}
	}

	
	static class ProductException extends Exception {
		public String toString() {
			return "ProductException";
		}

		public String getMessage() {
			return "產品錯誤";
		}

//		public void ShowSourceException() {
//			
//		}
	}

	public static void main(String args[]) {
		Product product = new Product();
		try {
			product.SetData("456", "456", -1);
		} catch (ProductException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();//ShowSourceException()可以被printStackTrace()取代
			System.out.println("拋出例外");
		}
	}
}

public class main {
	public static int GetMax(int num1, int num2) {
		int max;
		if (num1 > num2)
			max = num1;
		else
			max = num2;
		return max;

	}

	public static int GetMax(int num1, int num2, int num3) {
		int max = 0;
		if (num1 >= num2 && num1 >= num3)
			max = num1;
		else if (num2 >= num1 && num2 >= num3)
			max = num2;
		else if (num3 >= num1 && num3 >= num2)
			max = num3;
		return max;
	}

	public static int GetMax(int arrayMax[]) {

		int max = arrayMax[0];
		for (int i = 0; i < arrayMax.length; i++) {
			if (max < arrayMax[i])
				max = arrayMax[i];
		}
		return max;

	}

	public static void main(String args[]) {
		int a1 = 5;
		int b1 = 10;
		int c1 = GetMax(a1, b1);
		System.out.println(c1);

		int a2 = 5;
		int b2 = 10;
		int c2 = 45;
		int d2 = GetMax(a2, b2, c2);
		System.out.println(d2);
		
		int arrayMax[]={0,11,22,33,44,55,66};
		  System.out.print(GetMax(arrayMax)+"\n");
		
		

	}

	
}
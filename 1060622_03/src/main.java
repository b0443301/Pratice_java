
public class main {
	public static void main(String args[]) {
		//�Ĥ@��Ʀr1~3
		for (int i = 1; i <= 3; i++) {
			//�ĤG��Ʀr1~3
			for (int j = 1; j <= 3; j++) {
				//�Ĥ@��Ʀr==�ĤG��Ʀr
				if (i == j)
					//�~�����ۤv���i�j�骺��EX:�~��P�_�p�G�Ĥ@��Ʀr==�ĤG��Ʀrif (i == j)
					continue;
				//�ĤT��Ʀr
				for (int k = 1; k <= 3; k++) {
					//�ĤT��Ʀr==�Ĥ@��Ʀr�βĤT��Ʀr==�ĤG��Ʀr
					if ((k == i) || (k == j))
						continue;
					System.out.println(i * 100 + j * 10 + k);
				}
			}
		}
	}
}
